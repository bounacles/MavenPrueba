/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ghamaven;

/**
 *
 * @author pablo
 */
public class Persona {
    
    private String id;
    private String name;
    private int age;
    private boolean alive;
    
    public Persona(String id, String name, int age)
    {
        this.id=id;
        this.age=age;
        this.name=name;
        this.alive=true;
    }
    
    public Persona(String id, String name, int age, boolean alive)
    {
        this.id=id;
        this.age=age;
        this.name=name;
        this.alive=alive;
    }

    public void hBirthday()
    {
        
        if(alive)
        {
            this.age++;
        }
    }
    
    //Getters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    //public void setAge(int age) {
    //    this.age = age;
    //}

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
        
        
    
}
