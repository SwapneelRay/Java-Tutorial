public class Nestedif {

    public static void main(String[] args) {
        
        int a=5;
        int b=7;
        int c=15;

        if (a>b) {
            if(a>c)
            {
                System.out.println("a is the greatest");
            }
            else{
                System.out.println("c is greatest");
            }
        }
        else{
            if(b>c)
            {
                System.out.println("b is greatest");
            }
            else 
            {
                System.out.println("c is greatest");
            }
        }
    }
}
