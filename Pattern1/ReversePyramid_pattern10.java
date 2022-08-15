public class ReversePyramid_pattern10 {
    public static void main(String[] args) {
        for (int i = 1; i <5; i++) {
            for(int space=1; space<=i; space++){
                System.out.print(" ");
            }
            for(int j = 1; j<=5-i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
            
        }
    }
    
}

/*
 

 * * * * 
  * * *  
   * *   
    *    
 
    */