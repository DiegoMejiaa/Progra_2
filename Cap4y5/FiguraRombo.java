public class FiguraRombo {
    public static void main(String[] args) {
        int altura = 7; // Altura del rombo (debe ser un número impar)

        for (int i = 1; i <= altura; i += 2) {
            // Imprimir espacios en blanco (parte superior del rombo)
            for (int j = 1; j <= (altura - i) / 2; j++) {
                System.out.print(" ");
            }

            // Imprimir asteriscos (parte superior del rombo)
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println(); // Nueva línea
        }

        for (int i = altura - 2; i >= 1; i -= 2) {
            // Imprimir espacios en blanco (parte inferior del rombo)
            for (int j = 1; j <= (altura - i) / 2; j++) {
                System.out.print(" ");
            }

            // Imprimir asteriscos (parte inferior del rombo)
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println(); // Nueva línea
        }
    }
}