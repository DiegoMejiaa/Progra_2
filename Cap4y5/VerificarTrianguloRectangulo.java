import java.util.Scanner;

public class VerificarTrianguloRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese tres enteros distintos de cero para los lados:");
        
        System.out.print("Lado 1: ");
        int lado1 = scanner.nextInt();
        
        System.out.print("Lado 2: ");
        int lado2 = scanner.nextInt();
        
        System.out.print("Lado 3: ");
        int lado3 = scanner.nextInt();
        
        if (esTrianguloRectangulo(lado1, lado2, lado3)) {
            System.out.println("Estos lados podrían representar un triángulo rectángulo.");
        } else {
            System.out.println("Estos lados no podrían representar un triángulo rectángulo.");
        }
        
        scanner.close();
    }
    
    public static boolean esTrianguloRectangulo(int lado1, int lado2, int lado3) {
        // Verificar el teorema de Pitágoras
        int[] lados = {lado1, lado2, lado3};
        int max = lados[0];
        int sum = 0;
        
        for (int i = 0; i < 3; i++) {
            if (lados[i] > max) {
                max = lados[i];
            }
            sum += lados[i] * lados[i];
        }
        
        return (2 * max * max == sum);
    }
}




