package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

     public class Movie {

         Actor actor;


        public Movie() {
         }

         public Movie(Actor actor) {
             this.actor = actor;
         }



         @Override
         public String toString()
         {
             return actor.getName() +actor.getGender()+actor.getAge();
         }
     }
