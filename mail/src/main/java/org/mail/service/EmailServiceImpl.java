package org.mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl {
	@Autowired
	private JavaMailSender mailSender;
	public void sendSimpleMessage(String to,String subject,String text) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("soumya-mitra@hotmail.com");
		message.setTo(to);
		message.setSubject(subject);
		message.setText(text);
		mailSender.send(message);
	}
}
