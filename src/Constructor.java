public class Constructor {

    // int add(){ // method
    //     return 0;
    // }

    

    Constructor(){
        System.out.println("new object created");
    }
    Constructor(String string){
        System.out.println(string);
    }

    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor("xyz");
    }
}
