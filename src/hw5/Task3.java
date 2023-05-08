package hw5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Написать метод, который переводит число из римского формата записи в арабский.
//        Например, MMXXII = 2022
public class Task3 {
    static Scanner sc = new Scanner(System.in);

    public static void changeFormat() {
        System.out.println("Введи римское число: ");
        String number = sc.nextLine();
        Map<Character, Integer> numberMap = new HashMap<>();
        numberMap = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        int result = 0;
        int number2 = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            int current = numberMap.get(number.charAt(i));
            if (current < number2) {
                result -= current;
            } else {
                result += current;
            }
            number2 = current;
        }
        System.out.println(result);
    }
}
