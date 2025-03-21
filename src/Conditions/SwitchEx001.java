package Conditions;

import java.util.Scanner;

public class SwitchEx001 {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter the day num(1 to 7)");
        int day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            default:
                System.out.println("not a day");
                break;

        }
}}
