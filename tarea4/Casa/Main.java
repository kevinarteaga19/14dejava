package Casa;

public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa("Avenida Tupac Amaru", "Verde cañaveral", 5, "Mediano");
        System.out.println(casa.direccion);

        System.out.println(casa.color);

        System.out.println(casa.numeroHabitantes);

        System.out.println(casa.tamanio);

        casa.alojarPersonas();

        casa.almacenarPertenencia();

    }

}
