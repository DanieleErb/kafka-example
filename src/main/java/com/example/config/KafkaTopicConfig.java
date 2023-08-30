package com.example.config;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    /**
     
Questo metodo definisce un bean Spring per la creazione di un nuovo topic Kafka utilizzando 
l'API di Spring Kafka.
Il topic verr� creato quando l'applicazione viene avviata.*
@return Un oggetto NewTopic che rappresenta il topic "javaguides".
*/
@Bean
public NewTopic javaGuidesTopic() {// Utilizzando TopicBuilder per definire il nome del topic// e costruire un oggetto NewTopic con le configurazioni specificate.
    return TopicBuilder.name("javaguides").build();}


@Bean
public NewTopic javaGuidesJsonTopic() {// Utilizzando TopicBuilder per definire il nome del topic// e costruire un oggetto NewTopic con le configurazioni specificate.
    return TopicBuilder.name("javaguides_json").build();}
}