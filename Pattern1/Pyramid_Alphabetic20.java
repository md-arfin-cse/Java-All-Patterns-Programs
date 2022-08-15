public class Pyramid_Alphabetic20 {
    public static void main(String[] args) {
        int a = 65;
        for(int i = 0; i<4; i++){
            for(int space=3; space>i; space--){
                System.out.print(" ");
            }
            for(int j = 0; j<=i; j++){
                System.out.print((char)(a + j) + " ");
            }
            System.out.println();

        }
    }
    
}


/*
   A 
  A B
 A B C
A B C D 

*/