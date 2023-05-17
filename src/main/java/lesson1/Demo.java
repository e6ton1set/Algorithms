package lesson1;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> availableDivider = findSimleNumbers(100);
        for (Integer num : availableDivider) {
            System.out.println(num);
        }
    }
    public static List<Integer> findAvailableDivider (int number){
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if(number % i == 0){
                result.add(i);
            }
        }
        return result;
    }

    // Простые числа - числа, которые делятся без остатка только сами на себе и на 1.
    // Напримеп, 7 делится на 7 (будет 1) и на 1 (будет 7). Других делителей нет.
    public static List<Integer> findSimleNumbers (int max){
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    simple = false;
                }
            }
            if (simple){
                result.add(i);
            }
        }
        return result;
    }
}
