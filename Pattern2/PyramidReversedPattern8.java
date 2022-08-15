public class PyramidReversedPattern8 {
    public static void main(String[] args) {
        //  for(int i =1; i<=7; i++){ //inner loop //row
        //         for(int k =1; k<=i; k++){ //  nested loop //space
        //             System.out.print(" ");
        //         }
        //         for(int j =7; j>=i; j--){ //outer loop //column
        //             System.out.print(" *");
        //         }
        //         System.out.println();
        //     }

        // for(int i=1; i<=7; i++){
        //     for(int k=1; k<=i; k++){
        //         System.out.print(" ");
        //     }
        //         for(int j=4; j>=i; j--){
        //             System.out.print("*");
        //         }
        //         for(int l=3; l>=i; l--){
        //             System.err.print("*");
        //         }
        //         System.err.println();
        //     }

        // for(int i =1; i<=4;i++){
        //     for(int j=1; j<=i; j++){//space
        //         System.out.print(" ");
        //     }
        //     for(int k=9; k>(i*2); k--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        for(int i =5; i>=1; i--){
            for(int j =5; j>i; j-- ){
                System.out.print(" ");
            }
            for(int k =1; k<(i*2); k++){
                System.out.print("*");
            }
            System.out.println();
        }



        }
    }
    

//    *********
//     *******
//      *****
//       ***
//        *