package edu.buffalo.email;
import org.springframework.beans.factory.annotation.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import edu.buffalo.email.service.*;
@Component
public class Notification {
	//property based DI
	@Autowired
	@Qualifier("AWS")
	private emailService emailService;
	
	//Constructor based DI
//	public Notification(emailService emailService){
//		this.emailService = emailService;
//	}
	
	public void show(String to, String msg){
		emailService.send(to, msg);
	}
	
}
