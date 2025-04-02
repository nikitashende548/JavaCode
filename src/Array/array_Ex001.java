package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class array_Ex001 {
    public static void main(String[] args) {
        int[] marks ={1, 2, 3 ,4, 5};

        // 2nd way
        int[] mark2 = new int[5];
        mark2[0]=1;
        mark2[1]=2;
        mark2[2]=3;
        System.out.println(mark2.length );
        System.out.println(mark2[2]);
        System.out.println(mark2[0]);
        System.out.println(mark2[1]);
        System.out.println(mark2[3]);
        //String

        System.out.println("-------------------------------------");
        for(int i=0 ;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }

        Arrays.sort(marks);
        System.out.println("-------------------------------------");
        for(int i=0 ;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }

    }
}
