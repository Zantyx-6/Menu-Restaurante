package usuario;

public class Usuario {
    private String nombre;
    private boolean autenticado;
    private boolean vip;

    public Usuario(String nombre, boolean autenticado, boolean vip) {
        this.nombre = nombre;
        this.autenticado = autenticado;
        this.vip = vip;
    }

    public boolean isAutenticado() {
        return autenticado;
    }

    public boolean isVIP() {
        return vip;
    }

    public String getNombre() {
        return nombre;
    }
}