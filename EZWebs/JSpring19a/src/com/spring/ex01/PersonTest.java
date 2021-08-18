/*
 * 의존성 주입(Dependency Injection) 예제
 */
package com.spring.ex01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class PersonTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("person.xml"));
		PersonService person = (PersonService) factory.getBean("personService");
		PersonService personx = new PersonServiceImpl();
		person.sayHello();
		personx.sayHello();
		
		System.out.println("(person == personx) : " + (person == personx));
	}

}
