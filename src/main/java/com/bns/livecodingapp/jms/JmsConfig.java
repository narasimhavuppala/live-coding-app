package com.bns.livecodingapp.jms;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

@Configuration
public class JmsConfig {

	@Bean
	ActiveMQConnectionFactory getActiveMQ() {
		ActiveMQConnectionFactory obj = new ActiveMQConnectionFactory("guest", "guest",
				"tcp://DESKTOP-2SHE74A:61616");
		return obj;

	}

	@Bean
	JmsTemplate getJmsTemplate() {
		return new JmsTemplate(getActiveMQ());
	}

}
