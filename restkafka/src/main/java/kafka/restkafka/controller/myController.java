package kafka.restkafka.controller;

import kafka.restkafka.kaffka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class myController {
    private KafkaProducer kafkaProducer;


    public myController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }
    //http:localhost:8080/api/v1/kafka/p?message
    @GetMapping("/p")
    public ResponseEntity<?> publish(@RequestParam("message") String message)
    {
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent");
    }
}
