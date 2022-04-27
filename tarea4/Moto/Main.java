package Moto;

public class Main {
    public static void main(String[] args) {
        Moto moto = new Moto("Grade", "Negro", "Hero", 150, "150 km/h");
        System.out.println(moto.tamanio);

        System.out.println(moto.color);

        System.out.println(moto.marca);

        System.out.println(moto.motor);

        System.out.println(moto.velocidad);

        moto.encender();

        moto.apagar();

        moto.rutear();
    }

}
