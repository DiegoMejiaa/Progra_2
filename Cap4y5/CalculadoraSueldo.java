import java.util.Scanner;

public class CalculadoraSueldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= 3; i++) { // Iterar para cada uno de los tres empleados
            System.out.println("Ingrese los datos para el empleado " + i);
            
            System.out.print("Horas trabajadas en la semana pasada: ");
            int horasTrabajadas = scanner.nextInt();
            
            System.out.print("Tarifa por hora: ");
            double tarifaPorHora = scanner.nextDouble();
            
            double sueldoBruto = calcularSueldoBruto(horasTrabajadas, tarifaPorHora);
            
            System.out.printf("El sueldo bruto del empleado %d es: %.2f%n", i, sueldoBruto);
        }
        
        scanner.close();
    }
    
    public static double calcularSueldoBruto(int horasTrabajadas, double tarifaPorHora) {
        double sueldoBruto;
        
        if (horasTrabajadas <= 40) {
            sueldoBruto = horasTrabajadas * tarifaPorHora;
        } else {
            // Calcular las primeras 40 horas a tarifa normal y las horas extra a tarifa y media
            sueldoBruto = (40 * tarifaPorHora) + ((horasTrabajadas - 40) * (tarifaPorHora * 1.5));
        }
        
        return sueldoBruto;
    }
}