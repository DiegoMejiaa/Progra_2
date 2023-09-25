public class Factura {
    private String numeroDePieza;
    private String descripcionDePieza;
    private int cantidadDeArticulos;
    private double precioPorArticulo;

    // Constructor
    public Factura(String numeroDePieza, String descripcionDePieza, int cantidadDeArticulos, double precioPorArticulo) {
        this.numeroDePieza = numeroDePieza;
        this.descripcionDePieza = descripcionDePieza;

        // Verifica que la cantidad de artículos sea positiva, de lo contrario, establece en 0
        if (cantidadDeArticulos > 0) {
            this.cantidadDeArticulos = cantidadDeArticulos;
        } else {
            this.cantidadDeArticulos = 0;
        }

        // Verifica que el precio por artículo sea positivo, de lo contrario, establece en 0.0
        if (precioPorArticulo > 0.0) {
            this.precioPorArticulo = precioPorArticulo;
        } else {
            this.precioPorArticulo = 0.0;
        }
    }

    // Métodos establecer y obtener para el número de pieza
    public void establecerNumeroDePieza(String numeroDePieza) {
        this.numeroDePieza = numeroDePieza;
    }

    public String obtenerNumeroDePieza() {
        return numeroDePieza;
    }

    // Métodos establecer y obtener para la descripción de pieza
    public void establecerDescripcionDePieza(String descripcionDePieza) {
        this.descripcionDePieza = descripcionDePieza;
    }

    public String obtenerDescripcionDePieza() {
        return descripcionDePieza;
    }

    // Métodos establecer y obtener para la cantidad de artículos
    public void establecerCantidadDeArticulos(int cantidadDeArticulos) {
        if (cantidadDeArticulos > 0) {
            this.cantidadDeArticulos = cantidadDeArticulos;
        } else {
            this.cantidadDeArticulos = 0;
        }
    }

    public int obtenerCantidadDeArticulos() {
        return cantidadDeArticulos;
    }

    // Métodos establecer y obtener para el precio por artículo
    public void establecerPrecioPorArticulo(double precioPorArticulo) {
        if (precioPorArticulo > 0.0) {
            this.precioPorArticulo = precioPorArticulo;
        } else {
            this.precioPorArticulo = 0.0;
        }
    }

    public double obtenerPrecioPorArticulo() {
        return precioPorArticulo;
    }

    // Método para obtener el monto de la factura
    public double obtenerMontoFactura() {
        return cantidadDeArticulos * precioPorArticulo;
    }
}
