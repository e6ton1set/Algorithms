package lesson2;

public class FastSearch {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 4, 6, 7, 8, 9};
        quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
// Алгоритм быстрой сортировки
// Обычная сложность состоит из O(n(log n)) + O(n)
// Сокращают до O(n(log n))
// Максимальная сложность O(n^2), если pivot будет в начале, а не в середине.
// ИТОГОВАЯ СЛОЖНОСТЬ: O(n(log n))
    public static void quickSort(int[] array, int startPosition, int endPosition) {
        int leftPosition = startPosition;
        int rightPosition = endPosition;
        int pivot = array[(startPosition + endPosition) / 2];
        do {

            while (array[leftPosition] < pivot) {
                leftPosition++;
            }
            while (array[rightPosition] > pivot) {
                rightPosition--;
            }

            if (leftPosition <= rightPosition) {
                if (leftPosition < rightPosition) {
                    int temp = array[leftPosition];
                    array[leftPosition] = array[rightPosition];
                    array[rightPosition] = temp;
                }
                leftPosition++;
                rightPosition--;
            }
        }
        while (leftPosition <= rightPosition);
        {

            if (leftPosition < endPosition) {
                quickSort(array, leftPosition, endPosition);
            }

            if (startPosition < rightPosition) {
                quickSort(array, startPosition, rightPosition);
            }
        }
    }
}
