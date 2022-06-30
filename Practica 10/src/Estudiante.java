public class Estudiante implements Comparable <Estudiante> {
    private String nombre;
    private String matricula;
    private String grupo;
    private double promedio;
    private Nota notas;

    /**
     * Constructor
     * Constructor con parametros y sed inicializan las notas
     * @param nombre
     * @param matricula
     * @param grupo
     */
    public Estudiante(String nombre, String matricula, String grupo) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.grupo = grupo;
        this.notas = new Nota();
    }
    
    /**
     * constructor
     * constructor sin paramtros y solo se inicializan la notas
     */
    public Estudiante() {
        notas = new Nota();
    }

    /**
     * getNombre
     * Retorna el nombre del estudiante
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * getPromedio
     * retorna el promedio del estudiante
     * @return promedio
     */
    public double getPromedio() {
        return promedio;
    }
    
    /**
     * SetGrupo
     * Guarda el grupo en el que esta el estudiante
     * @param grupo
     */
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    /**
     * setNombre
     * Guarda el nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * setMatricula
     * guarda la matricula
     * @param matricula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Retorna el atributo notas
     * @return
     */
    public Nota getNotas() {
        return notas;
    }

    /**
     * toString
     * Metodo sobreescrito para mostrar los datos del estudiante
     */
    @Override
    public String toString() {
        String cadena = "";
        cadena = "\nNombre:    " + nombre +
                "\nMatrícula: " + matricula +
                "\nGrupo:     " + grupo;
        return cadena;
    }
    
    /**
     * calcularPromedio
     * Metgodo para calcular el peromedio
     */
    public void calcularPromedio() {
        double acum = 0, prom = 0;
        for (Double cali : getNotas().getCalificaciones()) {
            acum = acum + cali;
        }
        prom = acum / (getNotas().getCalificaciones().size());
        this.promedio = prom;
    }
    
    /**
     * reporteCalificaciones
     * Metodo para mostrar las calificaciones de cada materia y el promedio
     */
    public void reporteCalificaciones() {
        System.out.println("Materia                Calficación");
        for (int i = 0; i < getNotas().getMaterias().size(); i++) {
            System.out.print(getNotas().getMaterias().get(i));
            System.out.println("\t\t" + this.getNotas().getCalificaciones().get(i));
        }
        System.out.println("Promedio            "+ getPromedio());
    }

    /**
     * compareTo
     * metodo para el ordenamiento de los estudiantes
     */
    @Override
    public int compareTo(Estudiante e) {
        Double da = this.getPromedio();
        Double db = e.getPromedio();
        return da.compareTo(db);

    }
}
