import java.util.Scanner;

public class EncontrarMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int menor = Integer.MAX_VALUE; // Inicializar mayor con el valor mínimo de un entero
        
while (contador < 10) {
            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();
            
            if (numero < menor) {
                menor = numero;
            }
            
            contador++;
        }
        
        System.out.println("El número más pequeño: " + menor);
        scanner.close();
    }
}
