package it.raffo.facebook;

import java.util.List;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.User;

public class fb_ex1
{

	public static void main(String[] args)
	{

		String accessToken = "EAACEdEose0cBAAscW6rivRJoZA6xdeEOuRmZCFyYEGwfm936G95EsZAAxMM64lc2Umwxxw4y1PFfyb0gAlIm7aRI2brLjDjg9s8C4ZCkpzWYemEKYgyhek0mXP2nK13IGdEFHciayzGAfEZCvp2A673chZCkxGk1Ukpk5ZBW8gHOpTFrNTRfNlSBmZB3Lt7hBYWzFAkv7kFtnAZDZD";
		FacebookClient fbc = new DefaultFacebookClient(accessToken);

		Connection<User> targetedSearch = fbc.fetchConnection("search", User.class,
				Parameter.with("q", "Luca Ficcadenti"), Parameter.with("type", "user"));

		User u1 = fbc.fetchObject("1180916698598625", User.class, Parameter.with("fields", "email"));

		System.out.println("Nome: " + u1.getName());
		System.out.println("User ID: " + u1.getId());
		System.out.println("Email " + u1.getEmail());

		System.out.println("-------------------> numero utenti trovati: " + targetedSearch.getData().size());
		List<User> uList = targetedSearch.getData();

		for (User u : uList)
		{
			System.out.println("Nome: " + u.getName());
			System.out.println("email: " + u.getEmail());
			System.out.println("User ID: " + u.getId());

		}

		Connection<User> myFriends = fbc.fetchConnection("me/friends", User.class,
				Parameter.with("fields", "id, name, picture, email"));

		for (User u : myFriends.getData())
		{
			System.out.println(u.getName());
		}

	}

}
