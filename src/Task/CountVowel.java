package Task;

public class CountVowel {
    public static void main(String[] args) {
        String input = "Nikita Shende";
        int Vowel =0;
        int consonant =0;

        input=input.toLowerCase();
        System.out.println(input);

        for(int i=0; i<input.length();i++)
        {
            char ch =input.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u')
            {
                Vowel=Vowel+1;
            }
            else
            {
                consonant=consonant+1;
            }
        }
        System.out.println(Vowel);
        System.out.println(consonant);

    }
}
