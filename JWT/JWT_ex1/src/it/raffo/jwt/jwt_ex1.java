package it.raffo.jwt;

import java.security.Key;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;

public class jwt_ex1
{

	// CREO LA CHIAVE SEGRETA CONOSCIUTA SOLO DAL SERVER
	private static final Key	secret				= MacProvider.generateKey(SignatureAlgorithm.HS256);
	private static final byte[]	secretBytes			= secret.getEncoded();
	private static final String	base64SecretBytes	= Base64.getEncoder().encodeToString(secretBytes);

	public static void main(String[] args)
	{
		Date dNow = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		Calendar c = Calendar.getInstance();
		c.setTime(dNow);
		c.add(Calendar.HOUR, 3);
		Date dExp = c.getTime();
		System.out.println("Data attuale     : " + sdf.format(dNow));
		System.out.println("Data di scadenza : " + sdf.format(dExp));

		String compactJws = Jwts.builder().setId("testuserid").setIssuedAt(dNow).setExpiration(dExp).setSubject("Joe")
				.setAudience("testAudienceId").signWith(SignatureAlgorithm.HS256, base64SecretBytes)
				.setHeaderParam("typ", "JWT").compact();

		System.out.println(compactJws);

		verificaToken(compactJws);

		int x = 10;
		System.out.println("10 << 1=" + (x << 1));

		int y = 1000;
		int count = 0;
		for (count = 0; y != 0; y >>= 1)
		{
			count++;
		}

		System.out.println("Count=" + count);

	}

	public static void verificaToken(String compactJws)
	{
		try
		{
			Claims claims = Jwts.parser().setSigningKey(base64SecretBytes).parseClaimsJws(compactJws).getBody();
			System.out.println("---------------------------");
			System.out.println("ID         : " + claims.getId());
			System.out.println("Subject    : " + claims.getSubject());
			System.out.println("Issuer     : " + claims.getIssuer());
			System.out.println("Expiration : " + claims.getExpiration());
			System.out.println("Audience   : " + claims.getAudience());
		}
		catch (MalformedJwtException e)
		{
			System.out.println("Token non valido !!!!");
		}
	}

}
