package tutoring_nestedloop;

public class UseNestedLoop {

    public static void main(String[] args)
    {
        int numOfRows = 6;

//        for (int i = 1; i <= numOfRows; i++)
//        {
//            for (int j = 1; j <= i; j++)
//            {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//
//        for (int i = numOfRows - 1; i >= 1; i--)
//        {
//            for (int j = i; j >= 1; j--)
//            {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        for (int i = 1; i <= numOfRows; i++)
        {
            for (int j = 1; j <=numOfRows-i;j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = numOfRows-1; i >= 1; i--)
        {
            for (int k = 1; k<= numOfRows-i; k++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}