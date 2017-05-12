package main;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by satyam on 12.05.2017.
 */
public class MyMessageProvider {

    public Connection createConnection() throws JMSException {
        ActiveMQConnectionFactory activeMQConnectionFactory =
                new ActiveMQConnectionFactory(
                        "tcp://localhost:61616");

        return activeMQConnectionFactory.createConnection();
    }


    public void sendMessage(String message){

        try {
            Connection connection = createConnection();

            connection.start();

            Session session = connection.createSession(false,
                    Session.AUTO_ACKNOWLEDGE);

            Destination destination = session.createQueue("MyQueue");

            MessageProducer messageProducer =
                    session.createProducer(destination);

            messageProducer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

            TextMessage textMessage =
                    session.createTextMessage(message);

            messageProducer.send(textMessage);

            session.close();
            connection.close();

        } catch (JMSException e) {
            e.printStackTrace();
        }
    }


}
