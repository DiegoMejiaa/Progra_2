import java.util.Scanner;

public class CalculadoraKilometrosPorLitro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalKilometros = 0;
        int totalLitros = 0;
        
        while (true) {
            System.out.print("Ingrese los kilómetros conducidos (o -1 para salir): ");
            int kilometros = scanner.nextInt();
            
            if (kilometros == -1) {
                break; // Salir del bucle si el usuario ingresa -1
            }
            
            System.out.print("Ingrese los litros usados: ");
            int litros = scanner.nextInt();
            
            double kilometrosPorLitro = (double) kilometros / litros;
            
            System.out.printf("Kilómetros por litro en este viaje: %.2f%n", kilometrosPorLitro);
            
            totalKilometros += kilometros;
            totalLitros += litros;
            
            double promedioKilometrosPorLitro = (double) totalKilometros / totalLitros;
            
            System.out.printf("Promedio de kilómetros por litro hasta este punto: %.2f%n", promedioKilometrosPorLitro);
        }
        
        System.out.println("¡Gracias por usar la calculadora de kilómetros por litro!");
        scanner.close();
    }
}