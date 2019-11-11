package com.vinnyfs89.jhipstergateway.web.rest;

import com.vinnyfs89.jhipstergateway.service.JhipsterApiGatewayApplicationKafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jhipster-api-gateway-application-kafka")
public class JhipsterApiGatewayApplicationKafkaResource {

    private final Logger log = LoggerFactory.getLogger(JhipsterApiGatewayApplicationKafkaResource.class);

    private JhipsterApiGatewayApplicationKafkaProducer kafkaProducer;

    public JhipsterApiGatewayApplicationKafkaResource(JhipsterApiGatewayApplicationKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        log.debug("REST request to send to Kafka topic the message : {}", message);
        this.kafkaProducer.send(message);
    }
}
