package com.vagnerlg.spring_kafka.config.kafka;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopicConfigTest {

    @Test
    void topicConfig() {
        var topicConfig = new TopicConfig("kafka-server", "topic-name");
        var topic = topicConfig.topic();

        assertNotNull(topic);
        assertEquals("topic-name", topic.name());
        assertEquals(1, topic.numPartitions());
    }

    @Test
    void adminConfig() {
        var topicConfig = new TopicConfig("kafka-server", "topic-name");
        var admin = topicConfig.admin();

        assertNotNull(admin);
        assertEquals("kafka-server", admin.getConfigurationProperties().get("bootstrap.servers"));
    }

}