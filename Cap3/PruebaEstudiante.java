public class PruebaEstudiante {
    public static void main(String[] args) {
        // Crear un estudiante
        Estudiante estudiante1 = new Estudiante(2022190021, "Edy Martinez");

        // Matricular al estudiante en una materia
        estudiante1.matricular("Ingles 3");

        // Establecer la calificación del estudiante
        estudiante1.setCalificacion(80.7);

        // Mostrar la información del estudiante
        System.out.println("Información del Estudiante:");
        estudiante1.mostrarInformacion();

        // Crear otro estudiante
        Estudiante estudiante2 = new Estudiante(2020170011, "Maria Rodriguez");

        // Matricular al estudiante en una materia
        estudiante2.matricular("Historia de Honduras");

        // Establecer la calificación del estudiante
        estudiante2.setCalificacion(40.0);

        // Mostrar la información del estudiante
        System.out.println("\nInformación del Estudiante 2:");
        estudiante2.mostrarInformacion();
    }
}