package lesson2;
// Сложность O(n-1), т.к. последний наимешьший элемент может быть в конце,
// можно сократить до O(n)
// Внутри цикл for тоже со сложностью O(n)
// Таким образом, умножив O(n) на O(n)
// ИТОГОВАЯ СЛОЖНОСТЬ: O(n^2)
public class Sort {

    public static void main(String[] args) {
        int [] array = new  int[]{4,2,5,9,0,1,3,6,7,8};
        /*bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }*/

        directSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
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
// Поскольку мы имеем цикла - основной и вложенный -
// сложность также будет O(n^2), однако технически шагов меньше,
// т.к. мы сначала отбираем подходящие данные, а уже среди них делаем перемещение.
// ИТОГОВАЯ СЛОЖНОСТЬ: O(n^2)
    public static void directSort (int array []){
        for (int i = 0; i < array.length -1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minPosition]){
                    minPosition = j;
                }
            }
            if (i != minPosition){
                int temp = array[i];
                array[i] = array[minPosition];
                array[minPosition] = temp;
            }
        }
    }
// Поскольку мы имеем цикла - основной и вложенный -
// сложность также будет O(n^2)
// ИТОГОВАЯ СЛОЖНОСТЬ: O(n^2)
    public static void insertSort (int [] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
