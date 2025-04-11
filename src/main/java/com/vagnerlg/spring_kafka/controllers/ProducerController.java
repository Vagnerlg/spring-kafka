package com.vagnerlg.spring_kafka.controllers;


import com.vagnerlg.spring_kafka.controllers.request.RequestMessage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @PostMapping(path = "/api/producer")
    public String message(@RequestBody RequestMessage requestMessage) {
        return requestMessage.getMessage();
    }
}
