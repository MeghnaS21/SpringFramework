package car.example.constructor.injection;

public class Car {
    private final Specification specification;

    // constructor injection
    public Car(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails() {
        System.out.println("Car details : " +specification+toString());
    }
}
