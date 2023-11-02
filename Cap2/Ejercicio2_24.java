import java.util.Scanner;
  
public class Ejercicio2_24
{      // Abre Deitel_2_30
public static void main(String arg[])
{  // Abre metodo main
Scanner entrada = new Scanner(System.in);
int numero;
 
System.out.println("\nIntroduzca un numero de cinco cifras y sera impreso con espacios entre ellas:");
numero = entrada.nextInt();
  
System.out.printf("%d ",   numero/10000);
System.out.printf("%d ", (numero%10000)/1000);
System.out.printf("%d ", ((numero%10000)%1000)/100);
System.out.printf("%d ", (((numero%10000)%1000)%100)/10);
System.out.printf("%d\n ", ((((numero%10000)%1000)%100)%10));
}     // Cierra main
}      // Cierra Deitel_2_30