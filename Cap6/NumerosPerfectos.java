public class NumerosPerfectos {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 1000; numero++) {
            if (esPerfecto(numero)) {
                System.out.print(numero + " = 1");
                int sumaFactores = 1;

                for (int factor = 2; factor <= numero / 2; factor++) {
                    if (numero % factor == 0) {
                        System.out.print(" + " + factor);
                        sumaFactores += factor;
                    }
                }

                System.out.println();
                System.out.println("La suma de los factores es: " + sumaFactores);
            }
        }
    }

    public static boolean esPerfecto(int numero) {
        int sumaFactores = 1;

        for (int factor = 2; factor <= numero / 2; factor++) {
            if (numero % factor == 0) {
                sumaFactores += factor;
            }
        }

        return sumaFactores == numero;
    }
}

