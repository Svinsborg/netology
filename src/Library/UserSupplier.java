package Library;

public class UserSupplier implements Supplier{
    @Override
    public void deliveryBook(String id) {
        System.out.println("Книга  " + id + " перемещение в библиотеку");
    }
}
