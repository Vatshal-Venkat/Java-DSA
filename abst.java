

public class abst {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
    }
}
abstract class Animal{
    public Animal() {
        System.out.println("Animal Constructor called");
    }
    void eat(){
        System.out.println("Eats");
    }
    abstract void walk();
}

class Horse extends Animal {

    public Horse() {
        System.out.println("Horse Constructor called");
    }
    
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Kangaroo extends Animal{
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}
