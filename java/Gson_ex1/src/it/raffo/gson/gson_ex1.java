package it.raffo.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class gson_ex1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.printf("Gson - Google JSON \n");

		try
		{
			String pippo = null;
			pippo.equals("");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		int a = 2;
		int b = 5;
		int risultato = (a * (b++));
		System.out.println(risultato);
		System.out.println(b);

		// SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
		//
		// User user1 = new User();
		// user1.setId(1);
		// user1.setName("Luca");
		// user1.setSurname("Ficcadenti");
		// try {
		// user1.setBirtday(ft.parse("1976-11-13"));
		// } catch (ParseException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// User user2 = new User();
		// user2.setId(2);
		// user2.setName("Raffaele");
		// user2.setSurname("Ficcadenti");
		// try {
		// user2.setBirtday(ft.parse("1976-08-14"));
		// } catch (ParseException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// List<User> usr = new ArrayList<User>();
		// usr.add(user1);
		// usr.add(user2);
		//
		//
		// Gson gson = new GsonBuilder().setPrettyPrinting().create();
		// String usersJson = gson.toJson(usr);
		// System.out.println(usersJson);
		//
		// Type listType = new TypeToken<ArrayList<User>>(){}.getType();
		//
		// List<User> u = gson.fromJson(usersJson, listType);
		//
		// for(User elem: u)
		// {
		// System.out.println("ID: "+elem.getId());
		// System.out.println("Nome: "+elem.getName());
		// System.out.println("Cognome: "+elem.getSurname());
		// System.out.println("Compleanno: "+elem.getBirtday());
		// }

	}

	public static String toPrettyFormat(String jsonString)
	{
		JsonParser parser = new JsonParser();
		JsonObject json = parser.parse(jsonString).getAsJsonObject();

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String prettyJson = gson.toJson(json);

		return prettyJson;
	}

}
