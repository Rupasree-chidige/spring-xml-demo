package com.stackroute.domain;

public class Movie {
    Actor actor;

    @Override
    public String toString()
    {
        return actor.getName() +actor.getGender()+actor.getAge();
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
}
