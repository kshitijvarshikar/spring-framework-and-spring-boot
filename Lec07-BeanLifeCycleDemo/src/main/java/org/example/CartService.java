package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CartService implements BeanNameAware, ApplicationContextAware /*DisposableBean InitializingBean*/ {
    Map<Integer, String> mp;

    // constructor
    public CartService(){
        mp = new HashMap<>();
        System.out.println("CartService Constructor Called");
    }

    // aware method
    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name is " + name);
    }

    // aware method
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext name is " + applicationContext.getClass());
    }

    // Initialization type 3 using PostConstruct
    @PostConstruct
    public void start2(){
        System.out.println("Bean Is Ready");
        mp.put(1, "Kshitij");
        mp.put(2, "Rohit");
    }

    // DisposableBean type 3 using PreDestroy
    @PreDestroy
    public void stop(){
        mp.clear();
        System.out.println("Bean is Getting Destroy");
    }

    public void addToCart(){
        System.out.println("Added To Cart");
    }

    public String getValue(int key){
        return mp.get(key);
    }

    // DisposableBean type 1
//    @Override
//    public void destroy() throws Exception {
//        mp.clear();
//        System.out.println("Bean is Getting Destroy");
//    }

    // Initialization type 1
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Bean Is Ready");
//        mp.put(1, "Kshitij");
//        mp.put(2, "Rohit");
//    }

    // Initialization and  DisposableBean type 2 using InitMethod Inside Appconfig.class
//    public void start(){
//        System.out.println("Bean Is Ready");
//        mp.put(1, "Kshitij");
//        mp.put(2, "Rohit");
//    }
//    public void stop(){
//        mp.clear();
//        System.out.println("Bean is Getting Destroy");
//    }
}

