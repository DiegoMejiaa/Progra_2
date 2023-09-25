public class PruebaFecha {
    public static void main(String[] args) {
        // Crear un objeto Fecha
        Fecha fecha1 = new Fecha(9, 24, 2023);

        // Mostrar la fecha
        System.out.print("Fecha 1: ");
        fecha1.mostrarFecha();

        // Establecer una nueva fecha
        fecha1.establecerMes(12);
        fecha1.establecerDia(31);
        fecha1.establecerAño(2022);

        // Mostrar la nueva fecha
        System.out.print("Nueva Fecha 1: ");
        fecha1.mostrarFecha();
    }
}
