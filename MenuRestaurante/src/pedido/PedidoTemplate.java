package pedido;

import descuento.DescuentoStrategy;
import menu.MenuComponent;
import java.util.List;

public abstract class PedidoTemplate {
    protected List<MenuComponent> items;
    protected DescuentoStrategy descuento;

    public PedidoTemplate(List<MenuComponent> items, DescuentoStrategy descuento) {
        this.items = items;
        this.descuento = descuento;
    }

    public final void procesarPedido() {
        seleccionarItems();
        double precio = calcularPrecio();
        precio = aplicarDescuento(precio);
        pagar(precio);
        confirmar();
    }

    protected void seleccionarItems() {
        System.out.println("Seleccionando ítems...");
        for (MenuComponent item : items) {
            item.print();
        }
    }

    protected double calcularPrecio() {
        double total = 0;
        for (MenuComponent item : items) {
            total += item.getPrice();
        }
        System.out.println("Precio sin descuento: $" + total);
        return total;
    }

    protected double aplicarDescuento(double precio) {
        double precioFinal = descuento.aplicarDescuento(precio);
        System.out.println("Descuento aplicado: " + descuento.getNombre());
        System.out.println("Precio final: $" + precioFinal);
        return precioFinal;
    }

    protected abstract void pagar(double precio);

    protected void confirmar() {
        System.out.println("Pedido confirmado!");
    }
}