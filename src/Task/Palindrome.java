package Task;

public class Palindrome {
    public static void main(String[] args) {
        String str = "MADAM";
        String revStr ="";
        for(int i = str.length()-1; i>=0; i--)
        {
            revStr=revStr + str.charAt(i);
        }
        if(str.equals(revStr))
        {
            System.out.println(str + " is th palindrome");
        }
        else {
            System.out.println(str + "is not palindrome");
        }
    }
}
