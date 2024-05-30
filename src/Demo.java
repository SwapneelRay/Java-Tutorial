class Testthis {// this keyword demo

    int rollno;
    float fees;
    String name;
    String standard;

    Testthis(int rollno,String name,float fees,String standard){
        this.rollno=rollno;
        this.name = name;
        this.fees = fees;
        this.standard = standard;
    }

    void display(){
        System.out.println("roll no :" + rollno);
        System.out.println("fees :" + fees);
        System.out.println("name :" + name);
        System.out.println("Standard :" + standard);
    }
}
   public class Demo {
   
    public static void main(String[] args) {
        Testthis t1 = new Testthis(1, "Rakesh", 5000, "8th");
        Testthis t2 = new Testthis(2, "Mukesh", 10000, "12th");
        t1.display();
        t2.display();
    }
   }


