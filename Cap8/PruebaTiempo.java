public class PruebaTiempo {
    public static void main(String[] args) {
        // Crear objetos Tiempo2
        Tiempo2 tiempo1 = new Tiempo2(); // Tiempo por defecto (medianoche)
        Tiempo2 tiempo2 = new Tiempo2(12); // Tiempo a las 12:00:00 PM
        Tiempo2 tiempo3 = new Tiempo2(23, 59, 59); // Tiempo a las 23:59:59

        // Mostrar los objetos Tiempo2
        System.out.println("Tiempo por defecto: ");
        mostrarTiempo("tiempo1", tiempo1);
        System.out.println("\nTiempo a las 12:00:00 PM: ");
        mostrarTiempo("tiempo2", tiempo2);
        System.out.println("\nTiempo a las 23:59:59: ");
        mostrarTiempo("tiempo3", tiempo3);

        // Intentar establecer tiempos inválidos
        try {
            tiempo1.establecerHora(25);
        } catch (IllegalArgumentException e) {
            System.out.printf("%nExcepción: %s%n%n", e.getMessage());
        }

        try {
            tiempo2.establecerHora(13);
        } catch (IllegalArgumentException e) {
            System.out.printf("Excepción: %s%n", e.getMessage());
        }
    }

    // Muestra el tiempo en formatos universal y estándar
    private static void mostrarTiempo(String nombre, Tiempo2 tiempo) {
        System.out.printf("%s:%n", nombre);
        System.out.printf("Formato universal: %s%n", tiempo.aStringUniversal());
        System.out.printf("Formato estándar: %s%n", tiempo.aStringEstandar());
    }
}