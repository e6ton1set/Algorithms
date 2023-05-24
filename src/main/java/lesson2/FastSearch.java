package lesson2;

public class FastSearch {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 4, 6, 7, 8, 9};
       /* quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }*/
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


// Алгоритм пирамидальной сортировки (сортировки кучей)
// Максимальная сложность O(n(log n))
// ИТОГОВАЯ СЛОЖНОСТЬ: O(n(log n))

    public static void heapSort(int[] array) {
        // построение кучи (перегруппировываем массив)
        // самый большой элемент окажется вверху, с индексом 0
        for (int i = array.length / 2 - 1; i >= 0; i--  ) {
            heapify(array, array.length, i);
        }

        // один за другим извлекаем элементы из кучи
        for (int i = array.length - 1; i >= 0; i--) {
            // перемещаем текущий корень в конец
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // вызываем метод просеивания (heapify) на уменьшенной куче
            // это позволит самый большой элемент снова вынести наверх
            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int heapSize, int rootIndex) {
        // метод просеивания двоичной кучи
        int largest = rootIndex; // инициализируем наибольший элемент как корень
        int leftChild = 2 * rootIndex + 1; // левый ребёнок + формула нахождения
        int rightChild = 2 * rootIndex + 2;  // правый ребёнок + формула нахождения

        // если левый ребёнок не выходит за пределы размера и больше корня
        if (leftChild < heapSize && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

        // если правый ребёнок не выходит за пределы размера и больше корня
        if (rightChild < heapSize && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        // если самый большой элемент уже не является корнем
        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;
        }

        // рекурсивно углубляемся в дерево, если мы поменяли 2 элемента местами
        // чтобы посмотреть, что поменялось
        heapify(array, heapSize, largest);
    }
}
