public class Nodo{
    private Empleado empleado;
    private Nodo siguiente;

    public Nodo(){
        siguiente = null;
    }

    public Nodo(Empleado emp){
        this.empleado = emp;
    }
    
    public Nodo(Empleado emp, Nodo sig){
        this.empleado = emp;
        this.siguiente = sig;
    }

    public Nodo getSiguiente(){ return siguiente;}
    public void setSiguiente(Nodo n) {siguiente = n;}

    public Empleado getEmpleado(){return empleado;}
    public void setEmpleado(Empleado emp){this.empleado = emp;}
    }