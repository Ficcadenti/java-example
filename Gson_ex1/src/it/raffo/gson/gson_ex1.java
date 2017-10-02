package it.raffo.gson;

import it.raffo.gson.bean.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class gson_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Gson - Google JSON \n");
		
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
		
		User user = new User();
		user.setId(1);
		user.setName("Luca");
		user.setSurname("Santaniello");
		try {
			user.setBirtday(ft.parse("1976-08-14"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Gson gson = new Gson();     
		String userJson = gson.toJson(user);        
		System.out.println(userJson);
		
		User user1 = gson.fromJson(userJson, User.class);
		System.out.println(user1.getId());
		System.out.println(user1.getName());
		System.out.println(user1.getSurname());
		System.out.println(user1.getBirtday());

	}

}
