package lesson2;
// Алгоритм поиска - простой перебор
// Сложность O(n), т.к. зависит от объёма входящих данных.
// Если данных не много, хорошо подходит.
// ИТОГОВАЯ СЛОЖНОСТЬ: O(n)
public class Search {
    public static void main(String[] args) {
        int [] array = new int[]{1, 10, 20, 25, 13};
        //System.out.println(simpleFind(array, 10));
        System.out.println(binarySearch(array, 25, 0, array.length-1));
    }
    public static int simpleFind(int [] array, int value){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }

// Алгоритм бинарного поиска - по половинам от min до max
// Сложность O(log n), т.к. для добавления 1 доп. итерации требуется
// увеличить исходные данные в 2 раза
// ИТОГОВАЯ СЛОЖНОСТЬ: O(log n)
    public static int binarySearch(int [] array, int value, int min, int max){
        int midpoint;
        if (max < min){
            return -1;
        } else {
            midpoint = (max - min) / 2 + min;
        }
        if (array[midpoint]< value){
            return binarySearch(array, value, midpoint +1, max);
        } else {
            if (array[midpoint] > value){
                return binarySearch(array, value, min, midpoint-1);
            } else {
                return midpoint;
            }
        }
    }
}
