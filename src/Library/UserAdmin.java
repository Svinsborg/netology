package Library;

public class UserAdmin implements Administrator, Reader  {

    @Override
    public void takeBook(String id, Librarian librarian) {
        librarian.giveBook(id);
    }

    @Override
    public void queryBook(String id) {
        System.out.println("2020-05-18");
    }

    @Override
    public void readBook(String id) {
        System.out.println("Читаю книгу " + id);
    }

    @Override
    public void takeBook(String id) {

    }

    @Override
    public void returnBook(String id, Reader reader) {
        reader.queryBook(id);
    }
}