package lesson1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        /*List<Integer> availableDivider = findSimleNumbers(4);
        for (Integer num : availableDivider) {
            System.out.println(num);
        }*/
        /*getSumNums(15);*/
       // System.out.println(getCubs(8));
        //System.out.println(combinationCount(3,5));

        test();
    }

    public static List<Integer> findAvailableDivider(int number) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                result.add(i);
            }
        }
        return result;
    }

    // Простые числа - числа, которые делятся без остатка только сами на себе и на 1.
    // Напримеп, 7 делится на 7 (будет 1) и на 1 (будет 7). Других делителей нет.
    public static List<Integer> findSimleNumbers(int max) {
        int count = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                count++;
                if (i % j == 0) {
                    simple = false;
                }
            }
            if (simple) {
                result.add(i);
            }
        }
        System.out.println(count);
        return result;
    }

    //Необходимо написать алгоритм, считающий сумму всех чисел от 1 до N.
    //Согласно свойствам линейной сложности,
    //количество итераций цикла будет линейно изменяться относительно изменения размера N.

    public static void getSumNums(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    //Необходимо написать алгоритм поиска всех доступных комбинаций (посчитать количество) для количества кубиков K с количеством граней N.
    //У вас есть 2 варианта на выбор – количество кубиков может быть строго ограничено (4 кубика, например), либо их количество будет динамическим. Выбор за вами.
    //Если вы реализуете простой вариант, обращает внимание, что данное решение имеет сложность O(n4), но если количество кубиков сделать переменной, то она //трансформируется в O(nk), что будет представлять собой экспоненциальную сложность. Для второго решения очевидно, что его сложность O(nk) с самого начала.

    public static int getCubs(int num){
        int result = 0;
        // решение без рекурсии
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                for (int k = 0; k < num; k++) {
                    for (int l = 0; l < num; l++) {
                        result++;
                    }
                }
            }
        }
        return result;
    }

    public static int combinationCount(int count, int faces) {
        if (count > 0) {
            return recursiveCounter(1, count, faces);
        } else {
            return 0;
        }
    }

    private static int recursiveCounter(int depth, int maxDepth, int faces) {// depth = 1, maxDepth = 3, faces = 2
        int count = 0;//1+1+2+2(4)
        for (int i = 1; i <= faces; i++) {
            if (depth == maxDepth) {
                count++;
            } else {
                count += recursiveCounter(depth + 1, maxDepth, faces);
            }
        }
        return count;
    }

    public static int fbRecursive(int n) {
        int[] array = new int[n];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n - 1];
    }

    public static int fbLine(int pos){
        if (pos == 1 || pos == 2){
            return 1;
        }

        return fbLine(pos - 1) + fbLine(pos - 2);
    }
    // Метод подсчёта времени выполнения алгоритма
    public static void test() {
        for (int i = 10; i <= 50; i = i + 10) {
            Date startDate = new Date();
            fbLine(i);
            Date endDate = new Date();
            long lineDuration = endDate.getTime() - startDate.getTime();
            startDate = new Date();
            fbRecursive(i);
            endDate = new Date();
            long recursiveDuration = endDate.getTime() - startDate.getTime();
            System.out.printf("i: %s, line duration: %s, recursive duration: %s%n", i, lineDuration, recursiveDuration);
        }
    }
}
