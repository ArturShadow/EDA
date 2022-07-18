
public class Persona {
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private int edad;

    public Persona() {
        this.nombre ="";
        this.aPaterno = "";
        this.aMaterno = "";
        this.edad = 0;
    }
    public Persona(String nombre, String aPaterno, String aMaterno, int edad) {
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getaMaterno() {
        return aMaterno;
    }
    
    public String getaPaterno() {
        return aPaterno;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }
}
