public class Poly {
    //Method Overloading. Name Same Parameters Different.
    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.sum(27,3.98));
        System.out.println(c.sum(2.5,35.98));
        System.out.println(c.sum(2,3,14));
    }
}
public class Calc{
    int sum (int x, int y){
        return x+y;
    }
    double sum (double a, double b){
        return (float)a+b;
    }
    int sum (int a, int b, int c){
        return a+b+c;
    }
    double sum (int a, double b){
        return a+b;
    }
}
