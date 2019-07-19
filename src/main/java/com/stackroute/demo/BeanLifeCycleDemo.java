package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo implements InitializingBean, DisposableBean {

 public  static  void main(String args []) {

     // using application context 
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanFile.xml");

        ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();
        BeanLifeCycleDemo beanLifeCycleDemo = (BeanLifeCycleDemo) applicationContext.getBean("lifecycle");





    }
    //Init-Method of BeanLifeCycleDemo
    public void coustomInit ()
    {
        System.out.println("Initialization");
    }
     //Destory of BeanLifeCycleDemo
    public  void clean()
    {
        System.out.println("Destroy Method");
    }
     
    public void destroy ()
    {
        System.out.println("Destroy");
    }
    //Methhod Implementation of InitiatizationBean Interface
    public void afterPropertiesSet () throws Exception {
        System.out.println("After properties");

    }
}
