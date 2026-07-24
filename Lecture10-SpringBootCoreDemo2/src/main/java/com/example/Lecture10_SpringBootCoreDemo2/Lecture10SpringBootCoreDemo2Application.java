package com.example.Lecture10_SpringBootCoreDemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lecture10SpringBootCoreDemo2Application {

	public static void main(String[] args) {
		ApplicationContext context =
				SpringApplication.run(Lecture10SpringBootCoreDemo2Application.class, args);

//		PaymentGateway paymentGateway = context.getBean(PaymentGateway.class);

//		paymentGateway.setType("Paytm");
//		paymentGateway.setRetryCount(5);

//		System.out.println(paymentGateway.getType());
//		System.out.println(paymentGateway.getRetryCount());
//		System.out.println(paymentGateway.isEnabled());
//		System.out.println(paymentGateway.getTimeout());

//		paymentGateway.print();
	}
}

// application.properties