public class PruebaRectangulo {
    public static void main(String[] args) {
        Rectangulo miRectangulo = new Rectangulo();

        // Establecer longitud y anchura (con verificación)
        miRectangulo.setLongitud(5.0);
        miRectangulo.setAnchura(4.0);

        // Obtener longitud y anchura
        System.out.println("Longitud: " + miRectangulo.getLongitud());
        System.out.println("Anchura: " + miRectangulo.getAnchura());

        // Calcular y mostrar el perímetro y el área
        System.out.println("Perímetro: " + miRectangulo.calcularPerimetro());
        System.out.println("Área: " + miRectangulo.calcularArea());
    }}
