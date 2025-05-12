package com.vagnerlg.spring_kafka.controllers;


import com.vagnerlg.spring_kafka.controllers.request.RequestMessage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Value("${spring.kafka.topic}")
    private String topic;

    private final KafkaTemplate<String, RequestMessage> template;

    public ProducerController(KafkaTemplate<String, RequestMessage> template) {
        this.template = template;
    }

    @PostMapping(path = "/api/producer")
    public String message(@RequestBody RequestMessage requestMessage) {
        template.send(topic, requestMessage.key(), requestMessage);
        return requestMessage.message();
    }
}
