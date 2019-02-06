package it.raffo.code;

import java.io.Serializable;

import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.QueueConnection;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.log4j.Logger;

/**
 * Session Bean implementation class TestProducer
 */
@Stateless
@LocalBean
public class TestProducer implements Serializable
{
	private static final long	serialVersionUID	= 2919258579013392021L;
	private static final Logger	log					= Logger.getLogger(TestProducer.class);

	@Resource(lookup = "java:/ConnectionFactory")
	private ConnectionFactory	connectionFactory;

	@Resource(lookup = "java:/jms/queue/testq")
	private Destination			destination;

	/**
	 * Default constructor.
	 */
	public TestProducer()
	{
		// TODO Auto-generated constructor stub
	}

	public void putOnQueue(String msg)
	{

		log.info("Inizio putOnQueue ---->");
		try (final QueueConnection qConnection = (QueueConnection) this.connectionFactory.createConnection();
				final QueueSession qSession = qConnection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
				final MessageProducer producer = qSession.createProducer(this.destination);)
		{

			log.info("Invio messaggio ----> (" + msg + ")");
			final TextMessage message = qSession.createTextMessage(msg);
			producer.send(message);

		}
		catch (final Exception ex)
		{
			log.error(ex.getMessage(), ex);
		}
	}

}
