package com.stackroute;

import com.stackroute.demo.BeanLifeCycleDemo;
import com.stackroute.domain.Movie;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
 public  static  void  main(String[] args)
 {
     ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
     ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();
     BeanLifeCycleDemo beanLifeCycleDemo=(BeanLifeCycleDemo) applicationContext.getBean("lifeCycle");





 }


}
