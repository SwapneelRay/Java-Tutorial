import java.util.Scanner;

class AreaCalc{

    public float circleArea(float r){
        return (float)3.14*r*r;//double 
    }

    public float rectangleArea(float l, float b){
        return l*b;
    }
    public float squareArea(float s){
        return s*s;
    }

    public void display(float show){
        System.out.println("area is" + show);
    }
}


public class Encap {
    public static void main(String[] args) {
    AreaCalc ar = new AreaCalc();
    Scanner sc = new Scanner(System.in);
    float area = ar.squareArea(sc.nextFloat());
    //ar.squareArea(6f);
    ar.display(area);
    }
}
