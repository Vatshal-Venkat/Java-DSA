public class Inherit {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.run();
        dog.legs = 4;
        dog.blood = "red";
        dog.breed = "Golden Red Liver";
        System.out.println(dog.legs);
        System.out.println(dog.blood);
    }
}
public class Animal {
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
//Multi-Level
class Mamals extends Animal{
    int legs;

    void run(){
        System.out.println("runs");
    }
    String blood;
}

class Dog extends Mamals{
    String breed;
    
    
}
