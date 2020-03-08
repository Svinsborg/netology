package Library;

public class Main {
    public static void main(String[] args) {
        Supplier oneSupplier = new UserSupplier();


        Librarian librarian = new UserLibrarian();

        Reader reader = (Reader) librarian;

        Reader user1 = new UserAdmin();

        Administrator admin = (Administrator) user1;

        System.out.println("Запрос поставщика на доставку книги в библиотеку:");
        librarian.order("11", oneSupplier);

        System.out.println();
        System.out.println("Запрос выдачи книги:");
        user1.takeBook("254", librarian);

        System.out.println();
        System.out.println("Запрос пользователя на возврат книги:");
        admin.returnBook("547", user1);
    }
}
