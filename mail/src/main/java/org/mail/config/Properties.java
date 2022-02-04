package org.mail.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Getter;

@Configuration
@PropertySource("file:src/main/resources/application.properties")
@Getter
public class Properties {
	@Value("${spring.mail.username}")
	private String from;
}
