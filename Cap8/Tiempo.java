public class Tiempo2 {
    private int segundosDesdeMedianoche; // segundos desde medianoche

    // constructor sin argumentos
    public Tiempo2() {
        this(0, 0, 0); // invoca al constructor con tres argumentos
    }

    // constructor con hora, minuto y segundo
    public Tiempo2(int hora, int minuto, int segundo) {
        establecerHora(hora, minuto, segundo);
    }

    // constructor con Tiempo2 como argumento
    public Tiempo2(Tiempo2 tiempo) {
        this(tiempo.obtenerHora(), tiempo.obtenerMinuto(), tiempo.obtenerSegundo());
    }

    // establecer un nuevo valor de tiempo usando la hora universal;
    // realizar la validación de la hora, minuto y segundo
    public void establecerHora(int h, int m, int s) {
        if (h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60) {
            segundosDesdeMedianoche = h * 3600 + m * 60 + s;
        } else {
            throw new IllegalArgumentException("Hora, minuto o segundo inválidos");
        }
    }

    // Métodos para establecer hora, minuto y segundo
    public void establecerHora(int h) {
        establecerHora(h, obtenerMinuto(), obtenerSegundo());
    }

    public void establecerMinuto(int m) {
        establecerHora(obtenerHora(), m, obtenerSegundo());
    }

    public void establecerSegundo(int s) {
        establecerHora(obtenerHora(), obtenerMinuto(), s);
    }

    // Métodos para obtener hora, minuto y segundo
    public int obtenerHora() {
        return segundosDesdeMedianoche / 3600;
    }

    public int obtenerMinuto() {
        return (segundosDesdeMedianoche % 3600) / 60;
    }

    public int obtenerSegundo() {
        return segundosDesdeMedianoche % 60;
    }

    // convierte a String en formato de hora universal (HH:MM:SS)
    public String aStringUniversal() {
        return String.format("%02d:%02d:%02d", obtenerHora(), obtenerMinuto(), obtenerSegundo());
    }

    // convierte a String en formato estándar (H:MM:SS AM o PM)
    public String aStringEstandar() {
        return String.format("%d:%02d:%02d %s", (obtenerHora() == 0 || obtenerHora() == 12) ? 12 : obtenerHora() % 12,
                obtenerMinuto(), obtenerSegundo(), (obtenerHora() < 12 ? "AM" : "PM"));
    }
}
