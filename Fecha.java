import java.util.Scanner;

public class Fecha {
    private int mes;
    private int dia;
    private int anio;

    public Fecha(int mes, int dia, int anio) {
        if (anio >= 2000 && mes >= 1 && mes <= 12) {
            this.mes = mes;
            this.dia = dia;
            this.anio = anio;
        } else {
            System.out.println("Fecha no válida. Asegúrese de que el año sea mayor o igual a 2000 y el mes esté en el rango de 1 a 12.");
        }
    }

    public void mostrarFecha() {
        System.out.printf("%02d/%02d/%04d%n", mes, dia, anio);
    }

    public int calcularDiferenciaDias(Fecha otraFecha) {
        // Calcula la diferencia de días entre dos fechas asumiendo que todos los meses tienen 30 días
        int diasDeEsteAnio = anio * 360 + mes * 30 + dia;
        int diasDeOtroAnio = otraFecha.anio * 360 + otraFecha.mes * 30 + otraFecha.dia;
        return Math.abs(diasDeEsteAnio - diasDeOtroAnio);
    }
}