import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StoreService {
    // At least 2 collections, one of which is sorted (TreeSet with Comparable elements)
    private List<Product> products = new ArrayList<>();
    private Set<Distributor> distributors = new TreeSet<>();
    private List<Category> categories = new ArrayList<>();
    private List<Transaction> transactions = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    // 1. Add new product
    public void addProduct(Product p) {
        products.add(p);
        System.out.println("Product added: " + p.getName());
    }

    // 2. Display all products
    public void displayProducts() {
        System.out.println("\n--- Product List ---");
        for (Product p : products) {
            p.displayDetails();
        }
    }

    // 3. Add distributor
    public void addDistributor(Distributor d) {
        distributors.add(d);
    }

    // 4. Display distributors (automatically sorted by TreeSet)
    public void displayDistributors() {
        System.out.println("\n--- Sorted Distributor List ---");
        for (Distributor d : distributors) {
            System.out.println(d);
        }
    }

    // 5. Add category
    public void addCategory(Category c) { categories.add(c); }

    // 6. Display categories
    public void displayCategories() {
        System.out.println("\n--- Categories ---");
        for (Category c : categories) System.out.println(c.getTitle());
    }

    // 7. Search product by name
    public Product searchProduct(String name) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null; // Not found
    }

    // 8. Record stock transaction
    public void recordTransaction(String productName, int quantity, String type) {
        Product p = searchProduct(productName);
        if (p != null) {
            if (type.equals("OUT") && p.getStock() >= quantity) {
                p.setStock(p.getStock() - quantity);
            } else if (type.equals("IN")) {
                p.setStock(p.getStock() + quantity);
            } else {
                System.out.println("Invalid transaction for " + productName + ". Insufficient stock.");
                return;
            }
            transactions.add(new Transaction(type, p, quantity));
        } else {
            System.out.println("Product " + productName + " was not found.");
        }
    }

    // 9. Display transaction history
    public void displayTransactions() {
        System.out.println("\n--- Transaction History ---");
        for (Transaction t : transactions) System.out.println(t);
    }

    // 10. Add employee
    public void addEmployee(Employee e) {
        employees.add(e);
        System.out.println("New employee: " + e.getName());
    }
}