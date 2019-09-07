package tutoring_reverseInteger;

public class UseReverseInteger
{
    public static void main(String[] args) {
        int num = 8765432;

        int reverse = 0;

        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;

        }
        System.out.println(reverse);

        //--------------------------------------------------
        //--------------------------------------------------
        //--------------------------------------------------

        int num2 = 6789;
        StringBuffer sb = new StringBuffer(String.valueOf(num2)).reverse();

        System.out.println(sb);
    }
}
