
public class PruebaFiguras {
    public static void main(String[] args) {
        // Crear un arreglo de Figura con diferentes tipos de figuras
        Figura[] figuras = {
            new Circulo(5.0),
            new Cuadrado(4.0),
            new Esfera(3.0),
            new Cubo(2.0)
        };

        // Procesar cada figura en el arreglo
        for (Figura figura : figuras) {
            System.out.println(figura);

            // Determinar el tipo de figura y mostrar el área y el volumen si es tridimensional
            if (figura instanceof FiguraTridimensional) {
                FiguraTridimensional figuraTridimensional = (FiguraTridimensional) figura;
                System.out.printf("Área superficial: %.2f%n", figuraTridimensional.obtenerArea());
                System.out.printf("Volumen: %.2f%n", figuraTridimensional.obtenerVolumen());
            } else if (figura instanceof FiguraBidimensional) {
                FiguraBidimensional figuraBidimensional = (FiguraBidimensional) figura;
                System.out.printf("Área: %.2f%n", figuraBidimensional.obtenerArea());
            }

            System.out.println();
        }
    }
}
