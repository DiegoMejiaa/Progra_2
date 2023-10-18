import java.util.ArrayList;
import java.util.Scanner;

class Factura {
    private String cliente;
    private String fecha;
    private ArrayList<LineaFactura> lineaFacturas;

    public Factura(String cliente, String fecha) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.lineaFacturas = new ArrayList<>();
    }

    public void agregarLineaFactura(LineaFactura linea) {
        lineaFacturas.add(linea);
    }

    public double getTotal() {
        double total = 0;
        for (LineaFactura linea : lineaFacturas) {
            total += linea.getSubTotal();
        }
        return total;
    }

    public String getCliente() {
        return cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public ArrayList<LineaFactura> getLineaFacturas() {
        return lineaFacturas;
    }
}
