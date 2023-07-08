package org.skm;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;


@SpringBootApplication
public class Main {
    public static void main(String[] args) {

//        ApplicationContext context=new AnnotationConfigApplicationContext(KnightsConfig.class);
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        context.getBean(Knight.class).embarkOnQuest();
    }
}