package Elevator;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int FLOOR = 25;
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new ArrayDeque<>();
        int waitDoorsInSeconds = 10; // время закрытие/открытие дверей
        int waitMoveInSeconds = 5; // время движение между этажами
        int totalSeconds = 0; // всего потрачено времени
        int previousFloor = -1; // для хранения предыдущей остановки

        while (true) {
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            System.out.println("от 0 до 25");

            String value = scanner.nextLine();
            if ("0".equals(value)) {
                break;
            }
            int numberFloor = Integer.parseInt(value);

            if (numberFloor > FLOOR) {
                System.out.println("Такого этажа нет в доме");
            } else {
                queue.add(numberFloor);
            }
        }
        while (!queue.isEmpty()) {
            String extractFloor = String.valueOf(queue.poll()); // так и не понял как коректно сделать что ыб не появлялся эксепшин ...
            int currentFloor = Integer.parseInt(extractFloor);
            if (previousFloor != -1) {
                totalSeconds += Math.abs(currentFloor - previousFloor) * waitMoveInSeconds;
                totalSeconds:
                totalSeconds += waitDoorsInSeconds;
            } else {
                previousFloor = currentFloor;
            }
            System.out.print("Этаж: " + extractFloor + " -> ");
        }
        System.out.println("Этаж: 0");
        System.out.println("Время затраченное лифтом на маршрут =: " + totalSeconds + " с.");
    }
}