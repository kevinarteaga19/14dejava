package Celular;

public class Celular {
    public String color;

    public String tamanio;

    public String marca;

    public Integer memoria;

    public Integer camara;

    public Celular(String col, String tam, String mar, Integer mem, Integer cam) {
        establecerColor(col);

        establecerTamanio(tam);

        establecerMarca(mar);

        establecerMemoria(mem);

        establecerCamara(cam);
    }

    public String obtenerColor() {
        return color;
    }

    public void establecerColor(String col) {
        color = col;
    }

    public String obtenerTamanio() {
        return tamanio;
    }

    public void establecerTamanio(String tam) {
        tamanio = tam;
    }

    public String obtenerMarca() {
        return marca;
    }

    public void establecerMarca(String mar) {
        marca = mar;
    }

    public Integer obtenerMemoria() {
        return memoria;
    }

    public void establecerMemoria(Integer mem) {
        memoria = mem;
    }

    public Integer obtenerCamara() {
        return camara;
    }

    public void establecerCamara(Integer cam) {
        camara = cam;
    }

    public void llamar() {

        System.out.println("Comunicarme con mis contactos");

    }

    public void colgarLlamada() {

        System.out.println("Terminar llamada");

    }

    public void escucharMusica() {

        System.out.println("Para distraerse");

    }

    public void chatear() {

        System.out.println("Comunicarme con amigos");

    }

}
