package car.example.bean;
//package means file
public class MyBean {
    //private data member
    private String message;

    //public setter for the same data member
    public void setMessage(String message) {
        this.message = message;
    }

    //print the message
    public void showMessage() {
        System.out.println("Message: " + message);
    }

    //string implementation
    @Override
    public String toString() {
        return "MyBean{" +
                "message='" + message + '\'' +
                '}';
    }

    //we need spring container to manage this class for us right
    //and for that we need to create a configuration file of instructions
}
