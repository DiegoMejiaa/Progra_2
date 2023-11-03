 class segmento {
    public static void main(String[] args){
        /* EL SIGUIENTE CODIGO LO QUE HACE ES QUE EL PRIMER FOR VA A REPETIR 5 VECES LA ACCION
            EL SEGUNDO FOR REPITE 3 FILAS
            EL ULTIMO FOR IMPRIME 4 COLUMNAS CON SUS ASTERISCOS*/
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 4; k++)
                    System.out.print('*');
                System.out.println();
            } // fin del for interior
            System.out.println();
        } // fin del for exterior
    }
}