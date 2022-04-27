package Celular;

public class Main {
    public static void main(String[] args) {
        Celular celular = new Celular("Azul marino", "Grande", "Xiaomi", 64, 48);
        System.out.println(celular.color);

        System.out.println(celular.tamanio);

        System.out.println(celular.marca);

        System.out.println(celular.memoria);

        System.out.println(celular.camara);

        celular.llamar();

        celular.colgarLlamada();

        celular.escucharMusica();

        celular.chatear();
    }

}
