package com.vagnerlg.spring_kafka.config.kafka;

import org.apache.kafka.common.serialization.StringSerializer;
import org.junit.jupiter.api.Test;
import org.springframework.kafka.support.serializer.JsonSerializer;

import static org.junit.jupiter.api.Assertions.*;

class ProducerConfigTest {

    @Test
    void producerFactory() {
        var producerConfig = new ProducerConfig("localhost-server");

        var factory = producerConfig.producerFactory();
        var configMap = factory.getConfigurationProperties();

        assertNotNull(factory);
        assertEquals("localhost-server", configMap.get("bootstrap.servers"));
        assertEquals(JsonSerializer.class, configMap.get("value.serializer"));
        assertEquals(StringSerializer.class, configMap.get("key.serializer"));
    }

    @Test
    void kafkaTemplate() {
        var producerConfig = new ProducerConfig("localhost-server");

        var template = producerConfig.kafkaTemplate();

        assertNotNull(template);
    }
}