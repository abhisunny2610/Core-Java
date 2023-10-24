abstract class AutoMobile {

    String type;
    String handling;
    String engine;
    int numberOfSeats;
    int numberOfWheels;

    abstract void setType();

    abstract void setHandling();

    abstract void setEngine();

    abstract void setWheels();

    abstract void setSeats();
}

class Car extends AutoMobile {

    Car() {
        this.setType();
        this.setHandling();
        this.setEngine();
        this.setWheels();
        this.setSeats();
    }

    @Override
    void setEngine() {
        this.engine = "feat";
    }

    @Override
    void setHandling() {
        this.handling = "Steering Wheel";
    }

    @Override
    void setType() {
        this.type = "SUV";
    }

    @Override
    void setSeats() {
        this.numberOfSeats = 4;
    }

    @Override
    void setWheels() {
        this.numberOfWheels = 4;
    }

    void display_car() {
        System.out.println("Engine: " + this.engine);
        System.out.println("Handling: " + this.handling);
        System.out.println("Type: " + this.type);
        System.out.println("No of Seats: " + this.numberOfSeats);
        System.out.println("No of Wheels: " + this.numberOfWheels);
    }
}

public class abstraction {

    public static void main(String[] args) {
        Car car = new Car();

        car.display_car();
    }
}