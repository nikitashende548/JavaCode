package Increment_DecrementOperator;

public class IncrementEx003 {
    public static void main(String[] args){
        int a=10;
    //    System.out.println(a++ +a);    //a +b , a=a++ b=+a

        System.out.println(a++ +  ++a );     // a++ =11 , 12=++a
        System.out.println(a);

        int b =10;
        System.out.println(++b + b++ + b++ );     // a++ =11 , 12=++a
        System.out.println(b);
    }

}
