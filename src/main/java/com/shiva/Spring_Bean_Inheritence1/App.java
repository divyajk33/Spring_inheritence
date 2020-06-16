package com.shiva.Spring_Bean_Inheritence1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.shiva.beans.Child;


public class App 
{
    public static void main( String[] args )
    {
    	BeanFactory beans=new XmlBeanFactory(new ClassPathResource("/spring.xml"));
    	Child c=(Child)beans.getBean("child");
    	c.displayDetails();
    }
}
