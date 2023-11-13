// PorHoras.java
public class PorHoras extends Empleado {
    private final double salarioPorHora;
    private final double horasTrabajadas;

    public PorHoras(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double salarioPorHora, double horasTrabajadas) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double ingresos() {
        return salarioPorHora * horasTrabajadas;
    }

    @Override
    public String toString() {
        return String.format("Empleado por horas: %s%nSalario por hora: $%.2f%nHoras trabajadas: %.2f",
                super.toString(), salarioPorHora, horasTrabajadas);
    }
}
