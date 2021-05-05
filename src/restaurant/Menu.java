package restaurant;

import java.util.ArrayList;
import java.util.HashMap;
public class Menu {
    private ArrayList<MenuItem> items;
    private boolean lastUpdated;

    public static void main(String[] args) {

    }
    public void addItem(MenuItem item) {
        if (!items.contains(item)) {
            items.add(item);
        }
    }
    public void removeItem(MenuItem item) {
        items.remove()
    }
}
