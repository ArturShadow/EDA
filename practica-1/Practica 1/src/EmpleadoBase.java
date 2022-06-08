public abstract class EmpleadoBase {
    private String nombre;
    private String direccion;
    private String noSocial;

    public EmpleadoBase() {
        this.nombre = "";
        this.direccion = "";
        this.noSocial = "";
    }

    public EmpleadoBase(String nombre, String direccion, String noSocial) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.noSocial = noSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNoSocial(String noSocial) {
        this.noSocial = noSocial;
    }

    public String getNoSocial() {
        return noSocial;
    }

    public abstract void pago(double pagoHora);
}
