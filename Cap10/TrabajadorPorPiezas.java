// TrabajadorPorPiezas.java
public class TrabajadorPorPiezas extends Empleado {
    private final double sueldo;
    private final int piezas;

    public TrabajadorPorPiezas(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double sueldo, int piezas) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        this.sueldo = sueldo;
        this.piezas = piezas;
    }

    @Override
    public double ingresos() {
        return sueldo * piezas;
    }

    @Override
    public String toString() {
        return String.format("Trabajador por piezas: %s%nSueldo por pieza: $%.2f%nPiezas producidas: %d",
                super.toString(), sueldo, piezas);
    }
}