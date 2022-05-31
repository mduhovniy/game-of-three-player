package com.takeaway.player.service;

import com.rabbitmq.client.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;

public class SystemConsumer {

    private static final Logger log = LoggerFactory.getLogger(SystemConsumer.class);

    private final ConnectionFactory factory;
    private final String playerId;

    public SystemConsumer(String playerId) {
        this.factory = new ConnectionFactory();
        this.playerId = playerId;
    }

    public void consume() throws IOException, TimeoutException {

        Connection connection = factory.newConnection();

            Channel channel = connection.createChannel();
            channel.basicConsume(playerId, true,
                    (consumerTag, message) -> log.info("Message received " + new String(message.getBody(), StandardCharsets.UTF_8)),
                    consumerTag -> log.info(consumerTag));

        log.info("Все пропало");
    }
}
