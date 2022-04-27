package Estabilizador;

public class Main {
    public static void main(String[] args) {
        Estabilizador estabilizador = new Estabilizador("Negro", "Forza", "Mediano", 139);
        System.out.println(estabilizador.color);

        System.out.println(estabilizador.marca);

        System.out.println(estabilizador.tamanio);

        System.out.println(estabilizador.precio);

        estabilizador.cargarEnergia();

        estabilizador.almacenarEnergia();

        estabilizador.regularVoltaje();

        estabilizador.cargarEnergia();
    }

}
