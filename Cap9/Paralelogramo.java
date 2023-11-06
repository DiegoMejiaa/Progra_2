public class Paralelogramo extends Cuadrilatero {
    public Paralelogramo(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        super(punto1, punto2, punto3, punto4);
    }

    // Implementa el cálculo del área para un paralelogramo
    public double calcularArea() {
        // Calcula el vector entre el punto1 y el punto2
        double vectorX = getPunto2().getX() - getPunto1().getX();
        double vectorY = getPunto2().getY() - getPunto1().getY();

        // Calcula el vector entre el punto1 y el punto4
        double baseX = getPunto4().getX() - getPunto1().getX();
        double baseY = getPunto4().getY() - getPunto1().getY();

        // Calcula el producto cruz para encontrar el área
        double area = Math.abs(vectorX * baseY - vectorY * baseX);

        return area;
    }
}
