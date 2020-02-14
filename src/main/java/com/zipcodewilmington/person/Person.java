package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    double height;
    char firstInit;
    boolean isAlive;
    boolean likesCoding;
    String nationality;

    public Person() {
        this.age = Integer.MAX_VALUE;
        this.name = "";
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }
    // ******************   My Methods   *******************

    public void setFirstInit(String name){
        this.firstInit = name.charAt(0);
    }
    public char getFirstInit(){
        return this.firstInit;
    }
    public void setLikesCoding(boolean likesORnot){
        this.likesCoding = likesORnot;
    }
    public boolean getLikesCoding(){
        return this.likesCoding;
    }
    public void setIsAlive(boolean aliveORnot){
        this.isAlive = aliveORnot;
    }
    public boolean getIsAlive(){
        return this.isAlive;
    }
    public void setHeight(double heightIn){
        this.height = heightIn;
    }
    public double getHeight(){
        return this.height;
    }
    public void setNationality(String nationalityIn){
        this.nationality = nationalityIn;
    }
    public String getNationality(){
        return this.nationality;
    }
}
