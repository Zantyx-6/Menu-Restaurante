package menu;

import usuario.Usuario;

public class MenuProxy extends MenuComponent {
    private MenuComponent realMenu;
    private Usuario usuario;

    public MenuProxy(MenuComponent realMenu, Usuario usuario) {
        this.realMenu = realMenu;
        this.usuario = usuario;
    }

    @Override
    public void print() {
        if (realMenu instanceof MenuItem && ((MenuItem) realMenu).isPremium() && !usuario.isAutenticado()) {
            System.out.println("Acceso denegado. Autentíquese para ver este ítem premium.");
        } else {
            realMenu.print();
        }
    }

    @Override
    public String getName() {
        return realMenu.getName();
    }

    @Override
    public double getPrice() {
        return realMenu.getPrice();
    }
}