// FiguraTridimensional.java
// Clase abstracta FiguraTridimensional.

public abstract class FiguraTridimensional extends Figura {
    // método abstracto para obtener el área superficial
    @Override
    public abstract double obtenerArea();

    // método abstracto para obtener el volumen
    @Override
    public abstract double obtenerVolumen();
}
