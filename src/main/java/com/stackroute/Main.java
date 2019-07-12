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

     ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
     Movie movie1=(Movie)applicationContext.getBean("movieA");
     Movie movie2=(Movie)applicationContext.getBean("movieA");
     System.out.println("Actor Name : "+movie1.getActor().getName()+"Actor Age : "+movie1.getActor().getAge()+"Actor Gender :"+movie1.getActor().getGender() );
     System.out.println("Actor Name : "+movie2.getActor().getName()+"Actor Age : "+movie2.getActor().getAge()+"Actor Gender :"+movie2.getActor().getGender() );
     System.out.println(movie1==movie2);


     Movie movie2bean1=(Movie)applicationContext.getBean("movie2");
     Movie movie2bean2=(Movie)applicationContext.getBean("movie2");
     System.out.println("Actor Name : "+movie2bean1.getActor().getName()+"Actor Age : "+movie2bean1.getActor().getAge()+"Actor Gender :"+movie2bean1.getActor().getGender() );
     System.out.println("Actor Name : "+movie2bean2.getActor().getName()+"Actor Age : "+movie2bean2.getActor().getAge()+"Actor Gender :"+movie2bean2.getActor().getGender() );
     System.out.println(movie2bean2==movie2bean1);

     Movie movieBbean1=(Movie)applicationContext.getBean("movieB");
     System.out.println("Actor Name : "+movieBbean1.getActor().getName()+"Actor Age : "+movieBbean1.getActor().getAge()+"Actor Gender :"+movieBbean1.getActor().getGender() );
   
 }


}
