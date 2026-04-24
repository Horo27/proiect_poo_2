public class Main {
    public static void main(String[] args) {
        StoreService service = new StoreService();

        // 1. & 5. & 10. Populate system data
        service.addCategory(new Category("Dairy"));
        service.addCategory(new Category("Appliances"));
        service.addEmployee(new Employee("John Doe", "Manager"));

        // Using inheritance in collections
        Product p1 = new FoodProduct(1, "Milk", 6.5, 100, "20-04-2026");
        Product p2 = new ElectronicProduct(2, "TV", 1500.0, 10, 24);
        service.addProduct(p1);
        service.addProduct(p2);

        // 3. Add distributors
        service.addDistributor(new Distributor("Zeno Distribution", "Romania"));
        service.addDistributor(new Distributor("Alpha Tech", "Germany"));
        service.addDistributor(new Distributor("Balkan Foods", "Bulgaria"));

        // Calls to the rest of the actions/queries:
        // 2. Display products
        service.displayProducts();

        // 4. Display distributors (Demonstrates TreeSet functionality, i.e., sorting)
        service.displayDistributors();

        // 6. Display categories
        service.displayCategories();

        // 7. Search
        Product found = service.searchProduct("Milk");
        System.out.println("\nSearch for 'Milk': " + (found != null ? "Found in stock!" : "Not found."));

        // 8. Stock transactions
        service.recordTransaction("Milk", 20, "OUT");
        service.recordTransaction("TV", 5, "IN");

        // 9. Display history and transaction effects
        service.displayTransactions();
        service.displayProducts();
    }
}