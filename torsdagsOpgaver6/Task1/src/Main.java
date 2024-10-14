import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer customerOne = new Customer("Milton", "Hurricne", "M.Hurricane101");
        Customer customerTwo = new Customer("Kamala", "Harris", "Vice");
        Customer customerThree = new Customer("Tim", "Waltz", "GoodGuy");
        customers.add(customerOne);
        customers.add(customerTwo);
        customers.add(customerThree);

        printCustomers(customers);


    }

    static void printCustomers(ArrayList<Customer> customers) {
        for (Customer x : customers) {
            System.out.println(x);
        }

    }
}
