package tutoring_selectionSort;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class UseSelectionSort
{
    public int[] selectionSort(int[] list)
    {
        int i = 0;
        int j = 0;
        int minValue = 0;
        int minIndex = 0;
        int temp = 0;

        for (i = 0; i < list.length; i++)
        {
            minValue = list[i];
            minIndex = i;
            for (j = i; j < list.length;j++)
            {
                if (list[i] < minValue)
                {
                    minValue = list[j];
                    minIndex = list[j];
                }
            }

            if (minValue < list[i])
            {
                temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
        }

        return list;
    }

    public static void main(String[] args)
    {
       // UseSelectionSort selection = new UseSelectionSort();








        int[] list = new int[5];

        list[0] = 4;
        list[1] = 10;
        list[2] = 2;
        list[3] = 5;
        list[4] = 3;

            int i = 0;
            int j = 0;
            int minValue = 0;
            int minIndex = 0;
            int temp = 0;

            for (i = 0; i < list.length; i++)
            {
                minValue = list[i];
                minIndex = i;
                for (j = i; j < list.length;j++)
                {
                    if (list[i] < minValue)
                    {
                        minValue = list[j];
                        minIndex = list[j];
                    }
                }

                if (minValue < list[i])
                {
                    temp = list[i];
                    list[i] = list[minIndex];
                    list[minIndex] = temp;
                }

                System.out.println(list[i]);
            }
    }
}
