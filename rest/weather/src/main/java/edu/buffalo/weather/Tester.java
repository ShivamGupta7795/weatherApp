package edu.buffalo.weather;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Tester {
	public static void main(String ar[]){
		//can give a list of configuration classes instead of a single class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		Pojo pob = context.getBean(Pojo.class);
		pob.demo();
		Pojo pob1 = context.getBean(Pojo.class);
		System.out.println(pob==pob1);
		context.close();
	}
}
