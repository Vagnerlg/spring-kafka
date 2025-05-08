package com.vagnerlg.spring_kafka.config.kafka;

import org.apache.kafka.common.serialization.StringDeserializer;
import org.junit.jupiter.api.Test;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import static org.junit.jupiter.api.Assertions.*;

class ConsumerConfigTest {

    @Test
    void producerFactory() {
        var consumerConfig = new ConsumerConfig("localhost-server");

        var factory = consumerConfig.consumerFactory();
        var configMap = factory.getConfigurationProperties();

        assertNotNull(factory);
        assertEquals("localhost-server", configMap.get("bootstrap.servers"));
        assertEquals(JsonDeserializer.class, configMap.get("value.deserializer"));
        assertEquals(StringDeserializer.class, configMap.get("key.deserializer"));
    }

    @Test
    void kafkaListenerContainerFactory() {
        var consumerConfig = new ConsumerConfig("localhost-server");

        var container = consumerConfig.kafkaListenerContainerFactory();

        assertNotNull(container);
    }
}