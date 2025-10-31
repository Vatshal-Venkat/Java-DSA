public class Polyride {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eats();
    }
    //Method Overriding.
}
class Animal{
    void eats(){
        System.out.println("Eats");
    }
}
class Dog extends Animal{
    void eats(){
        System.out.println("Ate");
    }
}
