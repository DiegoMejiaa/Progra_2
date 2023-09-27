public class Estudiante {
    private int cuenta;
    private String nombre;
    private String materia;
    private double calificacion;

    // Constructor para crear un estudiante con cuenta y nombre
    public Estudiante(int cuenta, String nombre) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.materia = ""; // Inicialmente no tiene materia asignada
        this.calificacion = 0.0; // Inicialmente la calificación es 0.0
    }

    // Método para matricular al estudiante en una materia
    public void matricular(String materia) {
        this.materia = materia;
    }

    // Método para establecer la calificación del estudiante
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    // Método para obtener la observación (Aprobado o Reprobado)
    public String getObservacion() {
        if (calificacion >= 65) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    // Método para obtener la información del estudiante
    public void mostrarInformacion() {
        System.out.println("Cuenta: " + cuenta);
        System.out.println("Nombre: " + nombre);
        System.out.println("Materia: " + materia);
        System.out.println("Calificación: " + calificacion);
        System.out.println("Observación: " + getObservacion());
    }
}
