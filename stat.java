public class stat {
    public static void main(String[] args) {
        student S1 = new student();
        S1.SchoolName = "International Educational Academy";
        S1.name = "Venkat Vatshal";
        S1.roll = 29;
    }
}

class student{
    static int returnPer(int math,int phy, int che){
        return (math+phy+che)/3;
    }
    String name;
    int roll;

    static String SchoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
