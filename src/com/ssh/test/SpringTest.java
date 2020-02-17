package com.ssh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("resources/SpringContext.xml");
        ServiceTest serviceTest= (ServiceTest) applicationContext.getBean("serviceTest");
        serviceTest.hello();
    }
}
