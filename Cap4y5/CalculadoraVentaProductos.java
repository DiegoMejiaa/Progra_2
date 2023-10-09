import java.util.Scanner;

public class CalculadoraVentaProductos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Precios de los productos
        double[] precios = {2.98, 4.50, 9.98, 4.49, 6.87};
        double totalVenta = 0.0;

        System.out.println("Ingrese el número del producto y la cantidad vendida (ingrese un número negativo para finalizar):");

        while (true) {
            System.out.print("Número del producto (-1 para finalizar): ");
            int numeroProducto = scanner.nextInt();

            if (numeroProducto == -1) {
                break; // Salir del bucle si se ingresa -1
            }

            if (numeroProducto >= 1 && numeroProducto <= 5) {
                System.out.print("Cantidad vendida: ");
                int cantidadVendida = scanner.nextInt();

                if (cantidadVendida >= 0) {
                    double precioProducto = precios[numeroProducto - 1];
                    double subtotal = precioProducto * cantidadVendida;
                    totalVenta += subtotal;
                } else {
                    System.out.println("La cantidad vendida debe ser un número positivo.");
                }
            } else {
                System.out.println("Número de producto no válido. Debe estar entre 1 y 5.");
            }
        }

        System.out.printf("El valor total de venta es: $%.2f%n", totalVenta);
        scanner.close();
    }
}