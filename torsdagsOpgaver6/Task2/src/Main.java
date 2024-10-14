import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {

    Cafe newCafe = new Cafe();

    newCafe.loadMenuData();

        System.out.println(newCafe.getCoffee());


    }
}
