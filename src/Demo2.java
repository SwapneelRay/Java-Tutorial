class A{
    void display(){
        System.out.println("display");
    }
    void alpha(){
        System.out.println("alpha method");
        display();
        
    }
    A(int x){
        
        System.out.println("parameter constructor");
        
    }
    A(){
        this(5);
        System.out.println("default constructor");
    }
}



public class Demo2 {//this keyword method invoke

    public static void main(String[] args) {
        A a = new A();
        
        
    }
}
