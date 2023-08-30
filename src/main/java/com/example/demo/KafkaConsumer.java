package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.payload.User;

@Service
public class KafkaConsumer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
	
	
	@KafkaListener(topics = "javaguides", groupId = "myGroup")
	public void consume(User user) {
		System.out.println("hey--------");
		LOGGER.info(String.format("Message received -> %s",  user));
	}
}
