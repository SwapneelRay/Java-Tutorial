abstract class Car {
    abstract void gear();

    
}

class Xuv extends Car{
    @Override
    void gear() {
        System.out.println("number of gear is 6");
        
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Car c = new Xuv();
        c.gear();
    }
}
