package com.springcore.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("alone-config.xml");

        Person person = (Person) context.getBean("person");
        System.out.println(person);
        System.out.println(person.getFriends().getClass().getName());
    }
}
