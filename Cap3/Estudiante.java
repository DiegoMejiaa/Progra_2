import java.text.SimpleDateFormat;
import java.util.Date;

public class Estudiante {
    private String numeroCuenta;
    private String nombre;
    private String materia;
    private double calificacion;
    private Date fechaIngreso;

    // Constructor para crear un estudiante con número de cuenta, nombre y fecha de ingreso
    public Estudiante(String numeroCuenta, String nombre, Date fechaIngreso) {
        this.numeroCuenta = numeroCuenta;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.materia = "";
        this.calificacion = 0.0;
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
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String fechaIngresoStr = dateFormat.format(fechaIngreso);

        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de Ingreso: " + fechaIngresoStr);
        System.out.println("Materia: " + materia);
        System.out.println("Calificación: " + calificacion);
        System.out.println("Observación: " + getObservacion());
    }
}
