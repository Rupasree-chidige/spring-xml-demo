package com.stackroute;

import com.stackroute.domain.Movie;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.StaticApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
 public  static  void  main(String[] args)
 {
     ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
     Movie movie=context.getBean("movie",Movie.class);
     System.out.println(movie.toString());


     BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
     Movie movie1=(Movie) factory.getBean("movie",Movie.class);
     System.out.println(movie1.toString());

     BeanDefinitionRegistry registry=new DefaultListableBeanFactory();
     BeanDefinitionReader beanDefinitionReader=new XmlBeanDefinitionReader(registry);
     beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));

     Movie movie2= ((DefaultListableBeanFactory) registry).getBean("movie",Movie.class);
     System.out.println(movie2.toString());


 }


}
