package com.vagnerlg.spring_kafka.listeners;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listenerkafka {

    @KafkaListener(groupId = "spring", topics = "topic_one")
    public void listen(ConsumerRecord<String, String> record) {
        System.out.println(record);
    }
}

