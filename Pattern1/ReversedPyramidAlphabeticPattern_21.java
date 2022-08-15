public class ReversedPyramidAlphabeticPattern_21 {
    public static void main(String[] args) {
        int a = 65;
        for (int i = 0; i <4; i++) {
            for(int space=0; space<i; space++){
                System.out.print(" ");
            }
            for(int j = 0; j<4-i; j++){
                System.out.print((char)(a + j ) + " ");
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

 */