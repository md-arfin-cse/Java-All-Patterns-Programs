public class pattern10 {
    public static void main(String[] args) {
        // for(int i=5; i>=1; i--){
        //     for(int j=5; j>i; j--){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<(i*2); k++){
        //         if(k>1 && k<(i*2)-1){
        //             System.out.print(" ");
        //         }
        //         else{
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }


        for(int i=1; i<=5; i++){
            for(int j=5; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<(i*2); k++){
                if(k>1 && k<(i*2)-1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                // System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}


//      *
//     * *
//    *   *
//   *     *
//  *       *