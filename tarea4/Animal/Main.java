package Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Mamifero", "Mediano", "Amarillo", "Africa");

        System.out.println(animal.obtenerTipo());

        System.out.println(animal.obtenerTamanio());

        System.out.println(animal.obtenerColor());

        System.out.println(animal.obtenerHabitad());

        animal.cazar();

        animal.beber();

        animal.sobrevivir();

        animal.aparearse();

    }

}
