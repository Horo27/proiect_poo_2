public class ElectronicProduct extends Product {
    private int warrantyMonths;

    public ElectronicProduct(int id, String name, double price, int stock, int warrantyMonths) {
        super(id, name, price, stock);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public void displayDetails() {
        System.out.println("Electronic: " + name + " | Stock: " + stock + " | Warranty: " + warrantyMonths + " months");
    }
}