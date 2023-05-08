package hw5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// Пусть дан список сотрудников:
///         Иван Иванов
////         Светлана Петрова
////         Кристина Белова
////         Анна Мусина
////         Анна Крутова
////         Иван Юрин
////         Петр Лыков
////         Павел Чернов
//         Иван Иванов
//         Петр Чернышов
////         Мария Федорова
////         Марина Светлова
////         Мария Савина
//         Иван Иванов
//         Мария Рыкова
//         Анна Крутова
//         Марина Лугова
////         Анна Владимирова
//         Петр Лыков
////         Иван Мечников
////         Петр Петин
//         Петр Лыков
//         Иван Ежов
//
//         Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
//         Отсортировать по убыванию популярности.
public class Task2 {
    public static void names(String[] args) {
        Map<String, Integer> namesCounter = new LinkedHashMap<>();
        for (int i = 0; i < args.length; i++) {
            if (namesCounter.containsKey(args[i])) {
                Integer count = namesCounter.get(args[i]);
                count++;
                namesCounter.put(args[i], count);
            } else namesCounter.put(args[i], 1);
        }
        System.out.println(namesCounter);
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        int max = 1;
        for (int value : namesCounter.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : namesCounter.entrySet()) {
                String key = entry.getKey();
                if (namesCounter.get(key) == i) {
                    sortedMap.put(key, namesCounter.get(key));
                }
            }
        }
        System.out.println(sortedMap);
    }
}

// new String[]{"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Иван Иванов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина", "Иван Иванов", "Мария Рыкова", "Анна Крутова", "Марина Лугова", "Анна Владимирова", "Петр Лыков", "Иван Мечников", "Петр Петин", "Петр Лыков", "Иван Ежов" });
//    }



