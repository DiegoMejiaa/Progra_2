import java.util.ArrayList;
import java.util.List;

class Vehiculo{

    String marca;
    int ruedas;

    public Vehiculo(String marca, int ruedas){

        this.marca = marca;
        this.ruedas = ruedas;
    }

    public String getMarca(){
        return marca;
    }

    public int getRuedas(){

        return ruedas;
    }
}

class Motocicleta extends Vehiculo{
    public Motocicleta(String marca){
        super(marca, 2);
    }
}

class Turismo extends Vehiculo{
    public Turismo(String marca){
        super(marca, 4);
    }
}

class Conductor{

    String nombre;
    Vehiculo vehiculo;

    public Conductor(String nombre, Vehiculo vehiculo){

        this.nombre = nombre;
        this.vehiculo = vehiculo;
    }

    public String getNombre(){
        return nombre;
    }

    public Vehiculo getVehiculo(){
        return vehiculo;
    }
}

public class PruebaVehiculos{

    public static void main(String[] args){

        Motocicleta moto1 = new Motocicleta("Honda");
        Motocicleta moto2 = new Motocicleta("Yamaha");
        Turismo turismo1 = new Turismo("BMW");
        Turismo turismo2 = new Turismo("Ferrari");
        Turismo turismo3 = new Turismo("Ford");

        Conductor motorista1 = new Conductor("Diego", moto1);
        Conductor motorista2 = new Conductor("Maria", turismo1);

        System.out.println("Conductor de la motocicleta 1: "+ motorista1.getNombre());
        System.out.println("Vehiculo de Diego: "+ motorista1.getVehiculo().getMarca());

        System.out.println("Conductor del turismo 1: "+ motorista2.getNombre());
        System.out.println("Vehiculo de Maria: "+ motorista2.getVehiculo().getMarca());

        System.out.println("Marca de la motocicleta 1: "+ moto1.getMarca());
        System.out.println("Marca del turismo 1: "+ turismo1.getMarca());

        System.out.println("Ruedas de la motocicleta 1: "+ moto1.getRuedas());
        System.out.println("Ruedas del turismo 1: "+ turismo1.getRuedas());

        System.out.println("Lista de vehiculos: ");
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(moto1);
        vehiculos.add(moto2);
        vehiculos.add(turismo1);
        vehiculos.add(turismo2);
        vehiculos.add(turismo3);

        for (Vehiculo vehiculo : vehiculos){
            imprimirVehiculo(vehiculo);
        }
    }

    public static void imprimirVehiculo(Vehiculo vehiculo){
        System.out.println("Marca: "+ vehiculo.getMarca()+ ", Ruedas: "+ vehiculo.getRuedas());
    }
}