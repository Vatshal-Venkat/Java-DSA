


public class Superb {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        System.out.println(h1.color);
    }
}

class Animal {
    Animal(){
        System.out.println("Animal Constructor is called");
    }
    String color;
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse Constructor is called");
        super.color = "brownish gray";
    }
    
}