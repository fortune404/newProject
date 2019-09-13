package tutoring_palindome;

public class PalindromeDemo
{

    public static void main(String[] args)
    {
        int value = 121;
        int reverseValue = 0;
        int temp = value;

        while (value != 0)
        {
            reverseValue = reverseValue * 10 + value % 10;

            value = value / 10;
        }

        if (temp == reverseValue)
        {
            System.out.println("THIS VALUE IS PALINDROME");
        }else
        {
            System.out.println("THIS VALUE IS NOT PALINDROME");
        }

    }
}
