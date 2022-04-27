package Delivery;

public class Main {
    public static void main(String[] args) {
        Delivery delivery = new Delivery("Emerzon", "Toledo", 24, "Moto lineal");
        System.out.println(delivery.nombre);

        System.out.println(delivery.apellido);

        System.out.println(delivery.edad);

        System.out.println(delivery.movilidad);

        delivery.recibirPedido();

        delivery.llevarPedido();

        delivery.entregarPedido();

        delivery.cobrarPedido();
    }

}
