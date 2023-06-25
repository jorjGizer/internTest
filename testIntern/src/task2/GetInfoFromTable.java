package task2;


import java.util.*;

public class GetInfoFromTable {
    public static void main(String[] args) {
        List<Map<String,String>> list = new ArrayList<>();
        List<Map<String, String>> maps = fillList(list);
        maps.stream()
                .filter(s -> Integer.parseInt(s.get("Возраст"))<30)
                .map(s -> s.get("Имя"))
                .forEach(System.out::println);
        System.out.println("<----------------->");
        maps.stream()
                .filter(s -> s.get("Зарплата").contains("руб"))
                .map(s -> s.get("Имя"))
                .forEach(System.out::println);
        System.out.println("<----------------->");
        double age = maps.stream()
                .mapToDouble(s -> Double.parseDouble(s.get("Возраст")))
                .average()
                .getAsDouble();
        System.out.println(age);

    }

    public static List<Map<String, String>> fillList(List<Map<String,String>> list) {
        Map<String, String> map = new HashMap<>();
        map.put("Имя", "Кирилл");
        map.put("Возраст", "26");
        map.put("Должность", "Middle java dev");
        map.put("Зарплата", "150000 руб");
        list.add( map);
        Map<String, String> map2 = new HashMap<>();
        map2.put("Имя", "Виталий");
        map2.put("Возраст", "28");
        map2.put("Должность", "Senior java automation QA");
        map2.put("Зарплата", "2000$");
        list.add(map2);
        Map<String, String> map3 = new HashMap<>();
        map3.put("Имя", "Александр");
        map3.put("Возраст", "31");
        map3.put("Должность", "junior functional tester");
        map3.put("Зарплата", "50000 руб");
        list.add(map3);
        Map<String, String> map4 = new HashMap<>();
        map4.put("Имя", "Дементий");
        map4.put("Возраст", "35");
        map4.put("Должность", "dev-ops");
        map4.put("Зарплата", "1500$");
        list.add(map4);
        return list;
    }
}