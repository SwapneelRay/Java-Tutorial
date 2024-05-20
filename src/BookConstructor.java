public class BookConstructor {

    String bookname;
    String Author;

    BookConstructor(String bkname,String Auth){
        bookname = bkname;
        Author = Auth;
        System.out.println("2 parameters");
    }
    BookConstructor(String y, String x,String z){// constructor overloading 
        bookname = y;
        Author = x;
        System.out.println("3 parameters");
    }
    void display(){
        System.out.println(bookname+ " " + Author);
    }

    public static void main(String[] args) {
        BookConstructor b1 = new BookConstructor("Maths", "R.D.Sharma");
        BookConstructor b2 = new BookConstructor("Science", "Pradeep", "12324134");

        b1.display();
        b2.display();
    }
}
