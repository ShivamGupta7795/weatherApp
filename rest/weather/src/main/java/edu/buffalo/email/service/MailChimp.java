package edu.buffalo.email.service;

import org.springframework.stereotype.Component;

@Component("MC")
public class MailChimp implements emailService{

	@Override
	public void send(String to, String msg) {
		System.out.println("MailChimp Service");
		System.out.println("Send to:"+to);
		System.out.println("message:"+msg);
		
	}

}
