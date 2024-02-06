import java.util.ArrayList;

public class ShoppingTrolley {
    // class attributes
    private ArrayList<String> items;

    public ShoppingTrolley() {
        this.items = new ArrayList<>();
    }

    public void addItem(String item) {
        this.items.add(item);
    }

    public int countItems() {
        return this.items.size();
    }
}
