package hw_oct27th_19;

public class Question_2
{
    /*
        Given a String of words, find the word "wally" and return a String like this,
        "Wally was found at [index of string]"

        - ex: String example = "There is Wally across the street"
        findWally(example) -> "wally was found at 3"

        - ex: String example2 = "Wally is here"
        findWally (example2) -> "Wally was found at 1"

        - ex: String example3 = "There is no one here"
        findWally(example3) -> "Wally wasn't found"
     */

//    public static String keywordFoundAt(String value)
//    {
//        if (value.substring(11,15).equalsIgnoreCase("Wally"))
//        {
//            return "Wally was found at 4";
//        }else
//            {
//                return "Wally wasn't found";
//            }
//        //return value.indexOf("Wally");
//    }
//
//    public static void main(String[] args)
//    {
//        System.out.println(Question_2.keywordFoundAt("My name is Wally and i'm here"));
//        //Question_2.keywordFoundAt("Wally is here");
//    }

    public static void main(String[] args) {
        String wholeString = "There is Wally across the street";
        String[] justWords = wholeString.split(" ");
        String searchString = "Wally";

        for (int i = 0; i < justWords.length; i++) {
            if (justWords[i].equals(searchString)) {
                System.out.println("The word " + searchString + " is in the position: " + i);


            }
        }
    }
}
