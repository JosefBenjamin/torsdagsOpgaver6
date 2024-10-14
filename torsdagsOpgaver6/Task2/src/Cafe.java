import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cafe {

    private ArrayList<String> coffeeMenu = new ArrayList<String>();

    public ArrayList<String> getCoffee() {
        return this.coffeeMenu;
    }

    public ArrayList<String> loadMenuData() {
        try {
            File file = new File("src/coffees.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                coffeeMenu.add(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        return getCoffee();
    }
}

