package org.example;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.example.config.WebConfig;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws LifecycleException {

        // Boiler Plate
        Tomcat tomcat = new Tomcat();

        tomcat.setPort(8080);

        tomcat.getConnector();

        String contextPath = "";
        String baseDoc = new File("src/main/webapp").getAbsolutePath();

        Context context = tomcat.addContext(contextPath, baseDoc);

        // Ioc Container App
        AnnotationConfigWebApplicationContext springContext = new AnnotationConfigWebApplicationContext();
        springContext.register(WebConfig.class);

        // Dispatcher Servlet
        DispatcherServlet dispatcherServlet = new DispatcherServlet(springContext);

        Tomcat.addServlet(context, "dispatcherServlet", dispatcherServlet);

        context.addServletMappingDecoded(
                "/", "dispatcherServlet");

        tomcat.start();

        System.out.println("Tomcat Started on port 8080");

        // keep server running
        tomcat.getServer().await();
    }
}
