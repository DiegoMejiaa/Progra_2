// AsalariadoPorHoras.java
public class AsalariadoPorHoras extends Empleado {
    private final double salarioPorHora;
    private final int horasTrabajadas;

    public AsalariadoPorHoras(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double salarioPorHora, int horasTrabajadas) {
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
        return String.format("Asalariado por horas: %s%nSalario por hora: $%.2f%nHoras trabajadas: %d",
                super.toString(), salarioPorHora, horasTrabajadas);
    }
}
