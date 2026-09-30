public class Item {
    private String name;    //encapsulating the name and price of the item as private variables
    private double price;

    public Item(String name, double price) {     //method to initialize the name and price of the item
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero.");
        }
        this.name = name;        //applying constructor to initialize the name and price of the item
        this.price = price;
    }

    public String getName() {       //using getter methods to access the private variables 
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double calculateTotal(int quantity) {    //method to calculate the total price 
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        return quantity * this.price;
    }
}