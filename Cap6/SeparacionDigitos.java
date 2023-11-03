import java.util.Scanner;

public class SeparacionDigitos {

    public static int calcularParteEnteraCociente(int a, int b) {
        int cociente = 0;
        if (b == 0) {
            System.out.println("No se puede dividir entre cero.");
            return -1;
        }
        cociente = a/b;
        return cociente;
    }

    public static int calcularResiduoEntero(int a, int b) {
        int residuo;
        if (b == 0) {
            System.out.println("No se puede dividir entre cero.");
            return -1;
        }
        residuo = a % b;
    
        return residuo;
    }

    public static void mostrarDigitos(int num) {
        String numCadena = Integer.toString(num);
        for (int i = 0; i < numCadena.length(); i++) {
            System.out.print(numCadena.charAt(i));
            if (i < numCadena.length() - 1) {
                System.out.print("  "); // Dos espacios de separación
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número entre 1 y 99999: ");
        int num = input.nextInt();

        System.out.println("Ingrese un entero A");
        int a = input.nextInt();

        System.out.println("Ingrese un entero B ");
        int b = input.nextInt();

        if (num < 1 || num > 99999) {
            System.out.println("El número no está en el rango válido.");
        } else {
            System.out.println("Parte entera del cociente: " + calcularParteEnteraCociente(a, b));
            System.out.println(" ");
            System.out.println("Residuo entero: " + calcularResiduoEntero(a, b));
            System.out.println(" ");
            System.out.println("Dígitos separados por dos espacios:");
            mostrarDigitos(num);
        }
    }
}
