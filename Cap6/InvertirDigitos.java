
    import java.util.Scanner;

public class InvertirDigitos {

    // Método para invertir los dígitos de un número entero
    public static int invertirDigitos(int numero) {
        int numeroInvertido = 0;

        while (numero != 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero = numero / 10;
        }

        return numeroInvertido;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        int numeroInvertido = invertirDigitos(numero);

        System.out.println("Número con dígitos invertidos: " + numeroInvertido);
    }
}
