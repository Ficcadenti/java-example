package it.raffo.code;

import java.io.Serializable;

import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJBContext;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.apache.log4j.Logger;

/**
 * Message-Driven Bean implementation class for: TestReceiver
 */
@MessageDriven(activationConfig = {
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "java:/jms/queue/testq") })
public class TestReceiver implements MessageListener, Serializable
{
	/**
	 *
	 */
	private static final long	serialVersionUID	= 371297058349131965L;
	private static final Logger	log					= Logger.getLogger(TestProducer.class);

	@Resource
	private EJBContext			ctx;

	/**
	 * Default constructor.
	 */
	public TestReceiver()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see MessageListener#onMessage(Message)
	 */
	@Override
	public void onMessage(Message message)
	{
		if (message instanceof TextMessage)
		{
			final TextMessage textMessage = (TextMessage) message;
			log.info("***** LA CODA PRESENTA UN MESSAGGIO...");

			try
			{
				final String idCurr = textMessage.getText();
				log.info("***** RICEVUTO DALLA CODA IL MESSAGGIO " + textMessage.getText());

			}
			catch (final Exception e)
			{
				log.error(e.getMessage(), e);
				this.ctx.setRollbackOnly();
			}
		}

	}

}
