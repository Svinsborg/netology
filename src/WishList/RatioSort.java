package WishList;

import java.util.Comparator;

public class RatioSort implements Comparator<Wishlist> {

    private SortType sortType;

    public RatioSort(SortType sortType) {
        this.sortType = sortType;
    }

    @Override
    public int compare(Wishlist o1, Wishlist o2) {
        if (sortType == sortType.ASC) {
            return Integer.compare(o1.getRatio(), o2.getRatio());
        } else {
            return Integer.compare(o2.getRatio(), o1.getRatio());
        }
    }
}
