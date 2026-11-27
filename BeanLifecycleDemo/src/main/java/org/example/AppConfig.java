package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

//    @Bean(initMethod = "start", destroyMethod = "stop")
    public UserService getProperty(){
        return new UserService();
    }

//    @Bean(destroyMethod = "stop")
//    public UserService getProperty(){
//        return new UserService();
//    }

}
