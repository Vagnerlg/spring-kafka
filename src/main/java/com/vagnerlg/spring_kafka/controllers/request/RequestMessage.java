package com.vagnerlg.spring_kafka.controllers.request;

import lombok.Data;
import org.springframework.lang.NonNull;

@Data
public class RequestMessage {
    @NonNull
    private String key;

    @NonNull
    private String message;
}
