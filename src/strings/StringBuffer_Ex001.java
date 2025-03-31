package strings;

public class StringBuffer_Ex001 {
    public static void main(String[] args) {
        StringBuffer SBf = new StringBuffer("Nikita");
        SBf.append("Shende");
        System.out.println(SBf);

        //Reverse
     //   System.out.println(SBf.reverse());

        // Delete
        System.out.println(SBf.delete(6,12));


    }
}
