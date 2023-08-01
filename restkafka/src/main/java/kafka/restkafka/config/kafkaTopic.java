package kafka.restkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaTopic {
    @Bean
    public NewTopic t3()
    {
        return TopicBuilder.name("t3").build();
    }
}
