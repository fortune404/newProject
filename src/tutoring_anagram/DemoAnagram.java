package tutoring_anagram;

import java.util.Arrays;

public class DemoAnagram
{
    public static boolean isItAnagram(String s1, String s2)
    {
        if (s1.length() != s2.length())
        {
            return false;
        }

        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);

        char[] c2 = s2.toCharArray();
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);
    }

    public static boolean isAnagram(String value1, String value2)
    {
        if (value1.length() != value2.length())
        {
            return false;
        }

        char[] c1 = value1.toCharArray();
        Arrays.sort(c1);

        char[] c2 = value2.toCharArray();
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);
    }

    public static void main(String[] args)
    {
        String v1 = "NEW DOOR";
        String v2 = "ONE WORD";

        System.out.println(isAnagram(v1,v2));


        String word1 = "SCHOOL MASTER";
        String word2 = "THE CLASSROOM";

        System.out.println(isItAnagram(word1,word2));
    }
}
