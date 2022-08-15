public class harecterPattern {
    public static void main(String[] args) {
        // for(char i ='A'; i<='H'; i++){ //ROWS
        //     for(char j='A'; j<=i; j++){ //COLUMNS
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }



        // for(char i =65; i<=69; i++){ //ROWS      //A ASCIII VALUE=65
        //     for(char j=65; j<=i; j++){ //COLUMNS
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // for(char i =65; i<=69; i++){ //ROWS      //A ASCIII VALUE=65
        //     for(char j=65; j<=i; j++){ //COLUMNS
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

    //    char count = 65;

    //     for(char i =65; i<=69; i++){ //ROWS      //A ASCIII VALUE=65
    //         for(char j=65; j<=i; j++){ //COLUMNS
    //             System.out.print(count+" ");
    //             count++;
    //         }
    //         System.out.println();
    //     }

    char count = 'A';

        for(char i ='A'; i<='E'; i++){ //ROWS      //A ASCIII VALUE=65
            for(char j='A'; j<=i; j++){ //COLUMNS
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
        
    }
    
}
