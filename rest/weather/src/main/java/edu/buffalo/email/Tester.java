package edu.buffalo.email;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {
	public static void main(String[] ar){
	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
	
		Notification notice = context.getBean(Notification.class);
		notice.show("shivam@example.com", "Hi there");
	
	}
}
