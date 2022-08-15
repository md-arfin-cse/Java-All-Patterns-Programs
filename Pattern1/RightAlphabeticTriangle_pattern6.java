public class RightAlphabeticTriangle_pattern6 {
    public static void main(String[] args) {
        int a = 65;
        for(int i = 0; i<8; i++){
            for(int j = 0; j<=i; j++){
                System.out.print((char) (a+j)+ " ");
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