package tutoring_reverseInteger;

public class TestReverseInteger
{
    public static void main(String[] args) {
        int num = 3456;

        int rev = 0;

        while (num != 0)
        {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(rev);

        //example 2
        int num2 = 1234;
        StringBuffer sb = new StringBuffer(String.valueOf(num2)).reverse();
        System.out.println(sb);


        //example 1
        int id = 9876;

        int reverse = 0;

        while (id != 0)
        {
            reverse = reverse * 10 + id % 10;
            id = id /10;
        }
        System.out.println(reverse);


        //example 2
        int roc = 4321;

        StringBuffer stringBuffer = new StringBuffer( String.valueOf(roc)).reverse();
        System.out.println(stringBuffer);
























    }
}
