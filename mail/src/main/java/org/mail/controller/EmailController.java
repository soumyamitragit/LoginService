package org.mail.controller;

import org.mail.entity.SimpleMailRequest;
import org.mail.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	@Autowired
	EmailService emailService;

	@GetMapping("/")
	public ResponseEntity<String> emailServiceController(@RequestBody SimpleMailRequest mailRequest) {
		emailService.sendSimpleMessage(mailRequest);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("Sent");
	}
}
