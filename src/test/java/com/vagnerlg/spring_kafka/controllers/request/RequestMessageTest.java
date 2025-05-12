package com.vagnerlg.spring_kafka.controllers.request;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RequestMessageTest {

    @Test
    void validObject() {
        var object = new RequestMessage("key", "message");

        assertEquals("key", object.key());
        assertEquals("message", object.message());
    }

    @Test
    void invalidNullObject() {
        Exception exception = assertThrows(NullPointerException.class, () ->
            new RequestMessage(null, null)
        );

        assertEquals("key is marked non-null but is null", exception.getMessage());
    }
}