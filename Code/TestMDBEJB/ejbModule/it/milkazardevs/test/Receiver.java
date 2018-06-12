
package it.milkazardevs.test;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(activationConfig = {
        @ActivationConfigProperty(
                propertyName = "destination",
                propertyValue = "java:/jms/queue/testq")
})
public class Receiver implements MessageListener {
	@Override
	public void onMessage(Message message) {

		if (message instanceof TextMessage) {
			final TextMessage textMessage = (TextMessage) message;

			try {
				System.out.println(
				        String.format(
				                "*******************\nMessaggio trovato: '%s'",
				                textMessage.getText()));
			} catch (final Exception ex) {
				ex.printStackTrace(System.err);
			}
		}

	}
}
