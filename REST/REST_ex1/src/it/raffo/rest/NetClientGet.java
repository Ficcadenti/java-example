package it.raffo.rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import it.raffo.rest.bean.User;



public class NetClientGet {
	private static final String USER_AGENT = "Mozilla/5.0";
	private static String cookies;

	public static Map<String, List<String>> getQueryParams(String url) {
		try {
			Map<String, List<String>> params = new HashMap<String, List<String>>();
			String[] urlParts = url.split("\\?");
			if ((urlParts.length > 1) || (!url.isEmpty()) ) 
			{
				String query = "";

				if(urlParts.length > 1)
				{
					query=urlParts[1];
				}else
				{
					query=url;
				}

				for (String param : query.split("&"))
				{
					String[] pair = param.split("=");
					String key = URLDecoder.decode(pair[0], "UTF-8");
					String value = "";
					if (pair.length > 1) 
					{
						value = URLDecoder.decode(pair[1], "UTF-8");
					}

					List<String> values = params.get(key);

					if (values == null) 
					{
						values = new ArrayList<String>();
						params.put(key, values);
					}
					values.add(value);
				}
			}

			return params;
		} catch (UnsupportedEncodingException ex) {
			throw new AssertionError(ex);
		}
	}

	public static void main(String[] args) {
		test_get();
		
//		test_post();
		
		//		String param="localhost://test/pippo?nome=raffaele&cognome=ficcadenti&email=r.ficcadenti@e-tech.net&email=raffaele.ficcadenti@gmail.com";
		//		System.out.println(param);
		//		Map<String, List<String>> p=getQueryParams(param);
		//
		//		for (Map.Entry<String,  List<String>> entry : p.entrySet()) {
		//			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		//		}
	}

	public static void test_get()
	{
		System.out.println("Test Rest Client GET");
		try {

			//URL url = new URL("http://localhost:8080/testREST/api/test_get/valeria/greco/");
			URL url = new URL("http://localhost:8080/springmvc/test_gson");
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			conn.disconnect();

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void test_post()
	{

		System.out.println("Test Rest Client POST");
		try {

			String url="http://localhost:8080/testREST/api/test_post";
			HttpClient client = HttpClientBuilder.create().build();
			HttpPost post = new HttpPost(url);
			ArrayList<NameValuePair> postParameters;

			// add header
			post.setHeader("Host", "localhost");
			post.setHeader("User-Agent", USER_AGENT);
			post.setHeader("Accept","application/json,text/html,text/plain,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
			post.setHeader("Accept-Language", "en-US,en;q=0.5");
			post.setHeader("Cookie", getCookies());
			post.setHeader("Connection", "keep-alive");
			post.setHeader("Referer", "https://accounts.google.com/ServiceLoginAuth");
			post.setHeader("Content-Type", "application/json");


			postParameters = new ArrayList<NameValuePair>();
			postParameters.add(new BasicNameValuePair("param1", "param1_value"));
			postParameters.add(new BasicNameValuePair("param2", "param2_value"));

			post.setEntity(new UrlEncodedFormEntity(postParameters, "UTF-8"));


			HttpResponse response = client.execute(post);

			int responseCode = response.getStatusLine().getStatusCode();

			if (responseCode != 200) {
				throw new RuntimeException("Failed : HTTP error code : "+responseCode);
			}

			System.out.println("\nSending 'POST' request to URL : " + url);
			//System.out.println("Post parameters : " + postParams);
			System.out.println("Response Code : " + responseCode);

			BufferedReader rd = new BufferedReader(
					new InputStreamReader(response.getEntity().getContent()));

			StringBuffer result = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}

			System.out.println("Response: " + result);
			Gson gson = new Gson();
			User u = gson.fromJson( result.toString(), User.class ); 

			System.out.println("ID: "+u.getId());
			System.out.println("Nome: "+u.getName());
			System.out.println("Cognome: "+u.getSurname());
			System.out.println("Compleanno: "+u.getBirtday());

			JsonObject jsonObject = gson.fromJson( result.toString(), JsonObject.class);
			jsonObject.get("Nome"); // returns a JsonElement for that name

			System.out.println("ID: "+jsonObject.get("id").getAsInt());
			System.out.println("Nome: "+jsonObject.get("name").getAsString());
			System.out.println("Cognome: "+jsonObject.get("surname").getAsString());
			System.out.println("Compleanno: "+jsonObject.get("birtday").getAsString());


		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
	}

	private static String getCookies() {
		// TODO Auto-generated method stub
		return cookies;
	}


}
