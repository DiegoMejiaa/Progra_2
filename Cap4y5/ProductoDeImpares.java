public class ProductoDeImpares {
    public static void main(String[] args) {
        int producto = 1; // Inicializar el producto en 1

        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0) { // Verificar si i es impar
                producto *= i; // Multiplicar por el número impar
            }
        }

        System.out.println("El producto de los enteros impares del 1 al 15 es: " + producto);
    }
}
