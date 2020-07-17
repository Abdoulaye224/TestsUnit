package com.tp2.unittest;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

public class User {

    private String name;
    private String firstName;
    private String email;
    private int age;

    private boolean isValid = false;

    private ArrayList<User> users = new ArrayList<User>();

    private static final String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public User(String name, String firstName, String email, int age) {
        this.name = name;
        this.firstName = firstName;
        this.email = email;
        this.age = age;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void addUser(User user){
        if(this.isValid){
            this.users.add(user);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void validUser(User user){

        if(validEmail(this.getEmail()) && validAge() && validName() && validFirstName()){
            this.isValid = true;
            this.addUser(user);
        }

    }

    public boolean validEmail(String email){
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    public boolean validAge (){
        return this.getAge() >= 13;
    }

    public boolean validName(){
        return !this.getName().isEmpty();
    }

    public boolean validFirstName(){
        return !this.getFirstName().isEmpty();
    }
}
