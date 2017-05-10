package controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find xml file
		Resource resource= new ClassPathResource("resources/spring.xml");
		//load xml into container
		BeanFactory beanFactory= new XmlBeanFactory(resource);
		//create test class object
		Object o=beanFactory.getBean("t");
		Object o1=beanFactory.getBean("t");
		Object o2=beanFactory.getBean("t");
		System.out.println(o1==o);
		System.out.println(o1==o2);
		Test t=(Test)o;
		((Test) t).hello();
		

	}

}
