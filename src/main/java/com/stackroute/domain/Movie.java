package com.stackroute.domain;
//Class Movie 
public class Movie {
    Actor actor;

//Constructor for Movie
    public Movie(Actor actor) {
        this.actor=actor;
    }

    @Override
    public String toString()
    {
        return actor.getName() +actor.getGender()+actor.getAge();
    }
    
    //setters and getters for Actor class
    public Actor getActor() {
        return actor;
    }
  
    public void setActor(Actor actor) {
        this.actor = actor;
    }
}
