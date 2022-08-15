public class AlphabetPattern_pattern7 {
    public static void main(String[] args) {
        int a = 65;
        for(int i =0; i<8; i++){
            for(int j = 0; j<=i; j++){
                System.out.print((char)a + " ");
            }
            a++;
            System.out.println();
        }
    }
}




/*
 
A 
B B
C C C
D D D D
E E E E E
F F F F F F 
G G G G G G G
H H H H H H H H
 
*/