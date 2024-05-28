// runtime polymorphism

class Bank {//overriding polymorphism

    float getROI(){
        return 0;
    }
}

class SBI extends Bank{

    float getROI(){
        return 10f;
    }
}

public class HDFC extends Bank {

    float getROI(){
        return 8.5f;
    }

    public static void main(String[] args) {
        Bank b = new HDFC();
        System.out.println(b.getROI());
        Bank b1 = new SBI();
        System.out.println(b1.getROI());
        Bank b2 = new Bank();
        System.out.println(b2.getROI());
    }
        
    }

