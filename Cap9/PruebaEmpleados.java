public class PruebaEmpleados {
    public static void main(String[] args) {
        EmpleadoPorComision empleado1 = new EmpleadoPorComision("Juan", "Pérez", "123-45-6789", 50000, 0.10);
        EmpleadoBaseMasComision empleado2 = new EmpleadoBaseMasComision("María", "Gómez", "987-65-4321", 60000, 0.12, 3000);

        System.out.println("Empleado 1:");
        System.out.println(empleado1);
        System.out.println("Ganancias: " + empleado1.calcularGanancias());

        System.out.println("\nEmpleado 2:");
        System.out.println(empleado2);
        System.out.println("Ganancias: " + empleado2.calcularGanancias());
    }
}