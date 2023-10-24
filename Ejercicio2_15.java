class Aeropuerto {
    private String nombrePasajero;
    private String numeroVuelo;
    private String destino;
    private String fechaVuelo;
    private String asiento;

    public Aeropuerto(String nombrePasajero, String numeroVuelo, String destino, String fechaVuelo, String asiento) {
        this.nombrePasajero = nombrePasajero;
        this.numeroVuelo = numeroVuelo;
        this.destino = destino;
        this.fechaVuelo = fechaVuelo;
        this.asiento = asiento;
    }

    public void imprimirBoleto() {
        System.out.println("****************************************");
        System.out.println("         Boleto de Aeropuerto");
        System.out.println("****************************************");
        System.out.println("Nombre del Pasajero: " + nombrePasajero);
        System.out.println("Número de Vuelo: " + numeroVuelo);
        System.out.println("Destino: " + destino);
        System.out.println("Fecha del Vuelo: " + fechaVuelo);
        System.out.println("Asiento: " + asiento);
        System.out.println("****************************************");
    }
}

public class PruebaAeropuerto {
    public static void main(String[] args) {
        // Crear un boleto de aeropuerto con datos predefinidos
        Aeropuerto boleto = new Aeropuerto("John Doe", "AA123", "Los Angeles", "2023-10-30", "12A");

        // Imprimir el boleto
        boleto.imprimirBoleto();
    }
}
