package lesson2;

import java.util.Date;

public class Seminar2 {
    public static void quickSort (int [] array, int start, int end){
        int pivot = array[(end - start)/2+start];
        int left_position = start;
        int right_position = end;
        while (left_position <= right_position){
            while (array[left_position] < pivot){
                left_position++;
            }
            while (array[right_position] > pivot){
                right_position--;
            }
            if(left_position <= right_position){
                if(left_position < right_position){
                    int temp = array[right_position];
                    array[right_position] = array[left_position];
                    array[left_position] = temp;
                }
                left_position++;
                right_position--;
            }
        }
        if (start < right_position){
            quickSort(array, start, right_position);
        }
        if (end > left_position){
            quickSort(array, left_position, end);
        }
    }

    public static void main(String[] args) {
        int [] arrayTest = new int[]{1,2,3,4,5,6,7,8};
        quickSort(arrayTest, 0, arrayTest.length-1);
        System.out.println(binarySearch(arrayTest, 7,0, arrayTest.length-1));
        for (int i = 10000; i <= 100000; i = i + 10000) {
            int[] array = new int[i];
            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random() * 10000);
            }
            Date startDate = new Date();
            bubbleSort(array);
            Date endDate = new Date();
            long bubbleSortDuration = endDate.getTime() - startDate.getTime();

            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random() * 10000);
            }
            startDate = new Date();
            quickSort(array, 0, array.length-1);
            endDate = new Date();
            long quickSortDuration = endDate.getTime() - startDate.getTime();
            System.out.printf("i: %s, bubble sort duration: %s, quick sort duration: %s%n", i, bubbleSortDuration,
                    quickSortDuration);
        }
    }
    public static void bubbleSort(int [] array){
        boolean finish;
        do {
            finish = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    finish = false;
                }
            }
        } while (!finish);

    }
}


