package tutoring_anagram;

import java.util.Arrays;

public class UseAnagram
{
    public static boolean isAnagram(String str1, String str2)//
    {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] c1 = str1.toCharArray();
        Arrays.sort(c1);

        char[] c2 = str2.toCharArray();
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }

    //main method
    public static void main(String[] args)
    {
        String b = "LISTEN";
        String e = "SILENT";
        System.out.println(isAnagram(b, e));

    }
}
