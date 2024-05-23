public class Patterns {

    public static void main(String[] args) {
        int printer_var=1;
        for (int i=1;i<=6;i++){
            for(int j=1;j<=i;j++){
                System.out.print(printer_var +" ");
                printer_var++;
            }
            System.out.println();
           
        }
    }
}
