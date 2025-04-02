package Array;

public class array_min_Ex005 {
    public static void main(String[] args) {
        int [] num ={21, 12,44,43,10,9};
        int min = num[0];
        for (int i =0; i<num.length; i++)
        {
            if(num[i]< min)
            {
              min = num[i];
            }
        }
        System.out.println(min);
    }
}
