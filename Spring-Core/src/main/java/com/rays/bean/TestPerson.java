package com.rays.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Person.xml");
		Person person = (Person) context.getBean("personBean");

		System.out.println("Person name = " + person.getName());
	}

}
