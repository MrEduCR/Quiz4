package quiz4;

public class EscuelaDelProgramador {
    private Estudiante[] estudiantes; // arreglo para los procesos
    private int cantidadEstudiantes;

    public EscuelaDelProgramador(int maxEstudiantes) {
        estudiantes = new Estudiante[maxEstudiantes];
        cantidadEstudiantes = 0;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (cantidadEstudiantes < estudiantes.length) {
            estudiantes[cantidadEstudiantes] = estudiante;
            cantidadEstudiantes++;
        } else {
            System.out.println("no se pueden agregar más estudiantes. La capacidad máxima ha sido alcanzada.");
        }
    }

    public String obtenerNombreMejorEstudiante() {
        if (cantidadEstudiantes == 0) {
            return "no hay estudiantes registrados"; // por si acaso
        }
        Estudiante mejorEstudiante = estudiantes[0];
        for (int i = 1; i < cantidadEstudiantes; i++) { // bucle para verificar
            if (estudiantes[i].getCalificacion() > mejorEstudiante.getCalificacion()) {
                mejorEstudiante = estudiantes[i]; // del arreglo obtiene ese estudiante
            }
        }
        return mejorEstudiante.getNombre();
    }

    public String obtenerNombrePeorEstudiante() {
        if (cantidadEstudiantes == 0) {
            return "no hay estudiantes registrados";
        }
        Estudiante peorEstudiante = estudiantes[0];
        for (int i = 1; i < cantidadEstudiantes; i++) { // bucle para verificar
            if (estudiantes[i].getCalificacion() < peorEstudiante.getCalificacion()) {
                peorEstudiante = estudiantes[i];
            }
        }
        return peorEstudiante.getNombre();
    }

    public double obtenerPromedioCalificaciones() {
        if (cantidadEstudiantes == 0) {
            return 0; // No hay estudiantes, el promedio es 0.
        }
        double sumaCalificaciones = 0;
        for (int i = 0; i < cantidadEstudiantes; i++) { 
            sumaCalificaciones += estudiantes[i].getCalificacion();
        }
        return sumaCalificaciones / cantidadEstudiantes;
    }

    public int cantidadEstudiantesPorEncimaPromedio(double promedio) {
        int contador = 0;
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].getCalificacion() > promedio) {
                contador++;
            }
        }
        return contador;
    }

    public int cantidadEstudiantesPorDebajoPromedio(double promedio) {
        int contador = 0;
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].getCalificacion() < promedio) {
                contador++;
            }
        }
        return contador;
    }
}

