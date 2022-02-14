class StockItem {

    String description; //desc of stock item
    static int id; // unique integer ID number
    float price; // holds price rounded to nearest penny
    int quantity; // how many in stock?
    long cool = 10;

    //default constructor
    StockItem() {
        description = null;
        id = (int) Math.random() * 1000; // static variable that assigns random number to stock item
        price = 0.00f;
        quantity = 0;
    }

    //overloaded constructor - description, price, quantity
    StockItem(String d, float p, int q) {
        description = d;
        price = p;
        quantity = q;
    }

    //overridden - toString/ToString method that prints all details of the stock item.
    public String toString() {
        //this should "override" it, but maybe add prints of details here if return does not print?
        return  (description + " has price " + price + ", we currently have " + quantity+ " in stock");
    }


    //methods
    //getters
    //retrieve and print/return d, ID, price, Q
    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }


    //setter
    // take in and set new price for item
    public void setPrice(float price) {
        this.price = price;
        if (this.quantity < 0) {
            System.out.println("Error: price below zero");
        }
    }

    //take in amount to deduct and lower quantity by num, print error below zer0
    public void setLowerQuantity(int quantity) {
        this.quantity -= quantity;
        if (this.quantity < 0) {
            System.out.println("Error: Quantity below zero");
        }
    }

    //take in amount to add and increase q by number
    public void setRaisedQuantity(int quantity) {
        this.quantity += quantity;
    }

}
