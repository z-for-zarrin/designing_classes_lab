import java.util.ArrayList;

public class ShoppingTrolley {
    // class attributes
    ArrayList<String> items;

    public ShoppingTrolley() {
        this.items = new ArrayList<>();
    }

    public void addItem(String item) {
        this.items.add(item);
    }
}
