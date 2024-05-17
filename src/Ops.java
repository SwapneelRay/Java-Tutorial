public class Ops {
public static void main(String[] args) {
    //operators +,-,/,*,=,%, >>,<<
    //unary ops
    int x = 10;
    System.out.println(x--);// postfix
    System.out.println(x);
    int y = 10;
    System.out.println(--y);// prefix
    System.out.println(y);

    //arithmetic ops
    int a = 3132;
    int b = 3;
    System.out.println(a%b);//modulus ops
    
    //shift operator
    System.out.println(10<<3);//10 * 2^3 = 80 left
    System.out.println(10<<4);//10 * 2^4 = 160 left
    System.out.println(64>>3);//64 / 2^3 = 8 right
    System.out.println(64>>4);//64 / 2^4 = 4 right

    // relational operation ==,<,>,!, <=, >=, !=
    int demo1 = 9;
    int demo2 = 7;
    int demo3 = 12;
   // System.out.println(demo2!=demo1);

    //bitwise and logical ops &&,|| , &,|
    if(demo2>demo1 || demo3>demo1){
        System.out.println("true");
    }
    else
    {System.out.println("false");}

    // ternary ops
    boolean ternary = (demo1>demo2)?true:false;

    System.out.println(ternary);
   
    //assignment operator
    double assignment = 20;
    assignment/=3; //assignment = assignment+3;
    System.out.println(assignment);
}
}
