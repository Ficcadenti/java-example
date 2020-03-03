package it.raffo.userapp.controller;

import java.security.Key;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.json.JSONObject;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.impl.crypto.MacProvider;

public class Jwt
{
	private static final Logger	log					= Logger.getLogger(Jwt.class);
	public static Jwt			instance			= null;

	// CREO LA CHIAVE SEGRETA CONOSCIUTA SOLO DAL SERVER
	private static final Key	secret				= MacProvider.generateKey(SignatureAlgorithm.HS256);
	private static final byte[]	secretBytes			= secret.getEncoded();
	private static final String	base64SecretBytes	= Base64.getEncoder().encodeToString(secretBytes);

	public static Jwt getIstance()
	{
		if (instance == null)
		{
			return instance = new Jwt();
		}
		else
		{
			return instance;
		}
	}

	public String generaToken(String userid)
	{
		// genero le date per la validità del token
		log.info("Genero il TOKEN");
		Date dNow = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		Calendar c = Calendar.getInstance();
		c.setTime(dNow);
		c.add(Calendar.HOUR, 3);
		Date dExp = c.getTime();

		JSONObject datiClaim = new JSONObject();
		datiClaim.put("id", -1);
		datiClaim.put("id_contratto", 1);

		final Map<String, Object> tokenData = new HashMap<>();
		tokenData.put("username", "pippo");
		tokenData.put("password", "pluto");
		// genero il token
		JwtBuilder jwtToken = Jwts.builder().claim("JSON", datiClaim.toString()).setId(userid).setIssuedAt(dNow).setExpiration(dExp).setSubject("Joe").setAudience("testAudienceId").signWith(SignatureAlgorithm.HS256, base64SecretBytes)
				.setHeaderParam("typ", "JWT");

		String JWT = jwtToken.compact();
		return JWT;
	}

	public boolean verificaToken(String compactJws)
	{
		try
		{
			Claims claims = Jwts.parser().setSigningKey(base64SecretBytes).parseClaimsJws(compactJws).getBody();
			log.info("---------------------------");
			log.info("ID         : " + claims.getId());
			log.info("Subject    : " + claims.getSubject());
			log.info("Issuer     : " + claims.getIssuer());
			log.info("Expiration : " + claims.getExpiration());
			log.info("Audience   : " + claims.getAudience());
			log.info("claim   : " + claims.get("JSON"));

			log.info("Token valido!!!!");
			return true;
		}
		catch (MalformedJwtException e)
		{
			log.info("Token non valido MalformedJwtException!!!!");
			return false;
		}
		catch (SignatureException e)
		{
			log.info("Token non valido SignatureException!!!!");
			return false;
		}
	}
}
