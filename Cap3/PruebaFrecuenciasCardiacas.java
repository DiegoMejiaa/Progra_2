import java.util.Scanner;

public class PruebaFrecuenciasCardiacas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar información de la persona
        System.out.print("Ingrese el primer nombre: ");
        String primerNombre = entrada.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellido = entrada.nextLine();

        System.out.print("Ingrese el año de nacimiento (ejemplo, 1990): ");
        int añoNacimiento = entrada.nextInt();

        System.out.print("Ingrese el mes de nacimiento (1-12): ");
        int mesNacimiento = entrada.nextInt();

        System.out.print("Ingrese el día de nacimiento: ");
        int diaNacimiento = entrada.nextInt();

        // Crear una instancia de la clase FrecuenciasCardiacas
        FrecuenciasCardiacas persona = new FrecuenciasCardiacas(primerNombre, apellido, añoNacimiento, mesNacimiento, diaNacimiento);

        // Mostrar la información de la persona
        System.out.println("\nInformación de la persona:");
        System.out.println("Nombre: " + persona.obtenerPrimerNombre() + " " + persona.obtenerApellido());
        System.out.println("Fecha de nacimiento: " + persona.obtenerFechaNacimiento());
        System.out.println("Edad: " + persona.calcularEdad() + " años");
        System.out.println("Frecuencia cardiaca máxima: " + persona.calcularFrecuenciaCardiacaMaxima() + " ppm");
        System.out.println("Rango de frecuencia cardiaca esperada: " + persona.calcularRangoFrecuenciaCardiacaEsperada() + " ppm");
    }
}