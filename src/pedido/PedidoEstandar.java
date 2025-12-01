package pedido;

import descuento.DescuentoStrategy;
import menu.MenuComponent;
import java.util.List;

public class PedidoEstandar extends PedidoTemplate {
    public PedidoEstandar(List<MenuComponent> items, DescuentoStrategy descuento) {
        super(items, descuento);
    }

    @Override
    protected void pagar(double precio) {
        System.out.println("Pago realizado en efectivo por $" + precio);
    }
}