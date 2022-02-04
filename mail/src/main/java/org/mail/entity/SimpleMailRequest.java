package org.mail.entity;

import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimpleMailRequest {
	private String to;
	private String subject;
	@Nullable
	private String cc;
	@Nullable
	private String bcc;
	private String text;
}
