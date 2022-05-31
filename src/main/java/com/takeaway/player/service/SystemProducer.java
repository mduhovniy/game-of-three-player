package com.takeaway.player.service;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.takeaway.player.PlayerApp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class SystemProducer {

    private static final Logger log = LoggerFactory.getLogger(PlayerApp.class);

    public void registerUser() throws IOException, TimeoutException {

        String message = "new message";

        ConnectionFactory factory = new ConnectionFactory();

        try (Connection connection = factory.newConnection()) {
            Channel channel = connection.createChannel();
            channel.queueDeclare(message, false, false, false, null);
            //channel.queueDeclare( "starter", false, false, false, null);

            channel.basicPublish("", message, false, null, message.concat(" - test message").getBytes());
            log.info(message + " started");
        }


    }
}
