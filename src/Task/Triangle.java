package Task;

public class Triangle {
    public static void main(String[]args){

        int a =3;
        int b=4;
        int c=5;

        if (a==b && b==c)
        {
            System.out.println("Equilateral Triangle");

        } else if (a == b || b == c || a == c) {
            System.out.println("Scalene Triangle");
        }
        else
        {
            System.out.println(" Not triangle");

        }

        if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) {
            System.out.println("Right Angle Triangle");
        }
    }

}
