package interviewPractices;

import java.util.Scanner;

public class PhoneDemo
{
    public static void main(String[] args)
    {
        GPhone gPhone = new GPhone();
        gPhone.software("IOS");
        gPhone.display("RETINA");
        gPhone.colors("SpaceGray and JetBlack");
        gPhone.shape(12);

        System.out.println("---------------------------");

        Hangsung hangsung = new Hangsung();

        hangsung.software("ANDROID");
        hangsung.display("LCD");
        hangsung.colors("BabyBlue and Pearl White");
        hangsung.shape(13);

        Scanner scanner = new Scanner(System.in);

        scanner.nextLine();

    }
}
