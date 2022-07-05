public class Empleado extends Persona {
    private String correo;
    private String telefono;

    public Empleado(String nombre, String aPaterno, String aMaterno, int edad, String correo, String telefono) {
        super(nombre, aPaterno, aMaterno, edad);
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        String datos;
        datos = "Nombre: " + super.getNombre() + "\nApellido Paterno: " + super.getaPaterno() + "\nApellido Materno: " + super.getaMaterno() + "\nEdad: " + super.getEdad() + "\nCorreo: " + getCorreo() + "\nTelefono: " + getTelefono()+"\n_______________________";
        return datos;
    }
}