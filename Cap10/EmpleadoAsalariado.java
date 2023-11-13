// EmpleadoAsalariado.java
// Clase que representa a un empleado asalariado.

public class EmpleadoAsalariado extends Empleado {
    private double salarioSemanal;

    // constructor
    public EmpleadoAsalariado(String nombre, String apellido, String seguroSocial, double salarioSemanal) {
        super(nombre, apellido, seguroSocial);
        if (salarioSemanal < 0.0) {
            throw new IllegalArgumentException("El salario semanal debe ser >= 0.0");
        }
        this.salarioSemanal = salarioSemanal;
    }

    // implementación del método abstracto ingresos
    @Override
    public double ingresos() {
        return getSalarioSemanal();
    }

    // método getter
    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    // método toString para representación de cadena del objeto
    @Override
    public String toString() {
        return String.format("Empleado Asalariado: %s%nSalario Semanal: %.2f", super.toString(), getSalarioSemanal());
    }
}

