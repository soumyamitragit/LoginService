package org.mail;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MailApplication {

	public static void main(String[] args) {
		//boolean a = new Boolean(Boolean.valueOf(null))
		StringBuilder sb = new  StringBuilder("asas");
		//sb = sb.delete(0, sb.length());
		 List as = new ArrayList();
		
		 as.add(sb);
		 
		 
		 
		System.out.println(as.indexOf(sb)); 
		//SpringApplication.run(MailApplication.class, args);
	}

}
