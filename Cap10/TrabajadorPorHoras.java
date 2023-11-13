// TrabajadorPorHoras.java
// Clase que representa a un trabajador por horas.

public class TrabajadorPorHoras extends Empleado {
    private double salarioPorHora;
    private double horasTrabajadas;

    // constructor
    public TrabajadorPorHoras(String nombre, String apellido, String seguroSocial, double salarioPorHora, double horasTrabajadas) {
        super(nombre, apellido, seguroSocial);
        if (salarioPorHora < 0.0 || (horasTrabajadas < 0.0 || horasTrabajadas > 168.0)) {
            throw new IllegalArgumentException("El salario por hora debe ser >= 0.0 y las horas trabajadas deben estar en el rango 0-168");
        }
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    // implementación del método abstracto ingresos
    @Override
    public double ingresos() {
        if (getHorasTrabajadas() <= 40) {
            return getSalarioPorHora() * getHorasTrabajadas();
        } else {
            return 40 * getSalarioPorHora() + (getHorasTrabajadas() - 40) * getSalarioPorHora() * 1.5;
        }
    }

    // métodos getters
    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    // método toString para representación de cadena del objeto
    @Override
    public String toString() {
        return String.format("Trabajador por Horas: %s%nSalario por Hora: %.2f, Horas Trabajadas: %.2f", super.toString(), getSalarioPorHora(), getHorasTrabajadas());
    }
}
