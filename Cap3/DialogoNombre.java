import javax.swing.JOptionPane;

public class DialogoNombre {
    public static void main(String[] args) {
        // Pide al usuario que escriba su nombre
        String nombre = JOptionPane.showInputDialog("¿Cuál es su nombre?");

        // Crea el mensaje
        String mensaje = String.format("Bienvenido, %s, a la programación en Java!", nombre);

        // Muestra el mensaje para dar la bienvenida al usuario por su nombre
        JOptionPane.showMessageDialog(null, mensaje);
    } // Fin de main
} // Fin de la clase DialogoNombre