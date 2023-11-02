import java.util.Scanner;

class LineaFactura {
    private int cantidad;
    private String producto;
    private double precioUnitario;

    public LineaFactura(int cantidad, String producto, double precioUnitario) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.precioUnitario = precioUnitario;
    }

    public double getSubTotal() {
        return cantidad * precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }
}

class Factura {
    private String cliente;
    private String fecha;
    private double total;

    public Factura(String cliente, String fecha) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.total = 0.0;
    }

    public void agregarLineaFactura(LineaFactura linea) {
        double subTotal = linea.getSubTotal();
        total += subTotal;
        System.out.println("Línea de factura agregada: " + linea.getProducto() + " - Cantidad: " + linea.getCantidad() + " - Subtotal: $" + subTotal);
    }

    public double getTotal() {
        return total;
    }

    public String getCliente() {
        return cliente;
    }

    public String getFecha() {
        return fecha;
    }
}

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
        System.out.println("Total de la factura: $" + factura.getTotal());
    }
}
