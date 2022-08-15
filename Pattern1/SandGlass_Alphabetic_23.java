public class SandGlass_Alphabetic_23 {
    public static void main(String[] args) {
        //reverse pyramid
        int a = 65;
        for (int i = 0; i<4; i++) {
            for(int space=0; space<i; space++){
                System.out.print(" ");
            }
            for(int j = 0; j<4-i; j++){
                System.out.print((char)(a+j) + " ");
            }
            System.out.println();
            
        }
        //pyramid star
        int b =65;
        for(int i = 0; i<4; i++){
            for(int space=3; space>i; space--){ 
                System.out.print(" ");
            }
            for(int j = 0; j<=i; j++){
                System.out.print((char)(b+j) + " ");
            }
            System.out.println();

        }

    }
    
}


/* 
 
A B C D 
 A B C
  A B
   A
   A
  A B
 A B C
A B C D

 */