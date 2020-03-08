package Library;

public interface Librarian {
    void order(String id, Supplier supplier);

    void giveBook(String id);
}
