public class App {
    public static void main(String[] args) throws Exception {
        Empleado empleado3 = new Empleado("Arturo", "Loya", "Baca", 21, "luisarturo0809@hotmail.com", "6142863943");

        Empleado empleado2 = new Empleado("Humbrto", "Jaques", "Baca", 20, "luishumb5067@hotmail.com", "6145264585");

        Empleado empleado = new Empleado("Gabriela", "Baca", "Maynez", 40, "gab4057@hotmail.com", "6141429323");

        ListaCircularDoble lcd = new ListaCircularDoble();

        lcd.addOrden(empleado);
        lcd.addOrden(empleado2);
        lcd.addOrden(empleado3);

        lcd.mostrarID();

    }
}
