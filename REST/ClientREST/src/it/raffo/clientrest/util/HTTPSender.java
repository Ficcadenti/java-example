package it.raffo.clientrest.util;

//http://www-sop.inria.fr/marelle/Laurent.Thery/lsp/pattern.html

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;

public class HTTPSender
{
	private static final Logger	log				= LogManager.getLogger();
	private String				responseBody	= null;
	private int					statusCode		= -1;
	private String				token			= "";

	public HTTPSender()
	{

	}

	public HttpResponse doPost(String url, String str)
	{
		HttpResponse response = null;
		this.responseBody = null;
		this.statusCode = -1;

		String encodeBase64 = "SSITEL.001";

		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpPost request = new HttpPost(url);

		try
		{

			JSONObject objJson = new JSONObject();

			objJson.put("idUser", str);

			String jsonString = objJson.toString();

			System.out.println("jsonString = " + jsonString);
			HttpEntity entity = new ByteArrayEntity(jsonString.getBytes("UTF-8"));

			request.addHeader("Authorization", "BASIC " + new String(encodeBase64));
			request.addHeader("content-type", "application/json");
			request.addHeader("token", this.token);
			request.setEntity(entity);
			response = httpClient.execute(request);
			this.statusCode = response.getStatusLine().getStatusCode();
			this.responseBody = EntityUtils.toString(response.getEntity());
		}
		catch (UnsupportedEncodingException e)
		{
			log.error(e.getMessage(), e);
		}
		catch (ClientProtocolException e)
		{
			log.error(e.getMessage(), e);
		}
		catch (IOException e)
		{
			log.error(e.getMessage(), e);
		}
		finally
		{
			httpClient.getConnectionManager().shutdown();
		}

		return response;
	}

	public String getResponseBody()
	{
		return this.responseBody;
	}

	public int getStatusCode()
	{
		return this.statusCode;
	}

	public String getToken()
	{
		return this.token;
	}

	public void login(String url, String str)
	{
		HttpResponse response = this.doPost(url, str);

		if (response != null)
		{
			try
			{
				Header[] tokens = response.getHeaders("Token");
				if (tokens != null)
				{
					this.setToken(tokens[0].getValue());
				}
			}
			catch (ParseException e)
			{
				log.error(e.getMessage(), e);
			}

		}
	}

	public void setResponseBody(String responseBody)
	{
		this.responseBody = responseBody;
	}

	public void setStatusCode(int statusCode)
	{
		this.statusCode = statusCode;
	}

	public void setToken(String token)
	{
		this.token = token;
	}

	public void validateToken(String url)
	{
		HttpResponse response = this.doPost(url, "");
	}

}