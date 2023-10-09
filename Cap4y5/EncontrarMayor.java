import java.util.Scanner;

public class EncontrarMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int mayor = Integer.MIN_VALUE; // Inicializar mayor con el valor mínimo de un entero
        
        while (contador < 10) {
            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();
            
            if (numero > mayor) {
                mayor = numero;
            }
            
            contador++;
        }
        
        System.out.println("El número más grande es: " + mayor);
        scanner.close();
    }
}