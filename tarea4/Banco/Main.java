package Banco;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("BCP", 35642, "Kevin Arteaga");

        System.out.println(banco.nombre);

        System.out.println(banco.numeroClientes);

        System.out.println(banco.tablaClientes);

        banco.crearCuenta();

        banco.modificarCuentas();

        banco.TransferenciaMontos();
    }

}
