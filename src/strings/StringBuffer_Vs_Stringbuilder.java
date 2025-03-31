package strings;

public class StringBuffer_Vs_Stringbuilder {
    public static void main(String[] args) {


    String s0 = "Nikita";
    String s1 = new String("Nikita");
    StringBuilder Sb1 = new StringBuilder("Nikita");
    StringBuffer sb2 = new StringBuffer("Nikita");

        System.out.println(s0);
        System.out.println(s1+  Sb1 + sb2);
}
}
