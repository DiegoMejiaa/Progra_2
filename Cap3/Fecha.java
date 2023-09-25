public class Fecha {
    private int mes;
    private int dia;
    private int año;

    // Constructor
    public Fecha(int mes, int dia, int año) {
        this.mes = mes;
        this.dia = dia;
        this.año = año;
    }

    // Métodos establecer y obtener para el mes
    public void establecerMes(int mes) {
        this.mes = mes;
    }

    public int obtenerMes() {
        return mes;
    }

    // Métodos establecer y obtener para el día
    public void establecerDia(int dia) {
        this.dia = dia;
    }

    public int obtenerDia() {
        return dia;
    }

    // Métodos establecer y obtener para el año
    public void establecerAño(int año) {
        this.año = año;
    }

    public int obtenerAño() {
        return año;
    }

    // Método para mostrar la fecha en formato "mes/día/año"
    public void mostrarFecha() {
        System.out.printf("%d/%d/%d%n", mes, dia, año);
    }
}