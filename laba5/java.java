import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> deque = new LinkedList<>();

        while (true) {
            System.out.println("Текущий список элементов: " + deque);

            System.out.println("Выберите действие:");
            System.out.println("1. Добавить элемент в начало");
            System.out.println("2. Добавить элемент в конец");
            System.out.println("3. Удалить первый элемент");
            System.out.println("4. Удалить последний элемент");
            System.out.println("5. Выйти из программы");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите элемент: ");
                    int element1 = scanner.nextInt();
                    deque.addFirst(element1);
                    break;
                case 2:
                    System.out.print("Введите элемент: ");
                    int element2 = scanner.nextInt();
                    deque.addLast(element2);
                    break;
                case 3:
                    if (!deque.isEmpty()) {
                        deque.removeFirst();
                    }
                    break;
                case 4:
                    if (!deque.isEmpty()) {
                        deque.removeLast();
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Неверный выбор");
            }
        }
    }
}