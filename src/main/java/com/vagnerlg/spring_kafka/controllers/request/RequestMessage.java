package com.vagnerlg.spring_kafka.controllers.request;

import lombok.NonNull;


public record RequestMessage(@NonNull String key, @NonNull String message) {

}
