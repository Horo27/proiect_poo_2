public abstract class Product {
    protected int id;
    protected String name;
    protected double price;
    protected int stock;

    public Product(int id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() { return name; }
    public void setStock(int stock) { this.stock = stock; }
    public int getStock() { return stock; }

    public abstract void displayDetails();
}