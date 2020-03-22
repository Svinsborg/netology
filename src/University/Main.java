package University;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    static final String sEnd = "end";
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

            switch (input) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    printStudent();
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void printStudent() {
        for (Student s : students) {
            System.out.println(s.toString());
        }
    }

    private static boolean getStr(String out, StringBuffer got) {
        System.out.println(out);
        got.replace(0, got.length(), scanner.nextLine());
        if (sEnd.equals(got.toString())) return true;
        return false;
    }

    private static void addStudent() {
        StringBuffer input = new StringBuffer();
        while (true) {
            if ( getStr("Введите данные студента \n ФИО, группа, № студ. билета", input ));
            break;

            Scanner buf = new Scanner(input.toString());
            buf.useDelimiter(",");
            Student add = new Student(buf.next().trim(), buf.next().trim(), buf.next().trim());
            buf.close();

            if (students.contains(add)) {
                System.out.println("Студент существует \n проверть вводимые данные!");
            } else students.add(add);
        }
    }
}
