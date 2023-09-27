import java.util.Scanner;
public class PruebaEstudiante1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir información del estudiante
        System.out.println("Ingrese el número de cuenta del estudiante:");
        String numeroCuenta = scanner.nextLine();
        while (numeroCuenta.length() != 11) {
            System.out.println("El número de cuenta debe tener exactamente 11 dígitos. Intente de nuevo:");
            numeroCuenta = scanner.nextLine();
        }

        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = scanner.nextLine();

        // Crear un estudiante
        Estudiante1 estudiante = new Estudiante1(numeroCuenta, nombre);

        // Matricular al estudiante
        System.out.println("Ingrese la materia a matricular:");
        String materia = scanner.nextLine();
        estudiante.matricular(materia);

        // Ingresar la calificación
        System.out.println("Ingrese la calificación del estudiante:");
        double calificacion = scanner.nextDouble();
        estudiante.setCalificacion(calificacion);

        // Mostrar la información del estudiante
        System.out.println("\nInformación del Estudiante:");
        estudiante.mostrarInformacion();

        scanner.close();
    }
}
