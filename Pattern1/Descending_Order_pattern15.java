public class Descending_Order_pattern15 {
    public static void main(String[] args) {
        for(int i =4 ; i>=1; i--){
            for(int j =4 ; j>=i; j-- ){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}

/*
 
4 
4 3
4 3 2
4 3 2 1

 */