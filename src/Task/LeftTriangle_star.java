package Task;

public class LeftTriangle_star {
    public static void main(String[] args) {
        int n=3;
        for (int i=n; i>=1;i--)
        {
            for (int j = 1; j <= i ; j++) {         //i=3
                System.out.print("*");              //j= 1,2,3
            }
            System.out.println();
        }

    }
}


