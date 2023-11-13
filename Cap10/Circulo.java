// Circulo.java
// Clase que representa un círculo.
class Circulo extends FiguraBidimensional {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double obtenerVolumen() {
        return 0; // No se usa para FiguraBidimensional
    }

    @Override
    public String toString() {
        return "Círculo con radio: " + radio;
    }
}
