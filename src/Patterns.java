public class Patterns {

    public static void main(String[] args) {
        int printer_var=0;
        for (int i=1;i<=6;i++){
            for(int j=1;j<=i;j++){
                System.out.print(printer_var +" ");
                if (printer_var ==0) {
                    printer_var=1;
                }
                else{
                    printer_var=0;
                }
            }
            System.out.println();
           
        }
       
        for (int i=0;i<=6;i++){
            for(int j=0;j<=i;j++){
                
                if ((i+j)%2 ==0) {
                    System.out.print(0 +" ");
                }
                else{
                    System.out.print(1 +" ");
                }
            }
            System.out.println();
           
        }
    }
}
