import java.time.LocalDate;
import java.time.Period;

public class PerfilMedico {
    private String primerNombre;
    private String apellido;
    private char sexo;
    private LocalDate fechaNacimiento;
    private int alturaCentimetros;
    private double pesoKilogramos;

    // Constructor
    public PerfilMedico(String primerNombre, String apellido, char sexo, int añoNacimiento, int mesNacimiento, int diaNacimiento, int alturaCentimetros, double pesoKilogramos) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.fechaNacimiento = LocalDate.of(añoNacimiento, mesNacimiento, diaNacimiento);
        this.alturaCentimetros = alturaCentimetros;
        this.pesoKilogramos = pesoKilogramos;
    }

    // Métodos establecer y obtener para el primer nombre
    public void establecerPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    // Métodos establecer y obtener para el apellido
    public void establecerApellido(String apellido) {
        this.apellido = apellido;
    }

    public String obtenerApellido() {
        return apellido;
    }

    // Métodos establecer y obtener para el sexo
    public void establecerSexo(char sexo) {
        this.sexo = sexo;
    }

    public char obtenerSexo() {
        return sexo;
    }

    // Métodos establecer y obtener para la fecha de nacimiento
    public void establecerFechaNacimiento(int añoNacimiento, int mesNacimiento, int diaNacimiento) {
        this.fechaNacimiento = LocalDate.of(añoNacimiento, mesNacimiento, diaNacimiento);
    }

    public LocalDate obtenerFechaNacimiento() {
        return fechaNacimiento;
    }

    // Métodos establecer y obtener para la altura en centímetros
    public void establecerAlturaCentimetros(int alturaCentimetros) {
        this.alturaCentimetros = alturaCentimetros;
    }

    public int obtenerAlturaCentimetros() {
        return alturaCentimetros;
    }

    // Métodos establecer y obtener para el peso en kilogramos
    public void establecerPesoKilogramos(double pesoKilogramos) {
        this.pesoKilogramos = pesoKilogramos;
    }

    public double obtenerPesoKilogramos() {
        return pesoKilogramos;
    }

    // Método para calcular y obtener la edad en años
    public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        return periodo.getYears();
    }

    // Método para calcular y obtener el índice de masa corporal (BMI)
    public double calcularBMI() {
        double alturaMetros = alturaCentimetros / 100.0;
        return pesoKilogramos / (alturaMetros * alturaMetros);
    }

    // Método para calcular y obtener la frecuencia cardiaca máxima (220 - edad)
    public int calcularFrecuenciaCardiacaMaxima() {
        int edad = calcularEdad();
        return 220 - edad;
    }

    // Método para calcular y obtener el rango de frecuencia cardiaca esperada (50% - 85% de la frecuencia cardiaca máxima)
    public String calcularRangoFrecuenciaCardiacaEsperada() {
        int frecuenciaCardiacaMaxima = calcularFrecuenciaCardiacaMaxima();
        int rangoMinimo = (int) (frecuenciaCardiacaMaxima * 0.5);
        int rangoMaximo = (int) (frecuenciaCardiacaMaxima * 0.85);
        return rangoMinimo + " - " + rangoMaximo;
    }

    // Método para mostrar la tabla de valores de BMI
    public static void mostrarTablaBMI() {
        System.out.println("\nTabla de Valores de BMI");
        System.out.println("Bajo peso: Menos de 18.5");
        System.out.println("Normal: 18.5 - 24.9");
        System.out.println("Sobrepeso: 25 - 29.9");
        System.out.println("Obesidad: 30 o más\n");
    }
}