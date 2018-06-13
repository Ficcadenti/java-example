package it.raffo.mongodb;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class esempio1
{

	public static void main(String[] args)
	{
		System.out.println("MongoDB - esempio1");

		// Creating a Mongo client
		MongoClient mongo = new MongoClient("localhost", 27017);

		// Creating Credentials
		MongoCredential credential;
		credential = MongoCredential.createCredential("raffo", "test_raffo", "raffo".toCharArray());
		System.out.println("Connected to the database successfully");

		mongo.getDatabase("test_raffo");
		System.out.println("Credentials ::" + credential);

		// Accessing the database
		MongoDatabase database = mongo.getDatabase("test_raffo");

		// Retrieving a collection
		MongoCollection<Document> collection = database.getCollection("esempioJson2");
		System.out.println("Collection esempioJson2 selected successfully");

		// Getting the iterable object
		FindIterable<Document> iterDoc = collection.find();
		// Getting the iterator
		Iterator it = iterDoc.iterator();

		while (it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
