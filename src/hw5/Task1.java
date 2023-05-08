package hw5;

import java.util.*;

//Реализуйте структуру телефонной книги с помощью HashMap,
//        учитывая, что 1 человек может иметь несколько телефонов и у человека уникальное имя.
//        Поработать с методами Map.
public class Task1 {
    static Scanner sc = new Scanner(System.in);
    static Map<String, List<String>> book = new HashMap<>();

    public static void phoneBook() {

        System.out.println("Введи количество имен в телефонной книге: ");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            String name = fillName();
            List<String> phones = fillNumbers();
            book.put(name, phones);
        }
        System.out.println(book);
    }

    private static String fillName() {
        System.out.println("Введи имя абонента: ");
        String name = sc.next();
        return name;
    }

    private static List<String> fillNumbers() {
        List<String> result = new ArrayList<>();
        result.add("Телефон: ");
        while (true) {
            System.out.println("Введи телефон абонента. Если телефона нет, введи 0: ");
            String phone = sc.next();
            if (phone.equals("0")) {
                break;
            } else {
                result.add(phone);
            }
        }
        return result;
    }


}
