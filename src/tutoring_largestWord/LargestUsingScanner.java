package tutoring_largestWord;

import java.util.Scanner;

public class LargestUsingScanner
{
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter the value: ");
        String v = value.nextLine();
        String[] array = v.split(" ");
        String shortest = array[0];
        String longest = " ";

        for (String s: array)
        {
            if (s.length()> longest.length())
            {
                longest = s;
            }else if (s.length()< shortest.length())
            {
                shortest =s;
            }
        }
        System.out.println("The longest word is: "+longest);
        System.out.println("The shortest word is: "+shortest);

    }
}
