class EnterosImpares {
    public static void main (String[] args) {
        
        int producto = 1;
        
        System.out.println("ESTE PROGRAMA CALCULA EL PRODUCTO DE LOS ENTEROS IMPARES DEL 1 AL 15");
        
    for( int i =1; i <= 15; i++)
    {
        if(i % 2 != 0){
           producto = producto * i; 
           System.out.println(producto);
        }
        
    }
    }
}