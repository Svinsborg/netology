package ReversePolish;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите математическую формулу:");
        String input = scanner.nextLine();

        Stack<String> sign = new Stack<>(); // для хранения знаков
        Queue<Integer> numbers = new ArrayDeque<>(); // для хранения цифр

        String[] arrayValues = input.split(" ");


        for (int i = 0; i < arrayValues.length; i++) {
            String value = arrayValues[i];
            if (isNumber(value) == true) {
                numbers.add(Integer.parseInt(value));
            } else {
                sign.add(value);
            }
        }

        while (!numbers.isEmpty()) {
            //ваш код
            System.out.print(((ArrayDeque<Integer>) numbers).pop() + " ");
        }

        while (!sign.isEmpty()) {
            //ваш код
            System.out.print(sign.pop() + " ");
        }
    }

    private static boolean isNumber(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

}