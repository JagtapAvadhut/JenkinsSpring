package com.JenkinsSpring.JenkinsSpring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsSpringApplication implements CommandLineRunner {


    public static final Logger logger = LoggerFactory.getLogger(JenkinsSpringApplication.class);

    public static void main(String[] args) {
        System.out.println("Just Cheak SprinG Boot Application");
        System.out.println("......");
        SpringApplication.run(JenkinsSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("JenkinsSpringApplication inside Main Class Logger Running");
    }
}
