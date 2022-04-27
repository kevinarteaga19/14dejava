package CobradorMicro;

public class Main {
    public static void main(String[] args) {
        CobradorMicro cobradorMicro = new CobradorMicro("Pedro", "Sanchez", 73984268, "Avenida Brazil", 25);
        System.out.println(cobradorMicro.nombre);

        System.out.println(cobradorMicro.apellido);

        System.out.println(cobradorMicro.dni);

        System.out.println(cobradorMicro.direccion);

        System.out.println(cobradorMicro.edad);

        cobradorMicro.cobrarPasaje();

        cobradorMicro.decirDistino();
    }

}
