package WishList;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    static final String sEnd = "end";

    private static Scanner scanner = new Scanner(System.in);
    private static TreeSet<Wishlist> list = new TreeSet<>(new PriseSort(SortType.ASC));

    public static void main(String[] args) {

        System.out.println("######################################");
        System.out.println("###            Wishlist             ##");
        System.out.println("######################################");

        while (true) {
            System.out.println("#              Меню:                  #\n" +
                    "#   1 - Добавить  покупку             #\n" +
                    "#   2 - Выыод списка покупок          #\n" +
                    "#   3 - Выбор сортировки              #\n" +
                    "#   0 - ВЫХОД                         #\n" +
                    "#######################################\n");
            int input = Integer.parseInt(scanner.nextLine());

            switch (input) {
                case 1:
                    addWish();
                    break;
                case 2:
                    printList();
                    break;
                case 3:
                    SortList();
                    break;

                default:
                    System.exit(0);
                    break;
            }
        }
    }


    private static boolean getStr(String out, StringBuffer got) {
        System.out.println(out);
        got.replace(0, got.length(), scanner.nextLine());
        if (sEnd.equals(got.toString())) return true;
        return false;
    }

    private static void addWish() {
        StringBuffer input = new StringBuffer();
        while (true) {
            if (getStr("Введите название покупки, end для выхода", input)) break;
            String name = input.toString();

            if (getStr("Введите описание, end для выхода", input)) break;
            String description = input.toString();

            double dPrice = 0;
            while (true) {
                if (getStr("Введите стоимость, end для выхода", input)) break;
                String price = input.toString();

                try {
                    dPrice = Double.parseDouble(price);
                    if (dPrice < 0) {
                        System.out.println("Число не может быть отрицательным");
                        continue;
                    } else break;
                } catch (Throwable e) {
                    System.out.println("Ошибка ввода данных");
                    continue;
                }
            }

            int iRatio = 0;
            while (true) {
                if (getStr("Введите приоритет (от 0 до 5), end для выхода", input)) break;
                String ratio = input.toString();

                try {
                    iRatio = Integer.parseInt(ratio);
                    if (iRatio < 0 || iRatio > 5) {
                        System.out.println("Введите число в диапазоне от 0 до 5");
                        continue;
                    } else break;
                } catch (Throwable e) {
                    System.out.println("Введите число в диапазоне от 0 до 5");
                    continue;
                }
            }

            list.add(new Wishlist(name, description, dPrice, iRatio));
            System.out.println("Success");
        }
    }

    private static void printList() {
        for (Wishlist s : list) {
            System.out.println(s.toString());
        }
    }

    private static void SortList() {
        while (true) {
            System.out.println("#           Сортировка:               #\n" +
                    "#   1 - Поубыванию  цены              #\n" +
                    "#   2 - По  возрастанию  цены         #\n" +
                    "#   3 - По  возрастанию приоритета    #\n" +
                    "#   4 - По  убыванию  приоритета      #\n" +
                    "#   0 - ВЫХОД                         #\n" +
                    "#######################################\n");
            int input = Integer.parseInt(scanner.nextLine());

            Comparator wlc = null;

            switch (input) {
                case 1:
                    wlc = new PriseSort(SortType.DESC);
                    break;
                case 2:
                    wlc = new PriseSort(SortType.ASC);
                    break;
                case 3:
                    wlc = new RatioSort(SortType.DESC);
                    break;
                case 4:
                    wlc = new RatioSort(SortType.ASC);
                    break;

                default:
                    System.exit(0);
                    break;
            }
            TreeSet<Wishlist> wish = new TreeSet<Wishlist>(wlc);
            wish.addAll(list);
            list = wish;
            System.out.println("Соритровка по" + input);

            break;
        }
    }
}

