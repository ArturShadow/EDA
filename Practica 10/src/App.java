import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        var materias = new ArrayList<String>(7);
        var grupo = new ArrayList<Estudiante>();
        // System.out.println("Llena la lista de materias.");
        // for (int i = 0; i < 7; i++) {
        //     System.out.print("nombre de la materia #" + (i+1) + ": ");
        //     materias.add(leer.readLine());
        // }

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
        }
        

        for (int i = 0; i < 4; i++) {
            // grupo.get(i).getNotas().setMaterias(materias);
            System.out.println(grupo.get(i).toString());
        }

        // System.out.println("Introduce las calificaciones de cada alumno.");
        // for (int i = 0; i < 4; i++) {
        //     System.out.println("Calificaciones del alumno "+ grupo.get(i).getNombre());
        //     for (int j = 0; j < 7 ; j++) {
        //         System.out.print(grupo.get(i).getNotas().getMaterias().get(j)+ ": ");
        //         grupo.get(i).getNotas().getCalificaciones().add(Double.parseDouble(leer.readLine()));
        //     }
        // }


        // for (Estudiante estudiante : grupo) {
        //     estudiante.reporteCalificaciones();
        //     System.out.println("Promedio: " + estudiante.getPromedio());
        //     System.out.println("==================================");
        // }




        // System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\nAntes de ordenar");

        
        // System.out.println("Alumno\t\tPromedio");
        // for (Estudiante estudiante : grupo) {
        //     System.out.println(estudiante.getNombre()+"\t"+estudiante.getPromedio());
        //     System.out.println("‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗");
        // }
        
        // Collections.sort(grupo);
        // System.out.println("\nDespuee de ordenar");
        // System.out.println("Alumno\t\tPromedio");
        // for (Estudiante estudiante : grupo) {
        //     System.out.println(estudiante.getNombre()+"\t"+estudiante.getPromedio());
        //     System.out.println("‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗");
        // }
    
        System.out.print("Introduce el nombre del alumno a buscar: ");
        String nombre = leer.readLine();
        
        int index = grupo.


        System.out.println(grupo.get(index).toString());
    }
}
