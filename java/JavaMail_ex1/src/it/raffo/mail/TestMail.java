package it.raffo.mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class TestMail
{
	public static void main(String[] args)
	{
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtpsogei.sogei.it");
		props.put("mail.smtp.socketFactory.port", "25");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.debug", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.port", "25");
		props.put("mail.smtp.EnableSSL.enable", "false");
		props.put("mail.smtp.socketFactory.fallback", "false");

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator()
		{
			@Override
			protected PasswordAuthentication getPasswordAuthentication()
			{
				return new PasswordAuthentication("username", "password");
			}
		});

		try
		{

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("raffaele.ficcadenti@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("yuri.quaglia@gmail.com"));
			message.setSubject("Test e-mail");
			message.setText("Prova invio e-mail," + "\n\n con smtp.gmail.com:465 in SSL/TLS!");

			Transport.send(message);

			System.out.println("Done");

		}
		catch (MessagingException e)
		{
			throw new RuntimeException(e);
		}
	}
}