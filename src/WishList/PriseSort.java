package WishList;

import java.util.Comparator;

public class PriseSort implements Comparator<Wishlist> {

    private SortType sortType;

    public PriseSort(SortType sortType) {
        this.sortType = sortType;
    }

    @Override
    public int compare(Wishlist o1, Wishlist o2) {
        if (sortType == sortType.ASC) {
            return Double.compare(o1.getPrice(), o2.getPrice());
        } else {
            return Double.compare(o2.getPrice(), o1.getPrice());
        }
    }
}
