public class Distributor implements Comparable<Distributor> {
    private String name;
    private String country;

    public Distributor(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() { return name; }

    @Override
    public int compareTo(Distributor d) {
        // Alphabetical sorting by name
        return this.name.compareToIgnoreCase(d.getName());
    }

    @Override
    public String toString() { return name + " (" + country + ")"; }
}