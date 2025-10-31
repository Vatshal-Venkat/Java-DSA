public class Construct{
    public static void main(String[] args) {
        Student S1 = new Student("Venkat Vatshal",529,"neom14");
        System.out.println(S1.name);
        System.out.println(S1.roll);
        System.out.println(S1.password);

        Student S2 = new Student(S1);
        S2.password = "Throw1";
        System.out.println(S2.name);
        System.out.println(S2.roll);
        System.out.println(S2.password);
    }
}

class Student{
    String name;
    int roll;
    String password;

    Student (String name,int roll,String password){
        this.name =name;
        this.roll = roll;
        this.password = password;
    }


//Copy Constructor
Student(Student S1){
    this.name = S1.name;
    this.roll = S1.roll;
}
}


