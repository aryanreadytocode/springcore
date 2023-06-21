package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("life-config.xml");
//        Samosa samosa = (Samosa) context.getBean("samosa");
//        System.out.println(samosa);
        // registering shutdown hook
        context.registerShutdownHook();

//        Pepsi pepsi = (Pepsi) context.getBean("pepsi");
//        System.out.println(pepsi);

        Jalebi jalebi = (Jalebi) context.getBean("jalebi");
        System.out.println(jalebi);
    }
}
