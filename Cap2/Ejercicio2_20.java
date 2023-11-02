import java.util.Scanner;
public class Ejercicio2_20
{       // Abre Deitel 2_25
public static void main(String args[])
{ // Abre metodo main


int numero;
Scanner entrada = new Scanner(System.in);
  
System.out.println("\nIntroduzca un numero y sabra si es par o impar:");
numero = entrada.nextInt();
  
if( 0 == numero % 2 )
System.out.println("\nEl numero es par.");
  
if ( 0 != numero % 2)
System.out.println("\nEl numero es impar.");
    
}       // Cierra el metodo main
}         // Cierra Deitel 2_25