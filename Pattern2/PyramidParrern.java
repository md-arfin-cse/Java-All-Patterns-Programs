public class PyramidParrern {
    public static void main(String[] args) {
        // for(int i = 1; i<=5; i++){ //row //outerloop
        //     for(int j=5; j>i; j--){ //space //nestedloop
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=i; k++){ //column //innerloop
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        for(int i = 1; i<=5; i++){ //row //Outerloop
            for(int j=5; j>i; j--){ //space //nestedloop
                System.out.print(" ");
            }
            for(int k=1; k<2*i; k++){ //column  //innerloop
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}


//     *
//    ***
//   *****
//  *******
// *********