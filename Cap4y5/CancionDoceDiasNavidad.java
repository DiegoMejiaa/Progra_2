public class CancionDoceDiasNavidad {
    public static void main(String[] args) {
        String[] dias = {
            "primer", "segundo", "tercer", "cuarto", "quinto",
            "sexto", "séptimo", "octavo", "noveno", "décimo",
            "undécimo", "duodécimo"
        };

        String[] regalos = {
            "una perdiz en un peral", "dos tórtolas", "tres gallinas francesas",
            "cuatro pájaros cantores", "cinco anillos de oro",
            "seis ocas poniendo huevos", "siete cisnes nadando",
            "ocho mucamas ordeñando", "nueve damas bailando",
            "diez señores saltando", "once músicos tocando",
            "doce doctores"
        };

        System.out.println("Los Doce Días de Navidad:");

        for (int dia = 1; dia <= 12; dia++) {
            System.out.printf("En el %s día de Navidad, mi amor me envió:%n", dias[dia - 1]);
            System.out.println("Un(a) " + regalos[dia - 1]);

            if (dia != 12) {
                System.out.println("Y");
            }
        }
    }
}