public class Casting {
    //Typecasting
    static double d= 5055050505.1321;
    public static void main(String[] args) {
        int a =10;
        float b = a;// widening
        System.out.println(a);
        System.out.println(b);

        float x= 10.8f;
        int y = (int)x;// narrowing
        System.out.println(x);
        System.out.println(y);

        int alpha = 130;
        byte byt = (byte)alpha;//overflow
        System.out.println(byt);
    }
}
