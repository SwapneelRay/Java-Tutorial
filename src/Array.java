public class Array {

    public static void main(String[] args) {

        int []x;
        int[] ar = new int[5];
        ar[0]=66;
        ar[1]=6;
        ar[2]=321;
        ar[3]=32;
        ar[4]=366;
    
        int a[]={5,12,32,66,4,43,3};

        for(int i = 0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        //multidimension array
        int multarr[][]= new int[3][3];
        multarr[0][0]= 1;
        multarr[0][1]= 10; 
        multarr[0][2]= 112; 
        multarr[1][0]= 111; 
        multarr[1][1]= 11; 
        multarr[1][2]= 15; 
        multarr[2][0]= 12; 
        multarr[2][1]= 13; 
        multarr[2][2]= 14;  

        multarr[1][1]= 5;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(multarr[i][j]+" ");
            }
            System.out.println();
        }

        
        
    }

    
    
}
