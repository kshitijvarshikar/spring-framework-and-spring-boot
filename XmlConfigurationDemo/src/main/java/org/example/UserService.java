package org.example;

public class UserService {

    public UserService(){
        System.out.println("UserService Called");
    }
    public void init(){
        System.out.println("Pre-Constructor");
    }


    public void user(){
        System.out.println("Function Inside User");
    }

    public void destroy(){
        System.out.println("Destroy");
    }
}
