public class K_Shape_AlphabeticPattern19 {
    public static void main(String[] args) {
        // Downward Alphabet Logic
        int a = 65;
        for(int i = 3; i>=0; i--){
            for(int j = 0; j<=i; j++){
                System.out.print((char) (a + j)+ " " );
            }
            System.out.println();
        }
        
        // Right Alphabetic Logic
        for(int i = 0; i<4; i++){
            for(int j = 0; j<=i; j++){
                System.out.print((char) (a+j)+ " ");
            }
            System.out.println();
        }
    }
    
}
