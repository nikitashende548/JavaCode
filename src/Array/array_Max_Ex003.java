package Array;

public class array_Max_Ex003 {
    public static void main(String[] args) {
        int[] marks ={23, 39, 44, 67, 99};


        int max_output =give_me_max(marks);
        System.out.println(max_output);
    }
    private static int give_me_max(int[] marks)
    {
        int max = marks[0];
for (int i=0; i<marks.length; i++)
{
    if(marks[i]>max)
    {
        max=marks[i];
    }
}
return max;

    }
}
