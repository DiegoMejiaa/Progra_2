public class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;

    // Constructor
    public Empleado(String primerNombre, String apellidoPaterno, double salarioMensual) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;

        // Verifica que el salario mensual sea positivo
        if (salarioMensual > 0.0) {
            this.salarioMensual = salarioMensual;
        } else {
            this.salarioMensual = 0.0; // Si no es positivo, establece el salario en 0.0
        }
    }

    // Métodos establecer y obtener para el primer nombre
    public void establecerPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    // Métodos establecer y obtener para el apellido paterno
    public void establecerApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String obtenerApellidoPaterno() {
        return apellidoPaterno;
    }

    // Métodos establecer y obtener para el salario mensual
    public void establecerSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0.0) {
            this.salarioMensual = salarioMensual;
        }
    }

    public double obtenerSalarioMensual() {
        return salarioMensual;
    }

    // Método para calcular el salario anual
    public double calcularSalarioAnual() {
        return salarioMensual * 12;
    }

    // Método para dar un aumento del 10%
    public void darAumento() {
        salarioMensual *= 1.10;
    }
}