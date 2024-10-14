package car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //Spring Framework is loading an XML configuration file (applicationBeanContext.xml)
        //and creating a ClassPathXmlApplicationContext object
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        //-->ApplicationContext is part of the Spring Framework and
        //represents the Spring IoC (Inversion of Control) container.

        //ClassPathXmlApplicationContext Class:
        //
        //This is a specific implementation of ApplicationContext.
        // It loads the configuration from an XML file located in the classpath,
        // typically defining Spring beans and their dependencies.

        //The class reads the file (applicationBeanContext.xml in this case) and
        // creates bean instances as described within the XML.
        MyBean myBean = (MyBean) context.getBean("myBean"); //retrieved my bean from the context
        System.out.println(myBean);

    }
}
