package Notebook;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
// новй год!


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> task = new ArrayList<>();

        while (true) {
            System.out.println("Выберите пункт меню (для завершения введите end)");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Вывести список задач");
            System.out.println("3. Удалить задачу");
            System.out.println("0. Выход");
            String value = scanner.nextLine();
            if ("end".equals(value)) {
                break;
            }
            int number = Integer.parseInt(value);

            switch (number) {
                case 1:
                    System.out.println("Введите название задачи");
                    String userTask = scanner.nextLine();
                    task.add(userTask);
                    break;
                case 2:
                    if (task.isEmpty() == true) {
                        System.out.println("Задачи отсутствуют");
                    } else {
                        System.out.println("Текущие задачи:");

                        ShowTask(task);

/*                        Iterator i = task.iterator();
                        int index = 0;
                        while (i.hasNext()) {
                            System.out.printf("Задача № %d: %s %n", index, i.next());
                            index++;
                        }*/
                    }
                    break;
                case 3:
                    System.out.println("Введите номер задачи для удаления");
                    String delTask = scanner.nextLine();
                    int num = Integer.parseInt(delTask);
                    String t = task.get(num);
                    boolean isRemoved = task.remove(t);
                    if (isRemoved == true) {
                        System.out.printf("Задача %s: успешно удалена", t);
                    } else {
                        System.out.printf("Ошибка %s удаления!", t);
                    }

                    System.out.println("Текущие задачи:");

                    ShowTask(task);

/*                    Iterator i = task.iterator();
                    int index = 0;
                    while (i.hasNext()) {
                        System.out.printf("Задача № %d: %s %n", index, i.next());
                        index++;
                    }*/
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void ShowTask(List<String> date) {
        for (int i = 0; i < date.size(); i++) {
            String show = date.get(i);
            System.out.printf("Задача № %d: %s %n", i, show);
        }
    }
}