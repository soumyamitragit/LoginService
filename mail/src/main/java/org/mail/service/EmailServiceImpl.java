package org.mail.service;

import javax.mail.MessagingException;
import javax.mail.SendFailedException;
import javax.mail.internet.MimeMessage;

import org.mail.config.Properties;
import org.mail.entity.SimpleMailRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {
	@Autowired
	private JavaMailSender mailSender;
	@Autowired
	private Properties properties;

	@Override
	public void sendSimpleMessage(SimpleMailRequest mailRequest) {
		SimpleMailMessage message = new SimpleMailMessage();
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		MimeMessageHelper mimeMessageHelper = null;
		try {
			mimeMessageHelper = new MimeMessageHelper(mimeMessage,true);
			mimeMessageHelper.setTo(mailRequest.getTo());
			mimeMessageHelper.setFrom(properties.getFrom());
			mimeMessageHelper.setText(mailRequest.getText()+"\nwith cc");
			mimeMessageHelper.setSubject(mailRequest.getSubject());
			mimeMessageHelper.setCc(mailRequest.getCc());
			mailSender.send(mimeMessage);
		} catch (MessagingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		MimeMailMessage mailMessage = new MimeMailMessage(mimeMessage);
		message.setFrom(properties.getFrom());
		message.setTo(mailRequest.getTo());
		message.setSubject(mailRequest.getSubject());
		message.setText(mailRequest.getText());
		//message.setBcc(mailRequest.getBcc());
		//message.setCc(mailRequest.getCc());
		try {
			mailSender.send(message);
		} catch (MailException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getLocalizedMessage());
		} 
	}
}
