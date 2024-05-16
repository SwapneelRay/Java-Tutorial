public class Student {

    String name;
    int rollno;
    String house;
    int claas;
    static String schoolName ="XYZ school";

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "Rakesh";//instance variable
        st1.claas= 10;
        st1.house ="red";

        Student st2 = new Student();
        st2.name="Mukesh";
        st2.claas = 9;
        st2.house= "green";

        System.out.println(st1.name + st1.claas + st1.house);
        System.out.println(st2.name + st2.claas + st2.house);
    }

}
