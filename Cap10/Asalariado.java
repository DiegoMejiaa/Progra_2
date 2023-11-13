// Asalariado.java
public class Asalariado extends Empleado {
    private final double salarioSemanal;

    public Asalariado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double salarioSemanal) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double ingresos() {
        return salarioSemanal;
    }

    @Override
    public String toString() {
        return String.format("Asalariado: %s%nSalario semanal: $%.2f", super.toString(), salarioSemanal);
    }
}

