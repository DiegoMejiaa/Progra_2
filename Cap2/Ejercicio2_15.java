
import java.util.Scanner;
public class Simpletron{

    public static void main (String []args){
        Scanner entrada = new Scanner(System.in);
        int acumulador=0;
        int ContarInstrucciones = 0;
        int areglo[] =  new int[100];

        System.out.println("*** Bienvenido a Simpletron! ***");
        System.out.println("*** Por favor, introduzca en su programa una instruccion ***");
        System.out.println("*** (o palabra de datos) a la vez. Yo le mostrare ***");
        System.out.println("*** el numero de ubicacion y un signo de interrogacion (?) ***");
        System.out.println("*** Entonces usted escribira la palabra para esa ubicacion. ***");
        System.out.println("*** Teclee -9999 para dejar de introducir su programa. ***");

        // Carga de programa
        boolean loading = true;
        int AregloContador = 0;
        while (loading) {
            System.out.printf("%02d ? ", AregloContador);
            int value = entrada.nextInt();
            if (value == -9999) {
                loading = false;
            } else {
                areglo[AregloContador] = value;
                AregloContador++;
            }
        }

        System.out.println("*** Se completo la carga del programa ***");
        System.out.println("*** Empieza la ejecucion del programa ***");

        // Ejecución del programa
        boolean running = true;
        while (running) {
            int instruccion = areglo[ContarInstrucciones];
            int CodigoOperacion = instruccion / 100;
            int operando = instruccion % 100;

            switch (CodigoOperacion) {
                case 10: // Leer
                    System.out.print("Ingrese un valor: ");
                    int inputValue = entrada.nextInt();
                    areglo[operando] = inputValue;
                    break;
                case 11: // Escribir
                    System.out.println("Salida: " + areglo[operando]);
                    break;
                case 20: // Cargar
                    acumulador = areglo[operando];
                    break;
                case 21: // Almacenar
                    areglo[operando] = acumulador;
                    break;
                case 30: // Sumar
                    acumulador += areglo[operando];
                    break;
                case 43: // Finalizar
                    running = false;
                    break;
            }
            ContarInstrucciones++;
        }
        // Vaciado de la computadora
        System.out.println("*** Vaciado de la computadora ***");
        System.out.println("Registro de Acumulador: " + acumulador);
        System.out.println("Contador de Instrucciones: " + ContarInstrucciones);
        System.out.println("Contenido de Memoria:");

        for (int i = 0; i < areglo.length; i++) {
            System.out.printf("%02d: %d%n", i, areglo[i]);
        }
    }
}
