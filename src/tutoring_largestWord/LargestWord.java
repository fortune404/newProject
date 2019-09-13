package tutoring_largestWord;

public class LargestWord
{
    public static void main(String[] args)
    {
        String str = "Human brain is a biological learning machine";
        String [] arrayOfStr = str.split(" ");
        String shortest = arrayOfStr[0];
        String longest = " ";

        for (String  s: arrayOfStr)
        {
            if (s.length()<shortest.length())
            {
                shortest = s;
            }else if (s.length() > longest.length())
            {
                longest = s;
            }

        }

        System.out.println("longest word is: "+longest);
        System.out.println("shortest word is: "+shortest);
    }
}
