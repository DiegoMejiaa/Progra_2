import java.util.Scanner;
public class Distancia {
    public static double Distancia(double x1 , double y1, double x2, double y2) {
        double dx = Math.max(x1, x2) - Math.min(x1, x2);
        double dy = Math.max(y1, y2) -Math.min(y1 , y2);
        double distancia = Math.sqrt((dx * dx) + (dy * dy));
        return distancia;
    }
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas del primer punto");
        double x1 = i.nextDouble();
        double y1 = i.nextDouble();

        System.out.println("Ingrese las coordenadas del segundo  punto");
        double x2 = i.nextDouble();
        double y2 = i.nextDouble();
        System.out.printf("La distancia entre los dos puntos es: %.2f%n" , Distancia(x1, y1, x2, y2));
    }
}
