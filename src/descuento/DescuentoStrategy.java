package descuento;

public interface DescuentoStrategy {
    double aplicarDescuento(double precio);

    String getNombre();
}