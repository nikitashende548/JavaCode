package Array;

public class Multiplication_Table_Ex008 {
    public static void main(String[] args) {


        int n = 3;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i + "x" + j + "=" + i*j + " ");
                
            }
            System.out.println();
        }

    }
}