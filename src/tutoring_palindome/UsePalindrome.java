package tutoring_palindome;

import java.util.Scanner;

public class UsePalindrome
{
    public static boolean isPalindrome(String value)
    {
        if (value.length() <= 1)
        {
            return true;
        }

        if (value.charAt(0) == value.charAt(value.length()-1))
        {
            return isPalindrome(value.substring(1,value.length()-1));
        }
        else
            {
                return false;
            }
    }

    //execution
    public static void main(String[] args)
    {
        System.out.println(isPalindrome("MADAM"));

        //-----------------------------------

        //example 2
        String word = "MOM";
        String reverse = "";
        int length = word.length();

        for (int i = length-1; i>= 0; i--)
        {
            reverse = reverse + word.charAt(i);
        }

        if (reverse.equalsIgnoreCase(word))
        {
            System.out.println("THIS WORD IS PALINDROME");
        }else
            {
                System.out.println("THIS WORD IS NOT PALINDROME");
            }
    }
}
