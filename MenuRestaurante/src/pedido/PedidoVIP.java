package pedido;

import descuento.DescuentoStrategy;
import menu.MenuComponent;
import java.util.List;

public class PedidoVIP extends PedidoTemplate {
    public PedidoVIP(List<MenuComponent> items, DescuentoStrategy descuento) {
        super(items, descuento);
    }

    @Override
    protected void pagar(double precio) {
        System.out.println("Pago realizado con tarjeta VIP por $" + precio);
        System.out.println("¡Gracias por ser cliente VIP!");
    }

    @Override
    protected void confirmar() {
        System.out.println("Pedido VIP confirmado y notificado por email!");
    }
}