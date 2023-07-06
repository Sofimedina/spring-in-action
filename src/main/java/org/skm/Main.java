package org.skm;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Knight knight= (Knight) context.getBean("knight");
        knight.embarkOnQuest();

    }
}