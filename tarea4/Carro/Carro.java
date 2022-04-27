package Carro;

public class Carro {
    public String color;

    public String marca;

    public String placa;

    public String motor;

    public Carro(String col, String mar, String pla, String mot) {
        establecerColor(col);

        establecerMarca(mar);

        establecerPlaca(pla);

        establecerMotor(mot);

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

    public String obtenerPlaca() {
        return placa;
    }

    public void establecerPlaca(String pla) {
        placa = pla;
    }

    public String obtenerMotor() {
        return motor;
    }

    public void establecerMotor(String mot) {
        motor = mot;
    }

    public void encenderCarro() {

        System.out.println("Prendo el carro");

    }

    public void apagarCarro() {

        System.out.println("Apagar carro para bajar");

    }

    public void trasladarPersonas() {

        System.out.println("Usarlo como taxi");

    }

}
