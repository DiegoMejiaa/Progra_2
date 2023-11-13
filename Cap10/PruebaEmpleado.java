// PruebaEmpleado.java
public class PruebaEmpleado {
    public static void main(String[] args) {
        // Crear instancias de Empleado, PorHoras y TrabajadorPorPiezas
        Empleado asalariado = new Asalariado("John", "Doe", "111-11-1111", 800.0);
        Empleado porHoras = new PorHoras("Jane", "Doe", "222-22-2222", 20.0, 40.0);
        Empleado trabajadorPorPiezas = new TrabajadorPorPiezas("Bob", "Smith", "333-33-3333", 2.5, 200);

        // Crear un arreglo de empleados
        Empleado[] empleados = { asalariado, porHoras, trabajadorPorPiezas };

        // Mostrar la información y los ingresos de cada empleado
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
            System.out.printf("Ingresos: $%.2f%n%n", empleado.ingresos());
        }
    }
}