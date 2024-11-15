public class Car {//This is the object
    private String make;
    private String model;
    private int year;
    private String type;
    private String color;
    private double engine_size;
    private String chassis_no;
// The following are the instance variables of the above object
    public Car(String make, String model, int year, String type,
     String color, double engine_size, String chassis_no) {
        
        this.make = make;
        this.model = model;
        this.year = year;
        this.type = type;
        this.color = color;
        this.engine_size = engine_size;
        this.chassis_no = chassis_no;


    }
// The method to display information about the car
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Engine_size: " + engine_size);
        System.out.println("Chassis_no: " + chassis_no);
    }
// These are the methods
    public void accelerate() {
        System.out.println("The car is accelerating.");
    }

    public void brake() {
        System.out.println("The car is braking.");
    }

    public static void main(String[] args) {//This is the main method
        Car myCar = new Car("Mercedes", "E63s", 2024, "Sedan", "Silver",
         4.0, "WDDZF8KB4LA730839" );
         
        myCar.displayInfo();
        myCar.accelerate();
        myCar.brake();
    }
}