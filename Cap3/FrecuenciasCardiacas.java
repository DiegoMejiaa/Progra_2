import java.time.LocalDate;
import java.time.Period;

public class FrecuenciasCardiacas {
    private String primerNombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    // Constructor
    public FrecuenciasCardiacas(String primerNombre, String apellido, int añoNacimiento, int mesNacimiento, int diaNacimiento) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.fechaNacimiento = LocalDate.of(añoNacimiento, mesNacimiento, diaNacimiento);
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

    // Métodos establecer y obtener para la fecha de nacimiento
    public void establecerFechaNacimiento(int añoNacimiento, int mesNacimiento, int diaNacimiento) {
        this.fechaNacimiento = LocalDate.of(añoNacimiento, mesNacimiento, diaNacimiento);
    }

    public LocalDate obtenerFechaNacimiento() {
        return fechaNacimiento;
    }

    // Método para calcular y obtener la edad en años
    public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        return periodo.getYears();
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
}
