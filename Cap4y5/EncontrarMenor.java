import java.util.Scanner;

public class EncontrarMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números a comparar: ");
        int cantidadNumeros = scanner.nextInt();

        if (cantidadNumeros <= 0) {
            System.out.println("La cantidad de números debe ser mayor que cero.");
            return;
        }

        System.out.print("Ingrese el primer número: ");
        int menor = scanner.nextInt();

        for (int i = 1; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el siguiente número: ");
            int numero = scanner.nextInt();

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("El menor de los números ingresados es: " + menor);
    }
}