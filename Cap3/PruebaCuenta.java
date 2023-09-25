import java.util.Scanner;

public class PruebaCuenta {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Jane Green", 50.00);
        Cuenta cuenta2 = new Cuenta("John Blue", -7.53);

        // Muestra el saldo inicial de cada objeto utilizando el método mostrarCuenta
        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);

        // Crea un objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el monto a depositar para cuenta1: "); // Indicador (prompt)
        double montoDeposito = entrada.nextDouble(); // Obtiene entrada del usuario
        System.out.printf("%nSumando %.2f al saldo de cuenta1%n%n", montoDeposito);
        cuenta1.depositar(montoDeposito); // Suma al saldo de cuenta1

        // Muestra el saldo de cuenta1 después del depósito
        mostrarCuenta(cuenta1);

        System.out.print("Escriba el monto a depositar para cuenta2: "); // Indicador (prompt)
        montoDeposito = entrada.nextDouble(); // Obtiene entrada del usuario
        System.out.printf("%nSumando %.2f al saldo de cuenta2%n%n", montoDeposito);
        cuenta2.depositar(montoDeposito); // Suma al saldo de cuenta2

        // Muestra el saldo de cuenta2 después del depósito
        mostrarCuenta(cuenta2);

        // Realiza un retiro de cuenta1
        System.out.print("Escriba el monto a retirar de cuenta1: "); // Indicador (prompt)
        double montoRetiro = entrada.nextDouble(); // Obtiene entrada del usuario
        System.out.printf("%nIntentando retirar %.2f de cuenta1%n%n", montoRetiro);
        cuenta1.retirar(montoRetiro); // Intenta retirar de cuenta1

        // Muestra el saldo de cuenta1 después del retiro
        mostrarCuenta(cuenta1);
    } // Fin de main

    // Método para mostrar el nombre y el saldo de una cuenta
    public static void mostrarCuenta(Cuenta cuentaAMostrar) {
        System.out.printf("Nombre de %s: %s%nSaldo de %s: $%.2f%n%n",
                cuentaAMostrar.obtenerNombre(), cuentaAMostrar.obtenerNombre(),
                cuentaAMostrar.obtenerNombre(), cuentaAMostrar.obtenerSaldo());
    }
}