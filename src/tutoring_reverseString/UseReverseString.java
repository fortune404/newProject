package tutoring_reverseString;

public class UseReverseString
{
    public static void main(String[] args)
    {
        //example one
        String s = "Door";
        String reverse = "";
        int length = s.length();

        for (int i = length - 1; i>= 0; i--)
        {
            reverse = reverse + s.charAt(i);
        }
        System.out.println(reverse);

        //example two
        StringBuffer stringBuffer = new StringBuffer(s);
        System.out.println(stringBuffer.reverse());



        //example one
        String word = "kool";
        String reverse2 = "";
        int length2 = word.length();

        for (int j = length-1; j>= 0; j--)
        {
            reverse2 = reverse2 + word.charAt(j);
        }
        System.out.println(reverse2);

        //example two
        StringBuffer stringBuffer2 = new StringBuffer(word);
        System.out.println(stringBuffer2.reverse());









        String str = "SDLC";
        String ulta = "";
        int lamba = str.length();

        for (int i = length-1 ;i >= 0; i--)
        {
            ulta = ulta + str.charAt(i);
        }
        System.out.println(ulta);

        StringBuffer stringBuffer1 = new StringBuffer(str);
        System.out.println(stringBuffer1.reverse());

























    }
}
