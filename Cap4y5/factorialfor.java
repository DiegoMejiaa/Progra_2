class factorialFor {
    public static void main (String[] args) {
        
        long fact = 1;
        System.out.println("CALCULANDO LOS FACTORIALES DEL 1 AL 20");
        
        for(int i = 1; i <= 20; i++){
             fact = fact * i;
            System.out.println(i + "! = " + fact); 
        }
          
    }
}