/*
 * DownCasting: When subclass type refers to the object of patrent class, it is known as DownCasting.
*/

interface GetAnimal{

    public Object getObject();
}

class Animal{

    void display(){
        System.out.println("I am a Wild Animal...!");
    }
}

class Dog extends Animal implements GetAnimal{

    void display(){
        System.out.println("I am a Wild Dog...!");
    }

    public Object getObject(){
        return this;
    }
}

class Cat extends Animal{

    void display(){
        System.out.println("I am a Wild Cat...!");
    }

    public Object getObject(){
        return this;
    }
}

public class Casting {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Cat cat = new Cat();
        Dog dog = new Dog();
        System.out.println("\n--------------------------------------------------------\n");
        System.out.println("Is, Dog is an animal: " + (dog instanceof Animal));
        System.out.println("Is, Cat is an animal: " + (cat instanceof Animal));
        System.out.println("Is, Dog is an animal: " + (cat instanceof Object));
        System.out.println("Is, Cat is an animal: " + (cat instanceof Object));
        
        System.out.println("Is, Cat is an animal: " + dog.getObject());
        System.out.println("Is, Cat is an animal: " + cat.getObject());
        
        System.out.println("\n--------------------------------------------------------\n");
    }
}
