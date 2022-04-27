package Camara;

public class Main {
    public static void main(String[] args) {
        Camara camara = new Camara("Grande", "Profesional", "Negro", "Xiaomi", 64);
        System.out.println(camara.tamanio);

        System.out.println(camara.tipo);

        System.out.println(camara.color);

        System.out.println(camara.marca);

        System.out.println(camara.pixeles);

        camara.grabar();

        camara.tomarFotos();

        camara.mostrarfotos();

        camara.transferirFotos();

        camara.eliminarFotos();
    }

}
