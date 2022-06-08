public class EmpleadoPorHora extends EmpleadoBase {
    private double sueldo;
    private int horas;

    public EmpleadoPorHora() {
        this.horas = 0;
    }

    public EmpleadoPorHora() : base(nombre, direccion, noSocial){}
    public EmpleadoPorHora() {
        super(nombre, direccion, noSocial)
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    public int getHoras() {
        return horas;
    }

    public double getSueldo() {
        return sueldo;
    }
    @Override
    public void pago(double pagoHora) {
        this.sueldo = pagoHora * horas;
    }
}
