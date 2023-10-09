package org.springframework.gs_maven.hello;

import org.joda.time.LocalTime;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Greeter greeter = new Greeter();
	    LocalTime currentTime = new LocalTime();
	    System.out.println("The current local time is: " + currentTime);
	    System.out.println(greeter.sayHello());
	    
	}

}
