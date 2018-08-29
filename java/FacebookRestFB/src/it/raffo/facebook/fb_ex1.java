package it.raffo.facebook;

import java.util.List;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.Version;
import com.restfb.types.User;

public class fb_ex1
{

	public static final String	MY_APP_ACCESS_TOKEN	= "637929733244467|MDd61mqnDNlLlohcSqoIA0i5FeU";
	public static final String	MY_APP_SECRET		= "56c972f321f09bec8cdaadc8c681ad85";
	public static final String	MY_APP_ID			= "637929733244467";

	public static void main(String[] args)
	{

		FacebookClient facebookClient30 = new DefaultFacebookClient(MY_APP_ACCESS_TOKEN, MY_APP_SECRET,
				Version.VERSION_3_0);

		User u1 = facebookClient30.fetchObject("me", User.class, Parameter.with("fields", "email,name,gender"));
		// Page page = facebookClient30.fetchObject("cocacola", Page.class);

		// System.out.println("Page ID: " + page.getId());
		System.out.println("Nome: " + u1.getName());
		System.out.println("User ID: " + u1.getId());
		System.out.println("Email " + u1.getEmail());
		System.out.println("Sesso " + u1.getGender());

		Connection<User> targetedSearch = facebookClient30.fetchConnection("search", User.class,
				Parameter.with("q", "Valeria"), Parameter.with("type", "user"));
		System.out.println("-------------------> numero utenti trovati: " + targetedSearch.getData().size());
		List<User> uList = targetedSearch.getData();

		for (User u : uList)
		{
			System.out.println("Nome: " + u.getName());
			System.out.println("email: " + u.getEmail());
			System.out.println("User ID: " + u.getId());

		}

		Connection<User> myFriends = facebookClient30.fetchConnection("me/friends", User.class,
				Parameter.with("fields", "id, name, picture, email"));
		System.out.println("Numero amici trovati=" + myFriends.getTotalCount());
		for (User u : myFriends.getData())
		{
			System.out.println(u.getName());
		}

	}

}
