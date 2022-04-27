package Barbero;

public class Main {
    public static void main(String[] args) {
        Barbero barbero = new Barbero("Jose", "Carrillo", 72243592, "Calle siempre viva");
        System.out.println(barbero.nombre);

        System.out.println(barbero.apellido);

        System.out.println(barbero.dni);

        System.out.println(barbero.direccion);

        barbero.cortarCabello();

        barbero.afeitarBarba();

        barbero.peinar();

        barbero.mojarCabello();

        barbero.cobrarCorte();

    }

}
