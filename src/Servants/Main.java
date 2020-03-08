package Servants;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        while (true) {
            System.out.println("Введите информацию о сотруднике (фамилия, имя, возраст, пол, образование, должность, отдел");

            String surname = scanner.next();
            String name = scanner.next();
            int age = scanner.nextInt();
            String sex = scanner.next();
            String education = scanner.next();
            String post = scanner.next();
            String division = scanner.nextLine();

            Employee emp = new Employee(surname, name, age, sex, education, post, division);
            list.add(emp);

            System.out.println("Если хотите закончить ввод данных, введите end, для продолжения нажмите Enter");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                System.out.println("|-----------------------------------------------------------------------------------------------------------|");
                System.out.println("|       Фамилия     |        Имя        |   Возраст |  Пол  |  Образование  |  Должность    |     Отдел     |");
                System.out.println("|===================|===================|===========|=======|===============|===============|===============|");

                for (int i = 0; i < list.size(); i++) {
                    Employee sotr = list.get(i);
                    System.out.println(sotr);
                }

                while (true) {
                    System.out.println("Если не хотите менять данные, введите end");
                    String enter = scanner.nextLine();
                    if ("end".equals(enter) || "rjytw".equals(enter) || "конец".equals(enter) || "утв".equals(enter)) {
                        break;
                    } else {
                        System.out.println("Введите фамилию и имя работника, для которого хотите изменить данные");
                        surname = scanner.next();
                        name = scanner.next();
                        int empIndex = searchBySurname(surname, name, list);
                        if (empIndex != -1) {

                            // Фамилия
                            System.out.println("Изменить фамилию работника? (Нет / Новая фамилия)");
                            String buffer = scanner.nextLine();  // Ловушка! этот next и nextLine всю плешь проели!
                            String newSurname = scanner.nextLine();
                            if ("нет".equals(newSurname) || "тщ".equals(newSurname) || "no".equals(newSurname) || "ytn".equals(newSurname)) {
                                System.out.println(list.get(empIndex).getSurname());
                            } else {
                                list.get(empIndex).setSurname(newSurname);
                            }

                            //Имя
                            System.out.println("Изменить имя работника? (Нет / Новое имя)");
                            String newName = scanner.nextLine();
                            if ("нет".equals(newName) || "тщ".equals(newName) || "no".equals(newName) || "ytn".equals(newName)) {
                                System.out.println(list.get(empIndex).getName());
                            } else {
                                list.get(empIndex).setName(newName);
                            }

                            // Возраст
                            System.out.println("Изменить возраст работника? (Нет / Новые Днные)");
                            String newAge = scanner.nextLine();
                            if ("нет".equals(newAge) || "тщ".equals(newAge) || "no".equals(newAge) || "ytn".equals(newAge)) {
                                System.out.println(list.get(empIndex).getAge());
                            } else {
                                int tempAge = Integer.parseInt(newAge);
                                list.get(empIndex).setAge(tempAge);
                            }

                            // Пол
                            System.out.println("Изменить пол работника? (Нет / Новые Днные)");
                            String newSex = scanner.nextLine();
                            if ("нет".equals(newSex) || "тщ".equals(newSex) || "no".equals(newSex) || "ytn".equals(newSex)) {
                                System.out.println(list.get(empIndex).getSex());
                            } else {
                                list.get(empIndex).setSex(newSex);
                            }

                            // Образование
                            System.out.println("Изменить образование работника? (Нет / Новые Днные)");
                            String newEducation = scanner.nextLine();
                            if ("нет".equals(newEducation) || "тщ".equals(newEducation) || "no".equals(newEducation) || "ytn".equals(newEducation)) {
                                System.out.println(list.get(empIndex).getEducation());
                            } else {
                                list.get(empIndex).setEducation(newEducation);
                            }

                            // Должность
                            System.out.println("Изменить должность работника? (Нет / Новые Днные)");
                            String newPost = scanner.nextLine();
                            if ("нет".equals(newPost) || "тщ".equals(newPost) || "no".equals(newPost) || "ytn".equals(newPost)) {
                                System.out.println(list.get(empIndex).getPost());
                            } else {
                                list.get(empIndex).setPost(newPost);
                            }

                            // Отдел
                            System.out.println("Изменить отдел работника? (Нет / Новые Днные)");
                            String newDivision = scanner.nextLine();
                            if ("нет".equals(newDivision) || "тщ".equals(newDivision) || "no".equals(newDivision) || "ytn".equals(newDivision)) {
                                System.out.println(list.get(empIndex).getDivision());
                            } else {
                                list.get(empIndex).setDivision(newDivision);
                            }

                        } else {
                            System.out.println("Поиск не дал результатов!");
                        }
                    }
                }

                System.out.println("|-----------------------------------------------------------------------------------------------------------|");
                System.out.println("|       Фамилия     |        Имя        |   Возраст |  Пол  |  Образование  |  Должность    |     Отдел     |");
                System.out.println("|===================|===================|===========|=======|===============|===============|===============|");

                for (int i = 0; i < list.size(); i++) {
                    Employee sotr = list.get(i);
                    System.out.println(sotr);
                }
                break;
            }
        }
    }


    private static int searchBySurname(String surname, String name, List<Employee> list) {
        int pos = -1;
        System.out.println(" ");

        for (int i = 0; i < list.size(); i++) {
            Employee employee = list.get(i);
            if (surname.equals(employee.getSurname())){
                if (name.equals(employee.getName())){
                    pos = i;
                    System.out.println("Найден сотрудник "+pos);
                    break;
                }
            }
        }
        return pos;
    }
}