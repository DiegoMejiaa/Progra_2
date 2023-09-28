import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class PruebaEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir información del estudiante
        System.out.println("Ingrese el número de cuenta del estudiante:");
        String numeroCuenta = scanner.nextLine();
        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = scanner.nextLine();

        // Ingresar la fecha de ingreso
        Date fechaIngreso = ingresarFecha(scanner);
        scanner.nextLine();

        // Crear un estudiante
        Estudiante estudiante = new Estudiante(numeroCuenta, nombre, fechaIngreso);

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

    private static Date ingresarFecha(Scanner scanner) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false);
        Date fecha = null;

        while (fecha == null) {
            try {
                System.out.println("Ingrese la fecha de ingreso del estudiante (dd-MM-yyyy):");
                String fechaStr = scanner.next();
                fecha = dateFormat.parse(fechaStr);
            } catch (ParseException e) {
                System.out.println("Formato de fecha incorrecto. Por favor, use dd-MM-yyyy.");
            }
        }

        return fecha;
    }
}
