package Conditions;

public class for_continue
{
    public static void main(String[] args)
    {
        for (int i = 0; i <= 50; i++)
        {
            if (i == 5)
            {
                continue; // skip below code, move to top
            }
            System.out.println(i);

        }
    }
}