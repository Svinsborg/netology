package University;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    static Set<Student> students = new HashSet<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("######################################");
        System.out.println("###           University            ##");
        System.out.println("######################################");

        while (true) {
            System.out.println("#              Меню:                  #\n" +
                    "#   1 - Добавить студента             #\n" +
                    "#   2 - Выыод списка студентов        #\n" +
                    "#   0 - ВЫХОД                         #\n" +
                    "#######################################\n");
            int input = Integer.parseInt(scanner.nextLine());

            switch (input){
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    break;

                default:
                    System.exit(0);
                    break;

            }
        }


    }
}
