package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.Service.Service;
import com.example.demo.composants.MonComposant;
import com.example.demo.entity.Person;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:configuration.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person.getFirstName() + " " + person.getLastName()); // affichera "John Doe"
		
		MonComposant composant = (MonComposant) context.getBean("monComposant");
		System.out.println( composant.toString());
		

	}

}
