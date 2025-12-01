package menu;

public class MenuItem extends MenuComponent {
    private String name;
    private double price;
    private boolean premium;

    public MenuItem(String name, double price, boolean premium) {
        this.name = name;
        this.price = price;
        this.premium = premium;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public boolean isPremium() {
        return premium;
    }

    @Override
    public void print() {
        System.out.println("  " + name + " - $" + price + (premium ? " (Premium)" : ""));
    }
}