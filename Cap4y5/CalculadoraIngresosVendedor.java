import java.util.Scanner;

public class CalculadoraIngresosVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioBase = 200.0;
        double tasaComision = 0.09;
        double ventasTotales = 0.0;

        System.out.println("Ingrese los artículos vendidos por el vendedor (ingrese 0 para terminar):");

        while (true) {
            System.out.print("Artículo (0 para terminar): ");
            int articulo = scanner.nextInt();

            if (articulo == 0) {
                break;
            }

            double valorArticulo = obtenerValorArticulo(articulo);

            ventasTotales += valorArticulo;
        }

        double ingresosVendedor = salarioBase + (ventasTotales * tasaComision);

        System.out.printf("Los ingresos del vendedor son: $%.2f%n", ingresosVendedor);

        scanner.close();
    }

    public static double obtenerValorArticulo(int articulo) {
        switch (articulo) {
            case 1:
                return 239.99;
            case 2:
                return 129.75;
            case 3:
                return 99.95;
            case 4:
                return 350.89;
            default:
                System.out.println("Artículo no válido. Se considerará con valor $0.00");
                return 0.0;
        }
    }
}