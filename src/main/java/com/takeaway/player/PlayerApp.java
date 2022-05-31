package com.takeaway.player;

import com.takeaway.player.service.SystemConsumer;
import com.takeaway.player.service.SystemProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeoutException;

/**
 * Hello world!
 *
 */
public class PlayerApp
{
    public static final String USER_ID = "player-" + System.getenv("INSTANCE_ID");

    private static final ExecutorService es = Executors.newFixedThreadPool(2);
    private static final Logger log = LoggerFactory.getLogger(PlayerApp.class);

    public static void main(String... args) throws IOException, TimeoutException {



//        SystemProducer systemProducer = new SystemProducer();
//
//        systemProducer.registerUser();

        String message = "player-" + args[0];
        log.info("Starting " + message);

        SystemConsumer consumer = new SystemConsumer(message);

        consumer.consume();
    }
}
