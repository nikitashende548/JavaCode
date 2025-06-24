package Task;

public class RightTriangle_Array {
    public static void main(String[] args) {
        int n=3;
        for (int i = 0; i < n; i++) {          //Row = N
            for (int j = 0; j <= i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


//Explaination


//1  ==  0,0                               *  i>j        if i is greater than j the * will print
//2  ==  0,1                                  i<j        if j is greater that i the loop will break
//3  ==  0,3                                  i<j
//4  ==  1,0                               *
//5  ==  1,1                               *
//6  ==  1,2
//7  ==  2,0                               *
//8  ==  2,1                               *
//9  ==  2,2                               *
