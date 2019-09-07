package my_classes2;

public class FibonacciSeries
{
    public static void main(String[] args) {
        int max = 13;
        int n1 = 0;
        int n2 = 1;

        for (int i = 1; i<=max; i++)
        {
            System.out.print(n1+" ");
            int sum = n1+ n2;
            n1 = n2;
            n2 = sum;
        }
    }
}
