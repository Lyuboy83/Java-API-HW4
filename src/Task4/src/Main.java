//Реализуйте метод rotateDeque в классе DequeTasks, который принимает
//        Deque<Integer> и число n. Метод должен повернуть очередь вправо на n
//        позиций. Если n отрицательное, повернуть влево.
import java.util.Deque;
import java.util.LinkedList;
class DequeTasks {
    public static void rotateDeque(Deque<Integer> deque, int n)
    {
// Напишите свое решение ниже
        if (deque.isEmpty() || n == 0) {
            return; // Если очередь пуста или вращать не нужно, ничего не делаем
        }

        int size = deque.size();
        n = n % size; // Упрощаем n, используя остаток от деления
        if (n < 0) {
            n += size; // Преобразуем отрицательное n в эквивалентное положительное
        }

        for (int i = 0; i < n; i++) {
            // Вращаем вправо: удаляем последний элемент и добавляем его в начало
            deque.addFirst(deque.removeLast());
        }
        System.out.println(deque);

    }
    }

         // Не удаляйте этот класс - он нужен для вывода результатов на
            //экран и проверки
class Printer {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        int n;
        if (args.length < 1) {
            // При отправке кода на Выполнение, вы можете
            //варьировать эти параметры
            deque.add(1);
            deque.add(2);
            deque.add(3);
            deque.add(4);
            n = 2;
        } else {
            for (int i = 0; i < args.length - 1; i++) {
                deque.add(Integer.parseInt(args[i]));
            }
            n = Integer.parseInt(args[args.length - 1]);
        }
        DequeTasks.rotateDeque(deque, n);
    }
}
//Подсказка № 1
//Для вращения очереди вправо на n позиций используйте метод addLast для
//добавления элемента в конец очереди и removeFirst для удаления элемента из
//начала очереди. Если n отрицательное, это означает, что нужно вращать влево.
//        Подсказка № 2
//Поскольку очередь может быть вращена на большее количество позиций, чем её
//размер, сначала упростите значение n, используя остаток от деления на размер
//очереди (n % size). Это поможет избежать лишних циклов вращения.
//Подсказка № 3
//Если n отрицательное, преобразуйте его в эквивалентное положительное значение
//для вращения вправо. Например, если n равно -3 и размер очереди size равен 5, то
//вам нужно добавить size к n, чтобы получить эквивалентное положительное значение
//вращения.
//        Подсказка № 4
//        Используйте цикл, чтобы повторить операцию добавления и удаления элемента из
//очереди n раз, где n — количество позиций, на которые нужно вращать очередь.
//Убедитесь, что очередь не пуста, прежде чем выполнять операции.


////Эталонное решение:
//        import java.util.Deque;
//import java.util.LinkedList;
//class DequeTasks {
//    public static void rotateDeque(Deque<Integer> deque, int n) {
//        if (deque.isEmpty()) return;
//        int size = deque.size();
//        n = n % size;
//        if (n < 0) {
//            n += size;
//        }
//        for (int i = 0; i < n; i++) {
//            deque.addLast(deque.removeFirst());
//        }
//        System.out.println(deque);
//    }
//}
//// Не удаляйте этот класс - он нужен для вывода результатов на
////экран и проверки
//class Printer {
//    public static void main(String[] args) {
//        Deque<Integer> deque = new LinkedList<>();
//        int n;
//        if (args.length < 1) {
//// При отправке кода на Выполнение, вы можете
//            //варьировать эти параметры
//            deque.add(1);
//            deque.add(2);
//            deque.add(3);
//            deque.add(4);
//            n = 2;
//        } else {
//            for (int i = 0; i < args.length - 1; i++) {
//                deque.add(Integer.parseInt(args[i]));
//            }
//            n = Integer.parseInt(args[args.length - 1]);
//        }
//        DequeTasks.rotateDeque(deque, n);
//    }
//}