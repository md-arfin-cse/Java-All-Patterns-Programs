public class RightPascalAlphabeticTriangle22 {
    public static void main(String[] args) {
        //right triangle
        int a = 65;
        for(int i = 0; i<4; i++){
            for(int j = 0; j<=i; j++){
                System.out.print((char)(a+j) + " ");
            }
            System.out.println();
        }
        //downward triangle
        int b = 65;
        for(int i = 2; i>=0; i--){
            for(int j = 0; j<=i; j++){
                System.out.print((char)(b+j) + " ");
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
A B C
A B
A


 */