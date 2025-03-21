package Increment_DecrementOperator;

import java.sql.SQLOutput;

public class IncrementEx002 {

    public static void main(String[] args) {
        int a = 10;
        int b = ++a;   //pre increment
        System.out.println(b);
        System.out.println(a);

        int a_post=10;
        System.out.println("post increment1");  //post increment
        System.out.println(a_post++);
        System.out.println(a_post);

        int x=10;
        int y=x++;
        System.out.println("post increment2");
        System.out.println(y);
        System.out.println(x);



    }
}
