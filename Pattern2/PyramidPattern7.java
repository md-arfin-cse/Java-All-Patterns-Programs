public class PyramidPattern7 {
    public static void main(String[] args) {
        // for(int i =1; i<=4; i++){ //inner loop //row
        //     for(int k =3; k>=i; k--){ //  nested loop //space
        //         System.out.print(" ");
        //     }
        //     for(int j =1; j<=i; j++){ //outer loop //column
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }
        
        //method2

        for(int i =1; i<=7; i++){
            for(int j=7; j>=1; j--){
                if(j>i){
                    System.out.print(" ");
                }
                else{  
                    System.out.print(" *");
                }
                
            }
            System.out.println();
        }
    }
    
}


/* 
    *
   * *
  * * *
 * * * *
 
 */