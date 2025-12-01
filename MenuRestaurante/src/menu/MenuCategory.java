package menu;

import java.util.ArrayList;
import java.util.List;

public class MenuCategory extends MenuComponent {
    private String name;
    private List<MenuComponent> children = new ArrayList<>();

    public MenuCategory(String name) {
        this.name = name;
    }

    @Override
    public void add(MenuComponent component) {
        children.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        children.remove(component);
    }

    @Override
    public MenuComponent getChild(int i) {
        return children.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (MenuComponent c : children) {
            total += c.getPrice();
        }
        return total;
    }

    @Override
    public void print() {
        System.out.println(name + ":");
        for (MenuComponent c : children) {
            c.print();
        }
    }
}