public class Downward_Alphabetic_pattern_16 {
    public static void main(String[] args) {
        int a =65;
        for(int i = 3; i>=0; i--){
            for(int j = 0; j<=i; j++){
                System.out.print((char) (a + j)+ " " );
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