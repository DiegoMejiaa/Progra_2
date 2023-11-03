class patron {
    public static void main (String[] args) {
        System.out.println("INCISO A");
    for(int x = 1; x <= 10; x++)
    {
        for(int i = 1; i <= x; i++)
        {
        System.out.print("*");
        } 
     System.out.println();
    }
    
    System.out.println();
    System.out.println("INCISO D");
    //el otro derecha
    for(int x= 1; x <= 10;x++){
        for(int k = 1 ; k <= 10-x; k++){
            System.out.print(" ");
        }
         for(int i = 1; i <= x; i++)
        {
        System.out.print("*");
        } 
     System.out.println();
    }
     System.out.println();
    //invertido a la izquierda
    System.out.println("INCISO B");
    for(int x = 10; x >= 1;x--){
        for(int i = 1;i <= x;i++){
             System.out.print("*");
        }
        System.out.println(" ");
    }
     System.out.println();
    //invertido a la derecha
    System.out.println("INCISO C");
    for(int x= 10; x >= 1;x--){
        for(int k = 1 ; k <= 10-x; k++){
            System.out.print(" ");
        }
         for(int i = 1; i <= x; i++)
        {
        System.out.print("*");
        } 
     System.out.println();
    }
    }
}