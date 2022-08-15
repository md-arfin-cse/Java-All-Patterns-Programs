public class K_Shape_pattern17 {
    public static void main(String[] args) {
        //downward triangle
        for(int i = 4; i>=1 ; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //right triangle
        for (int i = 1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
