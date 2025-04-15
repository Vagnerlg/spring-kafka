package com.vagnerlg.spring_kafka.listeners;

import com.vagnerlg.spring_kafka.controllers.request.RequestMessage;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listenerkafka {

    @KafkaListener(groupId = "spring", topics = "topic_five")
    public void listen(ConsumerRecord<String, RequestMessage> record) {

        System.out.println(record.value());
    }
}

