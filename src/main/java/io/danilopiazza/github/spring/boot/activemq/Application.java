package io.danilopiazza.github.spring.boot.activemq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

import io.danilopiazza.github.spring.boot.activemq.entity.Book;

@EnableJms
@SpringBootApplication
public class Application {
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);

        JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);
        Book book = new Book("9781933988948", "Bruce Snyder, Dejan Bosanac and Rob Davies", "ActiveMQ in Action", 408);
        LOGGER.info("Sending book: {}", book);
        jmsTemplate.convertAndSend("books", book);

        SpringApplication.exit(context);
    }
}
