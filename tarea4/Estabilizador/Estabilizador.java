package Estabilizador;

public class Estabilizador {
    public String color;

    public String marca;

    public String tamanio;

    public Integer precio;

    public Estabilizador(String col, String mar, String tam, Integer pre) {
        establecerColor(col);

        establecerMarca(mar);

        establecerTamanio(tam);

        establecerPrecio(pre);
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

    public String obtenerTamanio() {
        return color;
    }

    public void establecerTamanio(String tam) {
        tamanio = tam;
    }

    public Integer obtenerPrecio() {
        return precio;
    }

    public void establecerPrecio(Integer pre) {
        precio = pre;
    }

    public void cargarEnergia() {

        System.out.println("Carga completada...");

    }

    public void almacenarEnergia() {

        System.out.println("Energia almacenada");

    }

    public void regularVoltaje() {

        System.out.println("Subir voltaje");

    }

    public void cargarEstabilizador() {

        System.out.println("Carga completada...75%");

    }

}
