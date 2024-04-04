package quiz4;

import javax.swing.JOptionPane;

public class Quiz4 {

    public static void main(String[] args) {
        EscuelaDelProgramador escuela = new EscuelaDelProgramador(11); // instancia para diferentes funcioones de la escuela del programador

        escuela.agregarEstudiante(new Estudiante("Santi", "Progra", "profesor1", 95)); // instancia de estudiante para hcaer un estudiante
        escuela.agregarEstudiante(new Estudiante("Elena", "Progra", "Profesor2", 85));
        escuela.agregarEstudiante(new Estudiante("Josue", "Progra", "profesor3", 70));
        escuela.agregarEstudiante(new Estudiante("Byron", "Mate", "Profeso4", 80));
        escuela.agregarEstudiante(new Estudiante("Jhonny", "Biolo", "Profesor5", 90));
        escuela.agregarEstudiante(new Estudiante("Kanye", "Progra", "Profesor2", 100));
        escuela.agregarEstudiante(new Estudiante("Kim Jon UN", "Mate", "Profesor5", 82));
        escuela.agregarEstudiante(new Estudiante("Pancracio", "Progra", "Profesor2", 50));
        escuela.agregarEstudiante(new Estudiante("Maria", "Progra", "Profesor7", 64));
        escuela.agregarEstudiante(new Estudiante("Didier", "Progra", "Profesor2", 40));

        JOptionPane.showMessageDialog(null, "Nombre del estudiante con la nota mayor: " + escuela.obtenerNombreMejorEstudiante());
        JOptionPane.showMessageDialog(null, "Nombre del estudiante con la nota menor: " + escuela.obtenerNombrePeorEstudiante());
        JOptionPane.showMessageDialog(null, "Promedio de calificaciones: " + escuela.obtenerPromedioCalificaciones());
        JOptionPane.showMessageDialog(null, "Cantidad de estudiantes con calificaciones por encima del promedio: " + escuela.cantidadEstudiantesPorEncimaPromedio(escuela.obtenerPromedioCalificaciones()));
        JOptionPane.showMessageDialog(null, "Cantidad de estudiantes con calificaciones por debajo del promedio: " + escuela.cantidadEstudiantesPorDebajoPromedio(escuela.obtenerPromedioCalificaciones()));

    }
}
