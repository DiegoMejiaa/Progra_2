import java.util.ArrayList;
import java.util.Scanner;
public class PruebaFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cliente: ");
        String cliente = scanner.nextLine();
        System.out.print("Ingrese la fecha (por ejemplo, 2023-09-28): ");
        String fecha = scanner.nextLine();
        Factura factura = new Factura(cliente, fecha);

        while (true) {
            System.out.print("Ingrese el producto (o escriba 'fin' para finalizar): ");
            String producto = scanner.nextLine();

            if (producto.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.print("Ingrese la cantidad: ");
            int cantidad = scanner.nextInt();
            System.out.print("Ingrese el precio unitario: ");
            double precioUnitario = scanner.nextDouble();
            scanner.nextLine(); // Limpia el buffer

            LineaFactura linea = new LineaFactura(cantidad, producto, precioUnitario);
            factura.agregarLineaFactura(linea);
        }

        scanner.close();

        System.out.println("Factura para: " + factura.getCliente());
        System.out.println("Fecha: " + factura.getFecha());
        System.out.println("Detalles de la factura:");

        for (LineaFactura linea : factura.getLineaFacturas()) {
            System.out.println(linea.getProducto() + " - Cantidad: " + linea.getCantidad() + " - Subtotal: $" + linea.getSubTotal());
        }

        System.out.println("Total de la factura: $" + factura.getTotal());
    }
}