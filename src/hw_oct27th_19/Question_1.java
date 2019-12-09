package hw_oct27th_19;

public class Question_1
{
    // write a method that prints out the first digit that is found inside a String

    public static char checkFirstDigit(String value)
    {
        return value.charAt(0);
    }


    public static void main(String[] args)
    {
        System.out.println(Question_1.checkFirstDigit("Hello world!"));
    }
}
