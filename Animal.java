public class Animal {
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class Mamals extends Animal{
    int legs;

    void run(){
        System.out.println("runs");
    }
    String blood;
}

class Dog extends Mamals{
    String breed;
    Dog dog = new Dog();
    dog.eat();
    
}
