
package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Load the application context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("Cong.xml");

        // Retrieve the GreetingService bean
        GreetingService greetingService = (GreetingService) context.getBean("greetingService");

        // Use the bean
        System.out.println(greetingService.getMessage());
    }
}
