package hw5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Реализуйте структуру телефонной книги с помощью HashMap,
//        учитывая, что 1 человек может иметь несколько телефонов и у человека уникальное имя.
//        Поработать с методами Map.
public class Task1 {
    static Scanner sc = new Scanner(System.in);
    static Map<String, StringBuilder> book = new HashMap<>();

    public static void phoneBook() {

        System.out.println("Введи количество имен в телефонной книге: ");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            book.put(fillName(), fillNumbers());
        }
        System.out.println(book);
    }

    private static String fillName() {
        System.out.println("Введи имя абонента: ");
        String name = sc.nextLine();
        return name;
    }

    private static StringBuilder fillNumbers() {
        StringBuilder result = new StringBuilder();

        while (true) {
            System.out.println("Введи телефон абонента, если телефона нет, введи 0: ");
            String phone = sc.nextLine();
            if (phone.equals("0")) {
                break;
            } else {
                result.append(phone + ", ");
            }
        }
        return result;
    }
}
