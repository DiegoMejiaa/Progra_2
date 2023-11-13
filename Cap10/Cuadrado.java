// Cuadrado.java
// Clase que representa un cuadrado.
class Cuadrado extends FiguraBidimensional {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double obtenerArea() {
        return lado * lado;
    }

    @Override
    public double obtenerVolumen() {
        return 0; // No se usa para FiguraBidimensional
    }

    @Override
    public String toString() {
        return "Cuadrado con lado: " + lado;
    }
}
