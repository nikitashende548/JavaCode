package Task;

public class practice {
    public static void main(String[] args) {
        int num = 123;
        int rev = 0;
        while (num != 0) {
            int dig = num % 10;
            rev = rev * 10 + dig;
            num = num / 10;
        }
    }
}