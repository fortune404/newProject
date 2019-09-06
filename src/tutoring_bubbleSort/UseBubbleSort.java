package tutoring_bubbleSort;

public class UseBubbleSort {
    public static void main(String[] args) {
//
//        int[] array = new int[7];
//
//        array[0] = 5;
//        array[1] = 3;
//        array[2] = 10;
//        array[3] = 11;
//        array[4] = 2;
//        array[5] = 8;
//        array[6] = 6;
//
//        boolean sorted = false;
//        int temp;
//        while(!sorted) {
//            sorted = true;
//            for (int i = 0; i < array.length - 1; i++) {
//                if (array[i] > array[i+1]) {
//                    temp = array[i];
//                    array[i] = array[i+1];
//                    array[i+1] = temp;
//                    sorted = false;
//                }
//            }
//        }

        UseBubbleSort sort = new UseBubbleSort();

       // UseBubbleSort.bubbleSort();
    }


    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }


}