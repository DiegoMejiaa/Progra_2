import java.util.Scanner;

public class PruebaFecha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pide la primera fecha
        System.out.println("Ingrese la primera fecha (mes día año):");
        int mes1 = scanner.nextInt();
        int dia1 = scanner.nextInt();
        int anio1 = scanner.nextInt();

        Fecha fecha1 = new Fecha(mes1, dia1, anio1);

        // Pide la segunda fecha
        System.out.println("Ingrese la segunda fecha (mes día año):");
        int mes2 = scanner.nextInt();
        int dia2 = scanner.nextInt();
        int anio2 = scanner.nextInt();

        Fecha fecha2 = new Fecha(mes2, dia2, anio2);

        // Muestra las fechas ingresadas
        System.out.println("Fecha 1:");
        fecha1.mostrarFecha();

        System.out.println("Fecha 2:");
        fecha2.mostrarFecha();

        // Calcula y muestra la diferencia en días
        int diferenciaDias = fecha1.calcularDiferenciaDias(fecha2);
        System.out.println("Diferencia en días entre las fechas: " + diferenciaDias + " días");

        scanner.close();
    }
}