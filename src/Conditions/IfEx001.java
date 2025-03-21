package Conditions;

import java.util.Scanner;

public class IfEx001 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter Your age!");
        int age = scanner.nextInt();
           System.out.println(age);

           if(age>18)
           {
               System.out.println("Allowed to vate");
           }
           else
           {
               System.out.println("Not Allowed");

           }
    }
}
