/**
 * Luis Arturo Loya Baca
 * TID61D
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        var materias = new ArrayList<String>(7);
        var grupo = new ArrayList<Estudiante>();
        System.out.println("Llena la lista de materias.");
        for (int i = 0; i < 7; i++) {
            System.out.print("nombre de la materia #" + (i+1) + ": ");
            materias.add(leer.readLine());
        }
        System.out.println("======================================\n");
        System.out.println("Introduce los datos de cada alumno");

        for (int i = 0; i < 4; i++) {
            Estudiante estudiante = new Estudiante();
            System.out.println("Datos del Estudiante #" + (i+1));
            System.out.print("Nombre: ");
            estudiante.setNombre(leer.readLine());
            System.out.print("Matricula: ");
            estudiante.setMatricula(leer.readLine());
            System.out.print("Grupo: ");
            estudiante.setGrupo(leer.readLine());
            grupo.add(estudiante);
            System.out.println("====================\n");
        }
        
        System.out.println("Datos de cada alumno");
        for (int i = 0; i < 4; i++) {
            grupo.get(i).getNotas().setMaterias(materias);
            System.out.println(grupo.get(i).toString());
        }
        System.out.println("\n");

        System.out.println("Introduce las calificaciones de cada alumno.");
        for (int i = 0; i < 4; i++) {
            System.out.println("Calificaciones del alumno "+ grupo.get(i).getNombre());
            for (int j = 0; j < 7 ; j++) {
                System.out.print(grupo.get(i).getNotas().getMaterias().get(j)+ ": ");
                try {
                    grupo.get(i).getNotas().getCalificaciones().add(Double.parseDouble(leer.readLine()));
                } catch (Exception e) {
                    System.out.println("Error, vuelve a intentarlo.");
                    grupo.get(i).getNotas().getCalificaciones().add(Double.parseDouble(leer.readLine()));
                }
            }
            grupo.get(i).calcularPromedio();
            System.out.println("==================================\n");
        }
        System.out.println("\n");

        System.out.println("Antes de ordenar");

        
        System.out.println("Alumno\t\tPromedio");
        for (int i = 0; i<grupo.size();i++) {
            System.out.println(grupo.get(i).getNombre());
            grupo.get(i).reporteCalificaciones();   
            System.out.println("==================================");
        }
        
        Collections.sort(grupo);
        System.out.println("\nDespues de ordenar");
        System.out.println("Alumno\t\tPromedio");
        for (int i = 0; i<grupo.size();i++) {
            System.out.println(grupo.get(i).getNombre());
            grupo.get(i).reporteCalificaciones();   
            System.out.println("==================================");
        }
    }
}
