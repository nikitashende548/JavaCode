package Array;

public class array_Sum_Ex007 {
    public static void main(String[] args) {
        int[] num ={22, 55, 32};
                int sum =0;

                for (int i=0; i<num.length;i++)
                {
                    sum =sum+ num[i];
                }
        System.out.println(sum);
    }
}
