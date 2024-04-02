package com.github.curriculeon;

public class Person {

    private Long id;

    private String name;


    public Person(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public Long getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }



}
