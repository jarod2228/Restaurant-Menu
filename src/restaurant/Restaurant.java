package restaurant;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
public class Restaurant {
    public static void main(String[] args) {
    MenuItem newItem1 = new MenuItem(4.99, "Brisket", "Dinner", true);
    MenuItem newItem2 = new MenuItem(6.99, "Toasted Ravioli", "Appetizer", false);
    MenuItem newItem3 = new MenuItem(.99, "Deep Fried Jarod's", "Dinner", true);

    Date today = Calendar.getInstance().getTime();
    ArrayList<MenuItem> startingMenu = new ArrayList<>();

    Menu ourMenu = new Menu(startingMenu, today);
    ourMenu.addItem(newItem1);
    ourMenu.addItem(newItem2);
    ourMenu.addItem(newItem3);

    ourMenu.printMenu();

    ourMenu.printItem(newItem3);

    ourMenu.removeItem(newItem3);

    ourMenu.printMenu();

    System.out.println(ourMenu.menuUpdated());
    }
}
