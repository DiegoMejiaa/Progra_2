import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalRecibos = 0.0;

        System.out.print("Introduzca las horas de estacionamiento (o -1 para salir): ");
        double horasEstacionamiento = scanner.nextDouble();

        while (horasEstacionamiento != -1) {
            double cargo = calcularCargos(horasEstacionamiento);
            System.out.printf("Cargo por estacionamiento: $%.2f%n", cargo);
            totalRecibos += cargo;

            System.out.print("Introduzca las horas de estacionamiento (o -1 para salir): ");
            horasEstacionamiento = scanner.nextDouble();
        }

        System.out.printf("Total de recibos de ayer: $%.2f%n", totalRecibos);
    }

    public static double calcularCargos(double horas) {
        double cargo = 2.0; // Cuota mínima por hasta tres horas

        if (horas > 3.0) {
            // Calcular el cargo adicional por cada hora o fracción que se pase de tres horas
            cargo += Math.min(21.0, Math.ceil(horas - 3.0)) * 0.50;
        }

        return Math.min(10.0, cargo); // Cargo máximo de $10.00 para cualquier periodo de 24 horas
    }
}
