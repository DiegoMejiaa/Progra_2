// Clase Empleado
public class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;

    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    @Override
    public String toString() {
        return String.format("%s %s\nNumero de seguro social: %s", primerNombre, apellidoPaterno, numeroSeguroSocial);
    }
}

// Clase EmpleadoPorComision (subclase de Empleado)
public class EmpleadoPorComision extends Empleado {
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    public double calcularGanancias() {
        return ventasBrutas * tarifaComision;
    }
}

// Clase EmpleadoBaseMasComision (subclase de EmpleadoPorComision)
public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private double salarioBase;

    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision, double salarioBase) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas, tarifaComision);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularGanancias() {
        return super.calcularGanancias() + salarioBase;
    }
}