import java.util.Scanner;

class Estudiante1 {
    private String numeroCuenta; // Cambiado a String
    private String nombre;
    private String materia;
    private double calificacion;

    public Estudiante1(String numeroCuenta, String nombre) { // Cambiado el tipo de dato del número de cuenta
        this.numeroCuenta = numeroCuenta;
        this.nombre = nombre;
        this.materia = "";
        this.calificacion = 0.0;
    }

    public void matricular(String materia) {
        this.materia = materia;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Materia: " + materia);
        System.out.print("Calificación: " + calificacion);
        if (calificacion >= 65) {
            System.out.println(" (Aprobado)");
        } else {
            System.out.println(" (Reprobado)");
        }
    }
}