package com.learningSpring.HelloSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.learningSpring.bean.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		Resource resource = new ClassPathResource("applicationContext.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		Student student = (Student) appContext.getBean("studentbean");
		String name = student.getName();
		System.out.println("Loaded name - "+ name);
	}
}
