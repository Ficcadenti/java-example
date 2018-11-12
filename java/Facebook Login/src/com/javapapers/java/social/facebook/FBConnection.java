package com.javapapers.java.social.facebook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLConnection;

import org.apache.catalina.util.URLEncoder;
import org.apache.tomcat.util.net.URL;

public class FBConnection
{
	public static final String	FB_APP_ID		= "1072608142896017";
	public static final String	FB_APP_SECRET	= "4dad302751dd820cf55b364ef12c2f34";
	public static final String	REDIRECT_URI	= "https://localhost:8443/HRPDemo/pages/login.xhtml";

	static String				accessToken		= "";

	public String getAccessToken(String code)
	{
		if ("".equals(accessToken))
		{
			URL fbGraphURL;
			try
			{
				fbGraphURL = new URL(this.getFBGraphUrl(code));
			}
			catch (MalformedURLException e)
			{
				e.printStackTrace();
				throw new RuntimeException("Invalid code received " + e);
			}
			URLConnection fbConnection;
			StringBuffer b = null;
			try
			{
				fbConnection = fbGraphURL.openConnection();
				BufferedReader in;
				in = new BufferedReader(new InputStreamReader(fbConnection.getInputStream()));
				String inputLine;
				b = new StringBuffer();
				while ((inputLine = in.readLine()) != null)
				{
					b.append(inputLine + "\n");
				}
				in.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
				throw new RuntimeException("Unable to connect with Facebook " + e);
			}

			accessToken = b.toString();
			if (accessToken.startsWith("{"))
			{
				throw new RuntimeException("ERROR: Access Token Invalid: " + accessToken);
			}
		}
		return accessToken;
	}

	public String getFBAuthUrl()
	{
		String fbLoginUrl = "";
		try
		{
			fbLoginUrl = "http://www.facebook.com/dialog/oauth?" + "client_id=" + FBConnection.FB_APP_ID
					+ "&redirect_uri=" + URLEncoder.encode(FBConnection.REDIRECT_URI, "UTF-8") + "&scope=email";
		}
		catch (UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}
		return fbLoginUrl;
	}

	public String getFBGraphUrl(String code)
	{
		String fbGraphUrl = "";
		try
		{
			fbGraphUrl = "https://graph.facebook.com/oauth/access_token?" + "client_id=" + FBConnection.FB_APP_ID
					+ "&redirect_uri=" + URLEncoder.encode(FBConnection.REDIRECT_URI, "UTF-8") + "&client_secret="
					+ FB_APP_SECRET + "&code=" + code;
		}
		catch (UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}
		return fbGraphUrl;
	}
}
