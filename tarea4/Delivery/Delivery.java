package Delivery;

public class Delivery {
    public String nombre;

    public String apellido;

    public Integer edad;

    public String movilidad;

    public Delivery(String nom, String ape, Integer ed, String mov) {
        establecerNombre(nom);

        establecerApellido(ape);

        establecerEdad(ed);

        establecerMovilidad(mov);
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public void establecerApellido(String ape) {
        apellido = ape;
    }

    public Integer obtenerEdad() {
        return edad;
    }

    public void establecerEdad(Integer ed) {
        edad = ed;
    }

    public String obtenerMovilidad() {
        return movilidad;
    }

    public void establecerMovilidad(String mov) {
        movilidad = mov;
    }

    public void recibirPedido() {

        System.out.println("Ir a la tienda para recoger pedido");

    }

    public void llevarPedido() {

        System.out.println("Ir al destino de entrega");

    }

    public void entregarPedido() {

        System.out.println("Dar pedido al cliente");

    }

    public void cobrarPedido() {

        System.out.println("Cobrar precio de entrega");

    }

}
