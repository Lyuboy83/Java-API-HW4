//Дан LinkedList с несколькими элементами. В методе
//        removeOddLengthStrings класса LLTasks реализуйте удаление строк, длина
//        которых нечетная. Используйте LinkedList и стандартные методы

import java.util.LinkedList;
class LLTasks {
    public static void
    removeOddLengthStrings(LinkedList<String> ll) {
        // Напишите свое решение ниже
        ll.removeIf(s -> s.length() % 2 != 0);
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на
//экран и проверки
class Printer {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете
            //варьировать эти параметры
            ll.add("apple");
            ll.add("banana");
            ll.add("pear");
            ll.add("grape");
        } else {
            for (String arg : args) {
                ll.add(arg);
            }
        }
        LLTasks answer = new LLTasks();
        System.out.println(ll);
        answer.removeOddLengthStrings(ll);
        System.out.println(ll);
    }
}

//Подсказка № 1
//Для удаления строк с нечетной длиной, вам нужно перебрать все элементы
//LinkedList. Вы можете использовать цикл for-each для этого.
//        Подсказка № 2
//Для проверки длины строки, используйте метод length(). Чтобы узнать, является ли
//длина строки нечетной, используйте оператор остатка от деления %.
//Подсказка № 3
//Поскольку вы не можете изменять LinkedList прямо в цикле, создайте временный
//список, чтобы сохранить строки, которые нужно удалить.
//        Подсказка № 4
//Внутри цикла добавляйте строки, которые удовлетворяют условию нечетной длины, в
//временный список.
//Подсказка № 5
//После того как вы собрали все строки, которые нужно удалить, используйте метод
//removeAll для удаления этих строк из оригинального LinkedList.

////Эталонное решение:
//        import java.util.LinkedList;
//class LLTasks {
//    public static void removeOddLengthStrings(LinkedList<String> ll)
//    {
//        LinkedList<String> toRemove = new LinkedList<>();
//        for (String s : ll) {
//            if (s.length() % 2 != 0) {
//                toRemove.add(s);
//            }
//        }
//        ll.removeAll(toRemove);
//    }
//}
//// Не удаляйте этот класс - он нужен для вывода результатов на экран
////и проверки
//class Printer {
//    public static void main(String[] args) {
//        LinkedList<String> ll = new LinkedList<>();
//        if (args.length == 0) {
//// При отправке кода на Выполнение, вы можете
//            //варьировать эти параметры
//            ll.add("apple");
//            ll.add("banana");
//            ll.add("pear");
//            ll.add("grape");
//        } else {
//            for (String arg : args) {
//                ll.add(arg);
//            }
//        }
//        LLTasks answer = new LLTasks();
//        System.out.println(ll);
//        answer.removeOddLengthStrings(ll);
//        System.out.println(ll);
//    }
//}
