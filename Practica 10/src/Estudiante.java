public class Estudiante implements Comparable<Estudiante> {
    private String nombre;
    private String matricula;
    private String grupo;
    private Double promedio;
    public Nota notas;

    public Estudiante(String nombre, String matricula, String grupo) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.grupo = grupo;
        notas = new Nota();
    }

    public Estudiante() {
        super();
    }

    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getGrupo() {
        return grupo;
    }

    public Nota getNotas() {
        return notas;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    private void calcularPromedsio() {
        double acum = 0;
        for (Double calificacion : this.notas.calificaciones) {
            acum =+ calificacion;
        }
        promedio = (acum/notas.calificaciones.size());
    }

    @Override
    public int compareTo(Estudiante e) {
        // TODO Auto-generated method stub
        double da = this.getPromedio();
        double db = e.getPromedio();
        return da.compareTo(db);
    }


}
