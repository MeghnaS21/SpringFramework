package car.example.autowire.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationAutoWireType.xml");
        Car myCar = (Car) context.getBean("myCar");
        myCar.displayDetails();
    }
}
