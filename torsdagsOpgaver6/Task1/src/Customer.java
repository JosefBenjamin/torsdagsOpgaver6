public class Customer {

    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    private static int counter = 1;

    public Customer(String firstName, String lastName, String userName) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.id = counter;
        counter++;

    }

    public int counterAdd(int x){
        x += counter;
        return counter + 1;
    }

    @Override
    public String toString() {

        // String stringId = String.valueOf(id);
        String stringCounter = String.valueOf(counter);
        return "Customer first name: \n" + this.firstName + "\nCustomer last name: \n" + this.lastName + "\nCustomer username: \n" + this.userName + " " + this.id;

    }

}
