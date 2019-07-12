package com.stackroute;

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
     Movie movie=new Movie();

     ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
     movie.setApplicationContext(applicationContext);
     System.out.println(movie.getApplicationContext().getBean("movie1",Movie.class).toString());

     BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
     movie.setBeanFactory(beanFactory);
     System.out.println(movie.getBeanFactory().getBean("movie2",Movie.class).toString());

     movie.setBeanName("movie2");
     System.out.println(movie.getApplicationContext().getBean(movie.getBeanName(),Movie.class).toString());





 }


}
