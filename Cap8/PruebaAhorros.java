public class PruebaAhorros {
    public static void main(String[] args) {
        CuentaDeAhorros.modificarTasaInteres(0.04); // Establecer tasa de interés al 4%

        CuentaDeAhorros ahorrador1 = new CuentaDeAhorros(2000.00);
        CuentaDeAhorros ahorrador2 = new CuentaDeAhorros(3000.00);

        for (int mes = 1; mes <= 12; mes++) {
            ahorrador1.calcularInteresMensual();
            ahorrador2.calcularInteresMensual();

            System.out.printf("Mes %d:\n", mes);
            System.out.printf("Saldo Ahorrador 1: $%.2f\n", ahorrador1.getSaldoAhorros());
            System.out.printf("Saldo Ahorrador 2: $%.2f\n", ahorrador2.getSaldoAhorros());
        }

        CuentaDeAhorros.modificarTasaInteres(0.05); // Cambiar tasa de interés al 5%

        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();

        System.out.println("\nMes 13:");
        System.out.printf("Saldo Ahorrador 1: $%.2f\n", ahorrador1.getSaldoAhorros());
        System.out.printf("Saldo Ahorrador 2: $%.2f\n", ahorrador2.getSaldoAhorros());
    }
}