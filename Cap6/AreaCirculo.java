import java.util.Scanner;

public class AreaCirculo {
    public static double circuloArea(double r) {
        double area = Math.PI * r * r;
        return area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radio;

        System.out.println("Ingrese el radio del circulo ");
        radio = input.nextDouble();
        System.out.println(" ");
        System.out.printf("El area del circulo es: %.2f\tunidades cuadradas %n" , circuloArea(radio));
    }
}
