package Banco;

public class Banco {

    public String nombre;

    public Integer numeroClientes;

    public String tablaClientes;

    public Banco(String nom, Integer num, String tab) {
        establecerNombre(nom);

        establecerNumeroClientes(num);

        establecerTablaClientes(tab);
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public Integer obtenerNumeroClientes() {
        return numeroClientes;
    }

    public void establecerNumeroClientes(Integer num) {
        numeroClientes = num;
    }

    public String obtenerNumeroTablaClientes() {
        return tablaClientes;
    }

    public void establecerTablaClientes(String tab) {
        tablaClientes = tab;
    }

    public void crearCuenta() {

        System.out.println("Cuenta creada");

    }

    public void modificarCuentas() {

        System.out.println("Cliente modificado");

    }

    public void TransferenciaMontos() {

        System.out.println("Monto transferido");

    }

}
