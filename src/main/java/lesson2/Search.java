package lesson2;
// Алгоритм поиска - простой перебор
// Сложность O(n), т.к. зависит от объёма входящих данных.
// Если данных не много, хорошо подходит.
// ИТОГОВАЯ СЛОЖНОСТЬ: O(n)
public class Search {
    public static void main(String[] args) {
        int [] array = new int[]{1, 10, 20, 25, 13};
        System.out.println(simpleFind(array, 10));
    }
    public static int simpleFind(int [] array, int value){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }
}
