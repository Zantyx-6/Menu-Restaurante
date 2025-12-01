import menu.*;
import descuento.*;
import pedido.*;
import usuario.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Crear menú jerárquico
        MenuCategory bebidas = new MenuCategory("Bebidas");
        MenuCategory gaseosas = new MenuCategory("Gaseosas");
        MenuItem cocaCola = new MenuItem("Coca-Cola", 5, true);
        MenuItem pepsi = new MenuItem("Pepsi", 4, false);
        gaseosas.add(cocaCola);
        gaseosas.add(pepsi);
        bebidas.add(gaseosas);
        bebidas.add(new MenuItem("Jugo", 3, false));

        // Usuario y autenticación
        Usuario usuario = new Usuario("Juan", false, false);
        Usuario usuarioVIP = new Usuario("Ana", true, true);

        // Proxy para menú premium
        MenuProxy proxyCocaCola = new MenuProxy(cocaCola, usuario);
        MenuProxy proxyCocaColaVIP = new MenuProxy(cocaCola, usuarioVIP);

        System.out.println("Menú para usuario normal:");
        bebidas.print();
        proxyCocaCola.print();
        System.out.println("\nMenú para usuario VIP:");
        proxyCocaColaVIP.print();

        // Selección de ítems y descuentos
        List<MenuComponent> seleccion = Arrays.asList(pepsi, cocaCola);
        DescuentoStrategy descuento = new DescuentoPorcentaje(10);
        DescuentoStrategy descuento2x1 = new Descuento2x1();
        DescuentoStrategy descuentoCombo = new DescuentoCombo();

        // Pedido estándar
        System.out.println("\nPedido estándar:");
        PedidoTemplate pedido = new PedidoEstandar(seleccion, descuento);
        pedido.procesarPedido();

        // Pedido VIP con otro descuento
        System.out.println("\nPedido VIP:");
        PedidoTemplate pedidoVIP = new PedidoVIP(seleccion, descuento2x1);
        pedidoVIP.procesarPedido();

        // Extensibilidad: cambiar estrategia en runtime
        System.out.println("\nPedido VIP con combo:");
        pedidoVIP = new PedidoVIP(seleccion, descuentoCombo);
        pedidoVIP.procesarPedido();
    }
}