public class PruebaCuadrilateros {
    public static void main(String[] args) {
        // Crea instancias de las clases y calcula el área
        Punto puntoA = new Punto(0, 0);
        Punto puntoB = new Punto(4, 0);
        Punto puntoC = new Punto(4, 3);
        Punto puntoD = new Punto(0, 3);

        Cuadrilatero cuadrilatero = new Cuadrilatero(puntoA, puntoB, puntoC, puntoD);
        System.out.println("Área del cuadrilátero: " + cuadrilatero.calcularArea());

        Cuadrado cuadrado = new Cuadrado(puntoA, puntoB, puntoC, puntoD);
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());

        Paralelogramo paralelogramo = new Paralelogramo(puntoA, puntoB, puntoC, puntoD);
        System.out.println("Área del paralelogramo: " + paralelogramo.calcularArea());
    }
}