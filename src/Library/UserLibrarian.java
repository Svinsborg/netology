package Library;

public class UserLibrarian implements Librarian, Reader {

    @Override
    public void order(String id, Supplier supplier) {
        supplier.deliveryBook(id);
        System.out.println("Книга " + id + " доставлена в библиотеку");
    }


    @Override
    public void giveBook(String id) {
        System.out.println("Книга " + id + " выдана");
    }

    @Override
    public void takeBook(String id, Librarian librarian) {
        librarian.giveBook(id);
        System.out.println("Книга " + id + " выдана");
    }

    @Override
    public void queryBook(String id) {
        System.out.println("Будет возвращена 2021-02-18");
    }

    @Override
    public void readBook(String id) {
        System.out.println("Читаю книгу " + id);
    }

    @Override
    public void takeBook(String id) {

    }
}