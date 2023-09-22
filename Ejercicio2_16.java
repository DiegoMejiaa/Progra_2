import java.util.Scanner;
  
public class Ejercicio2_16
{           // Abre la clase publica 2_16
 
public static void main( String args[] )
{       // Abre el metodo main
Scanner entrada = new Scanner(System.in);
 
int numero1;
int numero2;
 
System.out.println("\nIntroduzca un entero: ");
numero1 = entrada.nextInt();
 
System.out.println("\nIntroduzca un segundo entero: ");
numero2 = entrada.nextInt();
 
if ( numero1 > numero2 )
System.out.printf("\nEl numero %d es mayor que %d\n", numero1, numero2);
 
if ( numero2 > numero1 )
System.out.printf("\nEl numero %d es mayor que %d\n", numero2, numero1);
 
if ( numero1 == numero2 )
System.out.printf( "\nEl numero %d es igual al numero %d\n", numero1, numero2);
}       // Cierra el metodo main
}            // Cierra la clase publica 2_16