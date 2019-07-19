package com.stackroute.domain;
 //Actor class
public class Actor {
//Member variables of Actor class
    private String name;
    private String gender;
    private int age;
    //Actor Constructor 
    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
     // getters and setters of actor class
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
