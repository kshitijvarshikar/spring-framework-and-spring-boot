package org.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

// This class is all about Aware Interfaces
//@Component
public class UserService implements BeanNameAware, ApplicationContextAware {

    public UserService(){
        System.out.println("User-Constructor Called");
    }

    // Aware Interfaces-->ByDefault Step Which is called by Spring IoC Container to getBean name is called as callback methods.
    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name is " + name); //Bean Name is userService -- camelCase Style Follow
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext name is " + applicationContext.getClass());
    }
}

// Aware Methods
//ByDefault Print this BeanNameAware, ApplicationContextAware is called as callback method because spring call this methods.
