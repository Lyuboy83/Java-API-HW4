//Реализуйте MyStack с использованием LinkedList с методами:
//        ● push(String element) - добавляет элемент на вершину стека
//        ● pop() - возвращает элемент с вершины и удаляет его
//        ● peek() - возвращает элемент с вершины, не удаляя
//        ● getElements() - возвращает все элементы стека

import java.util.LinkedList;

class MyStack {
    // Напишите свое решение ниже
    private LinkedList<String> stack; // Поле для хранения элементов стека
    public MyStack() {
        this.stack = new LinkedList<>();
    }

    public void push(String element) {
        stack.addFirst(element); // Напишите свое решение ниже
    }
    public String pop() {
        // Напишите свое решение ниже
        return stack.removeFirst();

        }
        public String peek () {
// Напишите свое решение ниже
            return stack.peekFirst();
            }
            public LinkedList<String> getElements() {
                // Напишите свое решение ниже
                return new LinkedList<>(stack);
            }
        }

        // Не удаляйте этот класс - он нужен для вывода результатов на
        //экран и проверки
class Printer {
            public static void main(String[] args) {
                MyStack stack = new MyStack();
                if (args.length == 0) {
                    // При отправке кода на Выполнение, вы можете
                    //варьировать эти параметры
                    stack.push("apple");
                    stack.push("banana");
                    stack.push("pear");
                    stack.push("grape");
                } else {
                    for (String arg : args) {
                        stack.push(arg);
                    }
                }
                System.out.println(stack.getElements());
                System.out.println(stack.pop());
                System.out.println(stack.getElements());
                System.out.println(stack.peek());
            }
        }


//Подсказка № 1
//Чтобы реализовать стек с использованием LinkedList, вам нужно использовать
//метод addFirst() для добавления элемента на вершину стека. Этот метод вставляет
//элемент в начало списка, что соответствует вершине стека.
//        Подсказка № 2
//Для удаления элемента с вершины стека и его возврата, используйте метод
//removeFirst() класса LinkedList. Этот метод удаляет и возвращает элемент из
//        начала списка, что соответствует удалению элемента с вершины стека.
//Подсказка № 3
//Чтобы вернуть элемент с вершины стека, не удаляя его, используйте метод
//peekFirst() класса LinkedList. Этот метод возвращает первый элемент в списке,
//не удаляя его, что соответствует методу peek в стеке.
//Подсказка № 4
//Не забудьте создать поле LinkedList<String> stack внутри вашего класса
//MyStack, чтобы хранить элементы стека. Это поле будет использоваться для
//хранения и управления элементами стека.


////Эталонное решение:
//import java.util.LinkedList;
//class MyStack {
//    private LinkedList<String> stack = new LinkedList<>();
//    public void push(String element) {
//        stack.addFirst(element);
//    }
//    public String pop() {
//        return stack.removeFirst();
//    }
//    public String peek() {
//        return stack.peekFirst();
//    }
//    public LinkedList<String> getElements() {
//        return new LinkedList<>(stack);
//    }
//}
//// Не удаляйте этот класс - он нужен для вывода результатов на экран
////и проверки
//class Printer {
//    public static void main(String[] args) {
//        MyStack stack = new MyStack();
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать
//            //эти параметры
//            stack.push("apple");
//            stack.push("banana");
//            stack.push("pear");
//            stack.push("grape");
//        } else {
//            for (String arg : args) {
//                stack.push(arg);
//            }
//        }
//        System.out.println(stack.getElements());
//        System.out.println(stack.pop());
//        System.out.println(stack.getElements());
//        System.out.println(stack.peek());
//    }
//}
