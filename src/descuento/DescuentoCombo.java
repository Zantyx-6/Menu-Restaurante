package descuento;

public class DescuentoCombo implements DescuentoStrategy {
    @Override
    public double aplicarDescuento(double precio) {
        return precio - 10; // Ejemplo: descuento fijo por combo
    }

    @Override
    public String getNombre() {
        return "Combo";
    }
}