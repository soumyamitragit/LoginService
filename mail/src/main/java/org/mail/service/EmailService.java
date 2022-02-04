package org.mail.service;

import org.mail.entity.SimpleMailRequest;

public interface EmailService {
	public void sendSimpleMessage(SimpleMailRequest mailRequest);
}
