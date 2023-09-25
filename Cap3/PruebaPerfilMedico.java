import java.util.Scanner;

public class PruebaPerfilMedico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar información de la persona
        System.out.print("Ingrese el primer nombre: ");
        String primerNombre = entrada.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellido = entrada.nextLine();

        System.out.print("Ingrese el sexo (M/F): ");
        char sexo = entrada.next().charAt(0);

        System.out.print("Ingrese el año de nacimiento (ejemplo, 1990): ");
        int añoNacimiento = entrada.nextInt();

        System.out.print("Ingrese el mes de nacimiento (1-12): ");
        int mesNacimiento = entrada.nextInt();

        System.out.print("Ingrese el día de nacimiento: ");
        int diaNacimiento = entrada.nextInt();

        System.out.print("Ingrese la altura en centímetros: ");
        int alturaCentimetros = entrada.nextInt();

        System.out.print("Ingrese el peso en kilogramos: ");
        double pesoKilogramos = entrada.nextDouble();

        // Crear una instancia de la clase PerfilMedico
        PerfilMedico persona = new PerfilMedico(primerNombre, apellido, sexo, añoNacimiento, mesNacimiento, diaNacimiento, alturaCentimetros, pesoKilogramos);

        // Mostrar la información de la persona
        System.out.println("\nInformación de la persona:");
        System.out.println("Nombre: " + persona.obtenerPrimerNombre() + " " + persona.obtenerApellido());
        System.out.println("Sexo: " + persona.obtenerSexo());
        System.out.println("Fecha de nacimiento: " + persona.obtenerFechaNacimiento());
        System.out.println("Altura: " + persona.obtenerAlturaCentimetros() + " cm");
        System.out.println("Peso: " + persona.obtenerPesoKilogramos() + " kg");

        // Calcular e imprimir la edad, BMI, frecuencia cardiaca máxima y rango de frecuencia cardiaca esperada
        System.out.println("\nInformación de salud:");
        System.out.println("Edad: " + persona.calcularEdad() + " años");
        System.out.println("BMI (Índice de Masa Corporal): " + persona.calcularBMI());

        System.out.println("Frecuencia cardiaca máxima: " + persona.calcularFrecuenciaCardiacaMaxima() + " ppm");
        System.out.println("Rango de frecuencia cardiaca esperada: " + persona.calcularRangoFrecuenciaCardiacaEsperada());}}
