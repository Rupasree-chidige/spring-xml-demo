package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

     public class Movie implements ApplicationContextAware,BeanNameAware,BeanFactoryAware {

         Actor actor;
         private ApplicationContext applicationContext;
         private BeanFactory beanFactory;
         private String beanName;

        public Movie() {
         }

         public Movie(Actor actor) {
             this.actor = actor;
         }


         public ApplicationContext getApplicationContext() {
             return applicationContext;
         }

         public BeanFactory getBeanFactory() {
             return beanFactory;
         }

         public String getBeanName() {
             return beanName;
         }

        public Actor getActor() {
                return actor;
            }
            public void setActor(Actor actor) {
                this.actor = actor;
            }



         public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
             this.applicationContext=applicationContext;
         }

         public void setBeanName(String s) {
             this.beanName=s;
         }

         public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
                this.beanFactory=beanFactory;
         }
         @Override
         public String toString()
         {
             return actor.getName() +actor.getGender()+actor.getAge();
         }
     }
