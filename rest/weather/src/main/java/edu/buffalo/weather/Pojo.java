package edu.buffalo.weather;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//pojo class contains some setters, getters and constructors with some 
//private member variables
//@Component //- Can't be used as we mentioned @bean in configuration to initialize pojo constructor parameter 
//@Scope("prototype") //enable us to create multiple instances of Pojo
public class Pojo {
	public final String version;
	public Pojo(String ver){
		version = ver;
	}
	
	public void demo(){
		System.out.println("this is a demo "+version);
		return;
	}
	
}
