package com.JenkinsSpring.JenkinsSpring;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsSpringApplicationTests {


	public static  final Logger logger= LoggerFactory.getLogger(JenkinsSpringApplication.class);
	@Test
	void contextLoads() {
		logger.info("Its is Test Class");

	}

}
