package Carro;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Negro", "Ford", "A24280", "2000");
        System.out.println(carro.color);

        System.out.println(carro.marca);

        System.out.println(carro.placa);

        System.out.println(carro.motor);

        carro.encenderCarro();

        carro.apagarCarro();

        carro.trasladarPersonas();
    }

}
