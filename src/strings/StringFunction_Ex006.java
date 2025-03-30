package strings;

public class StringFunction_Ex006 {
    public static void main(String[] args) {
        String name = "Nikita";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        //  System.out.println(name.charAt(10));                  //index out of bond exception

        // 2. concat()
        System.out.println(name.concat(" Shende"));

        // 3. Contains()
        System.out.println(name.contains("ik"));

        //4.equals()
        System.out.println(name.equals("Nikta"));

        //5.equalsIgnoreCase
        System.out.println(name.equalsIgnoreCase("NIKITA"));

        //6. indexof()
        System.out.println(name.indexOf('i'));

        //length
        System.out.println(name.length());

        //Replace(,)
        System.out.println(name.replace('k', 'K'));

        //split()
        String name2 = "nikitashende548@gmail.com";
        String[] split = name.split("i");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        //SubString
        System.out.println(name.substring(1, 4));

        //toLowerCase
        System.out.println(name.toLowerCase());

        //toUpercase
        System.out.println("Niki".toUpperCase());

        //Startwith()
        System.out.println(name.startsWith("N"));

        //Endwith()
        System.out.println(name.endsWith("L"));

        //trim()
        String name3 = "            Niki Shende             ";
        System.out.println(name3.trim());

        //comapreto()
        System.out.println(name.compareTo("Nikita"));


    //Contact
    String s11 = " Nikita";
    String s22 = "Ashok";
    String s33 = "Shende";
    String r = s11 + s22 + s33;
        System.out.println(r);

   //StringBuilder
        StringBuilder SB =new StringBuilder("Sonal");
        System.out.println(SB);

        StringBuilder Sb =new StringBuilder("Hi");
        System.out.println(Sb.toString());

}



}
