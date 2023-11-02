

import java.util.Scanner;

/**
 * Aplicación que recibe tres enteros del usuario y muestra la
 * suma, promedio, producto, menor y mayor de esos números.
 * Nota: el cálculo del promedio en este ejercicio debe resultar
 * en una representación entera del promedio. Por lo tanto, si la
 * suma de los valores es 7, el promedio debe ser 2, no 2.3333...
 * Ejercicio 2.17
 * @author LorettoTG
 * @version 1.0
 */
public class Ejercicio2_17 {
    /**
     * Punto de entrada a la clase y a la aplicación.
     * @param args matriz de argumentos de cadena.
     * @throws Exception NO se generan excepciones.
     */
    public static void main(String[] args) {
        //Se crea un objeto Scanner para obtener la entrada
        //de datos del usuario.
        Scanner entrada = new Scanner(System.in);

        System.out.print("Deme el primer entero: ");
        //Usando el objeto entrada pedimos el siguiente int.
        int primerEntero = entrada.nextInt();

        System.out.print("Deme el segundo entero: ");
        //Usando el objeto entrada pedimos el siguiente int.
        int segundoEntero = entrada.nextInt();

        System.out.print("Deme el tercer entero: ");
        //Usando el objeto entrada pedimos el siguiente int.
        int tercerEntero = entrada.nextInt();

        //Se realiza la suma de los enteros.
        int suma = primerEntero + segundoEntero + tercerEntero;

        //Se realiza el producto de los enteros.
        int producto = primerEntero * segundoEntero * tercerEntero;

        //Se realiza el promedio de los enteros.
        int promedio = suma / 3;

        //Variable donde almacenaremos el mayor temporal.
        int mayorTemporal = 0;
        int menorTemporal = 0;

        //Si el primerEntero es mayor que el segundoEntero, el
        //mayor temporal será el primerEntero y el menorTemporal será
        //el segundoEntero de lo contrario será al reves.
        if(primerEntero >= segundoEntero){
            mayorTemporal = primerEntero;
            menorTemporal = segundoEntero;
        }else{
            mayorTemporal = segundoEntero;
            menorTemporal = primerEntero;
        }

        //Si mayorTemporal no es mayor a tercerEntero entonces
        //mayorTemporal será tercerEntero
        if( !(mayorTemporal >= tercerEntero) ){
            mayorTemporal = tercerEntero;
        }

        //Si menorTemporal no es menor a tercerEntero entonces
        //menorTemporal será tercerEntero
        if( !(menorTemporal <= tercerEntero) ){
            menorTemporal = tercerEntero;
        }

        //Usando %d indicamos que esperamos un int, cada %d
        //corresponde en orden a los argumentos que son
        //suma, promedio, producto...
        System.out.printf("La suma es: %d" +
                "\nEl promedio es: %d" +
                "\nEl producto es: %d" +
                "\nEl menor es: %d" +
                "\nEl mayor es: %d",
                suma, promedio, producto, menorTemporal, mayorTemporal);
    }
}