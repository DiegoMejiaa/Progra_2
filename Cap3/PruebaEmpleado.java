public class PruebaEmpleado {
    public static void main(String[] args) {
        // Crear dos objetos Empleado
        Empleado empleado1 = new Empleado("Kevin", "Maldonado", 5000.0);
        Empleado empleado2 = new Empleado("Daniel", "Barahona", 7000.0);

        // Mostrar el salario anual de cada empleado
        System.out.printf("El salario anual de %s %s es: $%.2f%n",
                empleado1.obtenerPrimerNombre(), empleado1.obtenerApellidoPaterno(), empleado1.calcularSalarioAnual());
        System.out.printf("El salario anual de %s %s es: $%.2f%n",
                empleado2.obtenerPrimerNombre(), empleado2.obtenerApellidoPaterno(), empleado2.calcularSalarioAnual());

        // Dar un aumento del 10% a cada empleado
        empleado1.darAumento();
        empleado2.darAumento();

        // Mostrar el salario anual después del aumento
        System.out.println("\nDespués del aumento del 10%:");
        System.out.printf("El salario anual de %s %s es: $%.2f%n",
                empleado1.obtenerPrimerNombre(), empleado1.obtenerApellidoPaterno(), empleado1.calcularSalarioAnual());
        System.out.printf("El salario anual de %s %s es: $%.2f%n",
                empleado2.obtenerPrimerNombre(), empleado2.obtenerApellidoPaterno(), empleado2.calcularSalarioAnual());
    }
}
