package descuento;

public class Descuento2x1 implements DescuentoStrategy {
    @Override
    public double aplicarDescuento(double precio) {
        return precio / 2;
    }

    @Override
    public String getNombre() {
        return "2x1";
    }
}