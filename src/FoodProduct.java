public class FoodProduct extends Product {
    private String expirationDate;

    public FoodProduct(int id, String name, double price, int stock, String expirationDate) {
        super(id, name, price, stock);
        this.expirationDate = expirationDate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Food: " + name + " | Stock: " + stock + " | Expires on: " + expirationDate);
    }
}