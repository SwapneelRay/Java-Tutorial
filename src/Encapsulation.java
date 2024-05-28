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

public class Encapsulation extends AreaCalc {

    AreaCalc ar = new AreaCalc();
    float area = ar.squareArea(5f);
    AreaCalc areaCalc = new AreaCalc();
    
    
}
