public class CalculadoraFactorial {
    public static void main(String[] args) {
        System.out.println("Factoriales del 1 al 20:");
        System.out.println("Número\tFactorial");

        for (int n = 1; n <= 20; n++) {
            long factorial = calcularFactorial(n);
            System.out.printf("%d\t%d%n", n, factorial);
        }
    }

    public static long calcularFactorial(int n) {
        if (n == 0) {
            return 1; // El factorial de 0 es 1
        }

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}