package CableUsb;

public class CableUsb {
    public String color;

    public String tamanio;

    public String marca;

    public String material;

    public CableUsb(String col, String tam, String mar, String mat) {
        establecerColor(col);

        establecerTamanio(tam);

        establecerMarca(mar);

        establecerMaterial(mat);
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

    public String obtenerMaterial() {
        return material;
    }

    public void establecerMaterial(String mat) {
        material = mat;
    }

    public void transferirDatos() {

        System.out.println("Datos Transferidos...90%");

    }

    public void transferiereEnergia() {

        System.out.println("Cargada ...85%");

    }

    public void recepcionaEnergia() {

        System.out.println("Energia completada");

    }

}
