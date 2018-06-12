package it.milkazardevs.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.QueueConnection;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/send")
public class TestServlet extends HttpServlet {
	/**
	 * 
	 */

	private static int counter = 0;

	private static final long serialVersionUID = 1228317234137568827L;

	@Resource(lookup = "java:/ConnectionFactory")
	ConnectionFactory connectionFactory;

	@Resource(lookup = "java:/jms/queue/testq")
	Destination destination;

	@Override
	protected void doGet(
	        HttpServletRequest req,
	        HttpServletResponse resp) throws ServletException, IOException {
		final PrintWriter writer = resp.getWriter();

		try {
			final QueueConnection connection = (QueueConnection) this.connectionFactory.createConnection();

			try {
				final QueueSession session = connection.createQueueSession(
				        false,
				        Session.AUTO_ACKNOWLEDGE);

				try {
					final MessageProducer producer = session.createProducer(this.destination);

					try {
						final TextMessage message = session.createTextMessage(
						        "Messaggio " + (++counter) + "");

						producer.send(message);

						writer.println(
						        "Messaggio " + counter + " inviato");
					} finally {
						producer.close();
					}
				} finally {
					session.close();
				}

			} finally {
				connection.close();
			}

		} catch (final Exception ex) {
			ex.printStackTrace(writer);
		}
	}
}