import java.util.Scanner;
class graficoBarra {
    public static void main (String[] args) {
    Scanner entrada = new Scanner(System.in);
    int num;
    int contador = 1;
    
    System.out.println("INTRODUZCA 5 NUMEROS ENTEROS ENTRE 1 Y 30");
    
    while(contador <= 5){
        System.out.println("POR FAVOR INTRODUZCA EL NUMERO");
        num = entrada.nextInt();
        
        if((1 <= num) && (30 >= num)){
            for(int i = 1; i <= num; i++){
                System.out.print("*");
            }
            System.out.println();
            contador++;
        }
    }
    
    }
}