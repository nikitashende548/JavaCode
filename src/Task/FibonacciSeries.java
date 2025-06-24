package Task;

public class FibonacciSeries {
    public static void main(String[] args) {

        int num;

        int a = 0;
        int b = 1;

        for (int i = 1; i < 10; i++) {
            System.out.print(a+ " ");
            num = a + b;                           // 1+1=2, 1+2=3...
            a=b;                                  //    a=1, a=1...
            b=num;                                //    b=1, b=2...

        }

    }
}

