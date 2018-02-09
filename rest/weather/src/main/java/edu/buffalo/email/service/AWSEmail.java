package edu.buffalo.email.service;

import org.springframework.stereotype.Component;

@Component("AWS")
public class AWSEmail implements emailService {
	
	@Override
	public void send(String to, String msg) {
		System.out.println("AWS Service");
		System.out.println("Send to:"+to);
		System.out.println("message:"+msg);
		
	}
}
