public class PruebaFactura {
    public static void main(String[] args) {
        // Crear un objeto Factura
        Factura factura1 = new Factura("345", "Tubo PVC", 100, 0.25);

        // Mostrar la información de la factura
        System.out.println("Número de pieza: " + factura1.obtenerNumeroDePieza());
        System.out.println("Descripción de pieza: " + factura1.obtenerDescripcionDePieza());
        System.out.println("Cantidad de artículos: " + factura1.obtenerCantidadDeArticulos());
        System.out.println("Precio por artículo: $" + factura1.obtenerPrecioPorArticulo());

        // Calcular y mostrar el monto de la factura
        double montoFactura = factura1.obtenerMontoFactura();
        System.out.println("Monto de la factura: $" + montoFactura);

        // Crear otro objeto Factura con valores no válidos
        Factura factura2 = new Factura("890", "Cinta aislante", -5, -15.0);

        // Mostrar la información de la factura 2
        System.out.println("\nNúmero de pieza: " + factura2.obtenerNumeroDePieza());
        System.out.println("Descripción de pieza: " + factura2.obtenerDescripcionDePieza());
        System.out.println("Cantidad de artículos: " + factura2.obtenerCantidadDeArticulos());
        System.out.println("Precio por artículo: $" + factura2.obtenerPrecioPorArticulo());

        // Calcular y mostrar el monto de la factura 2
        double montoFactura2 = factura2.obtenerMontoFactura();
        System.out.println("Monto de la factura 2: $" + montoFactura2);
    }
}

