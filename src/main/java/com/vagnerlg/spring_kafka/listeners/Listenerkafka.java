package com.vagnerlg.spring_kafka.listeners;

import com.vagnerlg.spring_kafka.controllers.request.RequestMessage;
import lombok.extern.log4j.Log4j2;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class Listenerkafka {

    @KafkaListener(groupId = "spring", topics = "topic_five")
    public void listen(ConsumerRecord<String, RequestMessage> consumerRecord) {
        log.info("Consumer: {}", consumerRecord.value());
    }
}

