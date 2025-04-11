package com.vagnerlg.spring_kafka.controllers;


import com.vagnerlg.spring_kafka.controllers.request.RequestMessage;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    private final KafkaTemplate<String, String> template;

    public ProducerController(KafkaTemplate<String, String> template) {
        this.template = template;
    }

    @PostMapping(path = "/api/producer")
    public String message(@RequestBody RequestMessage requestMessage) {
        template.send("topic_one", requestMessage.getKey(), requestMessage.getMessage());
        return requestMessage.getMessage();
    }
}
