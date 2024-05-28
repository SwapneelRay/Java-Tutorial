class Shape {//parent
    static int x= 5;
    void a(){
        System.out.println("Parent class");
    }
}

class Square extends Shape{//child 1
    void changer(){
        
        x = 66;
        
    }
}


public class Rectangle extends Shape {//child2


    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Square sq = new Square();
        sq.changer();
        rec.a();
        System.out.println(x);
    }
}
