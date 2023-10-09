import java.util.Scanner;

public class VerificarLimiteCredito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Ingrese el número de cuenta (o -1 para salir): ");
            int numeroCuenta = scanner.nextInt();
            
            if (numeroCuenta == -1) {
                break; // Salir del programa si se ingresa -1
            }
            
            System.out.print("Ingrese el saldo al inicio del mes: ");
            int saldoInicial = scanner.nextInt();
            
            System.out.print("Ingrese el total de artículos cargados en el mes: ");
            int cargos = scanner.nextInt();
            
            System.out.print("Ingrese el total de créditos aplicados en el mes: ");
            int creditos = scanner.nextInt();
            
            System.out.print("Ingrese el límite de crédito permitido: ");
            int limiteCredito = scanner.nextInt();
            
            int nuevoSaldo = saldoInicial + cargos - creditos;
            
            System.out.printf("Nuevo saldo para la cuenta %d: %d%n", numeroCuenta, nuevoSaldo);
            
            if (nuevoSaldo > limiteCredito) {
                System.out.println("Se excedió el límite de su crédito.");
            }
            
            System.out.println(); // Espacio en blanco para separar las entradas de los clientes
        }
        
        System.out.println("Gracias por utilizar el programa.");
        scanner.close();
    }
}