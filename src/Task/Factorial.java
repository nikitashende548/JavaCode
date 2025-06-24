package Task;

public class Factorial {
    public static void main(String[] args)
    {
        int fac =1;
        int num=5;
        for(int i=1; i<=num; i++)
        {
          fac = fac * i;
            System.out.println("After multiplying by " + i + ", factorial is " + fac);
        }
        System.out.println(fac);
    }
}
