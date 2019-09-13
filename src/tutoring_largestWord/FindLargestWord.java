package tutoring_largestWord;

public class FindLargestWord
{
    public static void main(String[] args) {
        String value = "The sky is bigger than we can imagine";
        String [] arraysOfValue = value.split(" ");
        String shortest = arraysOfValue[0];
        String longest = " ";

        for (String s: arraysOfValue)
        {
            if (s.length() > longest.length())
            {
                longest = s;
            }else if (s.length() < shortest.length())
            {
                shortest = s;
            }
        }
        System.out.println("The longest word is: "+longest);
        System.out.println("The shortest word is: "+shortest);
    }
}
