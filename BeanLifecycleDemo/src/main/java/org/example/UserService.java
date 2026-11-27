package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserService /*implements DisposableBean /*InitializingBean /*BeanNameAware, ApplicationContextAware*/ {

    Map<Integer, String> mp = new HashMap<>();

    public UserService() {
        System.out.println("it's a user service");
    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("It's InitializingBean");
//        mp.put(1,"Kshitij");
//        mp.put(2,"Arpita");
//    }

    //    @PostConstruct
    public void start() {
        System.out.println("It's InitializingBean");
        mp.put(1, "Kshitij");
        mp.put(2, "Arpita");

    }

    @PreDestroy
    public void stop() {
        mp.clear();
        System.out.println("It's Destroy");
    }


//    public String getValue(int key) {
//        return mp.get(key);
//    }

    public void fun() {
        System.out.println("It's a function");
    }
//
//    @Override
//    public void destroy() throws Exception {
//        mp.clear();
//        System.out.println("It's Destroy");
//    }

//    @Override
//    public void setBeanName(String name) {
//        System.out.println("Bean Name is : " + name);
//    }
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        System.out.println("ApplicationContext Name is : " + applicationContext);
//    }

}

