import java.util.Scanner;

public class VerificarTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese tres valores distintos de cero para los lados del triángulo:");
        
        System.out.print("Lado 1: ");
        double lado1 = scanner.nextDouble();
        
        System.out.print("Lado 2: ");
        double lado2 = scanner.nextDouble();
        
        System.out.print("Lado 3: ");
        double lado3 = scanner.nextDouble();
        
        if (esTriangulo(lado1, lado2, lado3)) {
            System.out.println("Estos valores pueden representar los lados de un triángulo.");
        } else {
            System.out.println("Estos valores no pueden representar los lados de un triángulo.");
        }
        
        scanner.close();
    }
    
    public static boolean esTriangulo(double lado1, double lado2, double lado3) {
        // Verificar la condición para que sean lados de un triángulo
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }
}