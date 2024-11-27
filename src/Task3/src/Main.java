////Реализуйте метод countOccurrences в классе ListUtils, который
////        принимает LinkedList<String> и строку, и возвращает количество
////        вхождений строки в список.
//import java.util.LinkedList;
//class ListUtils {
//    public static int countOccurrences(LinkedList<String> list, String value) {
//        // Напишите свое решение ниже
//        int count = 0; // Счётчик для подсчёта вхождений
//        for (String element : list) { // Проходим по каждому элементу списка
//            if (element.equals(value)) { // Сравниваем элемент с искомым значением
//                count++; // Увеличиваем счётчик, если строки равны
//            }
//        }
//        return count; // Возвращаем общее количество вхождений
//    }
//}
//// Не удаляйте этот класс - он нужен для вывода результатов на
////экран и проверки
//class Printer {
//    public static void main(String[] args) {
//        LinkedList<String> list = new LinkedList<>();
//        String value;
//        if (args.length < 2) {
//            // При отправке кода на Выполнение, вы можете
//            //варьировать эти параметры
//            list.add("apple");
//            list.add("banana");
//            list.add("apple");
//            list.add("pear");
//            list.add("banana");
//            value = "apple";
//        } else {
//            for (int i = 0; i < args.length - 1; i++) {
//                list.add(args[i]);
//            }
//            value = args[args.length - 1];
//        }
//        ListUtils utils = new ListUtils();
//        System.out.println("Occurrences of \"" + value + "\": "
//                + utils.countOccurrences(list, value));
//    }
//}


//Подсказка № 1
//        Чтобы подсчитать, сколько раз строка встречается в LinkedList, вам нужно пройтись
//по каждому элементу списка и проверить, равен ли элемент искомой строке.
//Используйте цикл for для итерации по элементам списка.
//        Подсказка № 2
//Для сравнения строк используйте метод equals(). Этот метод позволяет сравнить
//строку с другим значением и определить, равны ли они. Внутри цикла сравните
//текущий элемент списка с искомым значением.
//Подсказка № 3
//        Создайте счётчик, который будет увеличиваться каждый раз, когда элемент списка
//равен искомой строке. В конце метода верните значение счётчика.
//Подсказка № 4
//Убедитесь, что ваш метод корректно обрабатывает случай, когда список пуст или
//искомое значение не встречается в списке. В таких случаях счётчик будет равен нулю.


////Эталонное решение:
//        import java.util.LinkedList;
//class ListUtils {
//    public static int countOccurrences(LinkedList<String> list,
//                                       String value) {
//        int count = 0;
//        for (String s : list) {
//            if (s.equals(value)) {
//                count++;
//            }
//        }
//        return count;
//    }
//}
//// Не удаляйте этот класс - он нужен для вывода результатов на экран
////и проверки
//class Printer {
//    public static void main(String[] args) {
//        LinkedList<String> list = new LinkedList<>();
//        String value;
//        if (args.length < 2) {
//// При отправке кода на Выполнение, вы можете варьировать
//            //эти параметры
//            list.add("apple");
//            list.add("banana");
//            list.add("apple");
//            list.add("pear");
//            list.add("banana");
//            value = "apple";
//        } else {
//            for (int i = 0; i < args.length - 1; i++) {
//                list.add(args[i]);
//            }
//            value = args[args.length - 1];
//        }
//        ListUtils utils = new ListUtils();
//        System.out.println("Occurrences of \"" + value + "\": " +
//                utils.countOccurrences(list, value));
//    }
//}