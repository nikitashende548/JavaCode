package functions;

import jdk.dynalink.beans.StaticClass;

public class User_Define {

    public static void main(String[] args) {
         int r1 = Sum_of_two_number(3,4);
        System.out.println(r1);
    }

        static int Sum_of_two_number(int a,int b)
        {
            return a+b;
        }




    }
