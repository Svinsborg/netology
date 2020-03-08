package Library;

public interface Reader {
    void takeBook(String id, Librarian librarian);

    void queryBook(String id);

    void readBook(String id);

    void takeBook(String id);
}
