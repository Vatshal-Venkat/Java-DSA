public class cast {
    public static void main(String args[]){
        float a = 367.165f;
        int b = (int) a;
        System.out.println(b);
    }
}
//(int) will convert the float into int even though compiler knows we're ready for the lossy conversion
/*if you dont use (), it will give us an lossy error 
The output will remove the data post decimat point and will convert into int
This is known as TYpe casting
Other conversuins like long to int or double to float are directly done known as Implicit Casting
*/