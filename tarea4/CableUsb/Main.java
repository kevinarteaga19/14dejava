package CableUsb;

public class Main {
    public static void main(String[] args) {
        CableUsb cableUsb = new CableUsb("Negro", "Mediano", "Kingston", "Resistente");
        System.out.println(cableUsb.color);

        System.out.println(cableUsb.tamanio);

        System.out.println(cableUsb.marca);

        System.out.println(cableUsb.material);

        cableUsb.transferirDatos();

        cableUsb.transferiereEnergia();

        cableUsb.recepcionaEnergia();
    }

}
