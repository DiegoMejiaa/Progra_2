
class Rectangulo {
    private double longitud;
    private double anchura;

    public Rectangulo() {
        longitud = 1.0;
        anchura = 1.0;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        if (longitud > 0.0 && longitud <= 20.0) {
            this.longitud = longitud;
        }
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        if (anchura > 0.0 && anchura <= 20.0) {
            this.anchura = anchura;
        }
    }

    public double calcularPerimetro() {
        return 2 * (longitud + anchura);
    }

    public double calcularArea() {
        return longitud * anchura;
    }
}
