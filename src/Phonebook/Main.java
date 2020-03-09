package Phonebook;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static PhoneContacts phoneContacts = new PhoneContacts();

    public static void main(String[] args) {

        System.out.println("######################################");
        System.out.println("###        Телефонная книга         ##");
        System.out.println("######################################");


        while (true) {
            System.out.println("#              Меню:                  #\n" +
                    "#   1 - Создать группу                #\n" +
                    "#   2 - Создать контакт               #\n" +
                    "#   3 - Добавит контакт в группу      #\n" +
                    "#   4 - Выыод списка контактов        #\n" +
                    "#   5 - Вывод справочника             #\n" +
                    "#   6 - Сортировать список контакотов #\n" +
                    "#   0 - ВЫХОД                         #\n" +
                    "#######################################\n");
            int input = Integer.parseInt(scanner.nextLine());

            switch (input){
                case 1:
                    newGroupeAdd();
                    break;
                case 2:
                    newContactAdd();
                    break;
                case 3:
                    break;
                case 4:
                    phoneContacts.showContacts();
                    break;
                case 5:
                    phoneContacts.showAllContacts();
                    break;
/*                case 6:
                    break;*/
                default:
                    System.exit(0);
                    break;

            }
        }


    }



    private static void newContactAdd() {
        System.out.println("Имя контакта, телефон:");
        String contactName = scanner.next();
        String phoneContact = scanner.nextLine();
        Contact contact = new Contact(contactName, phoneContact);
        phoneContacts.contactsAdd(contact);
        System.out.println("Укажите группы контакта через пробел:");
        String groupeName = scanner.nextLine();
        phoneContacts.checkAddContactsToGroup(groupeName, contact);

    }

    private static void newGroupeAdd() {
        System.out.println("Название группы:");
        String groupeName = scanner.nextLine();
        if (phoneContacts.checkGroup(groupeName)){
            System.out.println("Группа с именем" + groupeName + "уже существует!");
        } else {
            phoneContacts.groupsAdd(groupeName);
        }

    }
}
