package org.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	@Autowired
	EmailServiceImpl emailServiceImpl;
	@GetMapping("/")
	public ResponseEntity<String> emailServiceController(){
		emailServiceImpl.sendSimpleMessage("soumyamitra2019@gmail.com", "NEW MAIL", "NEW TEXT");
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("Sent");
	}
}
