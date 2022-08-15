public class Left_Pascal_Triangle_25 {
    public static void main(String[] args) {
        //left Triangle Star
        for(int i = 1; i<=4; i++){
            for(int k =3; k>=i; k--){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
         //right triangle star

        for(int i= 3; i>=1; i--){
            for(int k =4; k>i; k--){
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}


/* 
 

   *
  **
 ***
****
 ***
  **
   *


 
  
*/