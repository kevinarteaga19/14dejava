package Camara;

public class Camara {
    public String tamanio;

    public String tipo;

    public String color;

    public String marca;

    public Integer pixeles;

    public Camara(String tam, String tip, String col, String mar, Integer pix) {
        establecerTamanio(tam);

        establecerTipo(tip);

        establecerColor(col);

        establecerMarca(mar);

        establecerPixeles(pix);
    }

    public String obtenerTamanio() {
        return tamanio;
    }

    public void establecerTamanio(String tam) {
        tamanio = tam;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public void establecerTipo(String tip) {
        tipo = tip;
    }

    public String obtenerColor() {
        return color;
    }

    public void establecerColor(String col) {
        color = col;
    }

    public String obtenerMarca() {
        return marca;
    }

    public void establecerMarca(String mar) {
        marca = mar;
    }

    public Integer obtenerPixeles() {
        return pixeles;
    }

    public void establecerPixeles(Integer pix) {
        pixeles = pix;
    }

    public void grabar() {

        System.out.println("Hacer un video");

    }

    public void tomarFotos() {

        System.out.println("Tomar fotos tumblr");

    }

    public void mostrarfotos() {

        System.out.println("Enseñar foto echa");

    }

    public void transferirFotos() {

        System.out.println("Pasar a otros dispositivos");

    }

    public void eliminarFotos() {

        System.out.println("Borrar fotos que no me gusta");

    }

}
