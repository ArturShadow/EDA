import java.util.ArrayList;

public class Nota {
    /**
     * Atributo Calificaciones
     * TODO es un arraylist de double para las calificaciones
     */
    private ArrayList<Double> calificaciones;
    /**
     * Atributo Calificaciones
     * *TODO es un arraylist de strngs 
     */
    private ArrayList<String> materias;

    /**
     * Constructor
     */
    public Nota() {
        calificaciones = new ArrayList<>();
        materias = new ArrayList<>(7);
    }

    /**
     * setMaterias
     * TODO este metodo guarda en materias el arreglo de strings con los nombres de las materias
     * @param materias
     */
    public void setMaterias(ArrayList<String> materias) {
        this.materias = materias;
    }

    /**
     * getMaterias
     * TODO retorna el arreglo de materias
     * @return
    */
    public ArrayList<String> getMaterias() {
        return materias;
    }

    /**
     * setCalificaciones
     * TODO guarda el arreglo de double las calificaciones de cada materia
     * @param calificaciones
     */
    public void setCalificaciones(ArrayList<Double> calificaciones) {
        this.calificaciones = calificaciones;
    }

    /**
     * getCalificaciones
     * TODO Retorna el arreglo de clas calificaciones
     * @return
     */
    public ArrayList<Double> getCalificaciones() {
        return calificaciones;
    }
}
