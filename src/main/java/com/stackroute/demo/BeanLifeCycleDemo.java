package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//BeanLifeCycleDemo implements InitializingBean And DisposableBean
public class BeanLifeCycleDemo implements InitializingBean, DisposableBean {



    public  static  void main(String args []) {
        //Application context
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanFile.xml");
        BeanLifeCycleDemo beanLifeCycleDemo = (BeanLifeCycleDemo) applicationContext.getBean("lifeCycle");
 }
    
    public void coustomInit ()
    {
        System.out.println("Initialization");
    }
    public  void clean()
    {
        System.out.println("Destroy Method");
    }

    public void destroy ()
    {
        System.out.println("Destroy");
    }

    public void afterPropertiesSet () throws Exception {
        System.out.println("After properties");

    }
}
