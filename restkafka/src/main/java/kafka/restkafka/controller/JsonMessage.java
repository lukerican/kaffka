package kafka.restkafka.controller;

import kafka.restkafka.kaffka.JsonKafkaProducer;
import org.apache.catalina.User;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessage {
    private JsonKafkaProducer kafkaProducer;

    public JsonMessage(JsonKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }
    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user)
    {
        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json sent");
    }
}
