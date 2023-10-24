class Animal{

    int legs;
    int ears;
    int eyes;
    String sound;
    double height;
    double length;
    double walkSpeed;
    double runSpeed;

    void walk()
    {
        System.out.println("Animal is Walking");
    }

    void run()
    {
        System.out.println("Animal is Running");
    }

}

class Dog extends Animal{

    String type;
    String color;

    Dog(){
        this.ears = 2;
        this.eyes = 2;
        this.legs = 4;
    }

    void walk()
    {
        System.out.println("Dog is Walking");
    }

    void run()
    {
        System.out.println("Dog is Running");
    }
    

}

class HoundDog extends Dog{

    HoundDog(){
        this.walkSpeed = 5.2;
        this.runSpeed = 15.5;
        this.height = 3.5;
        this.length = 4.1;
        this.sound = "barking";
    }

    void walk()
    {
        System.out.println("HoundDog is Walking at " + this.walkSpeed + "km/hr speed.");
    }

    void run()
    {
        System.out.println("HoundDog is Running at " + this.runSpeed + "km/hr speed.");
    }    

    void sound()
    {
        System.out.println("HoundDog is " + this.sound);
    }
}

public class inheritanceAnimal {
    public static void main(String[] args) {

        Dog dog = new Dog();
        HoundDog hounddog = new HoundDog();

        dog.walk();
        dog.run();

        hounddog.walk();
        hounddog.run();
        hounddog.sound();


        
    }
}
