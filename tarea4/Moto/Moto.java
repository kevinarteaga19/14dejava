package Moto;

public class Moto {
    public String tamanio;

    public String color;

    public String marca;

    public Integer motor;

    public String velocidad;

    public Moto(String tam, String col, String mar, Integer mot, String vel) {
        establecerTamanio(tam);

        establecerColor(col);

        establecerMarca(mar);

        establecerMotor(mot);

        establecerVelocidad(vel);
    }

    public String obtenerTamanio() {
        return tamanio;
    }

    public void establecerTamanio(String tam) {
        tamanio = tam;
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

    public Integer obtenerMotor() {
        return motor;
    }

    public void establecerMotor(Integer mot) {
        motor = mot;
    }

    public String obtenerVelocidad() {
        return tamanio;
    }

    public void establecerVelocidad(String vel) {
        velocidad = vel;
    }

    public void encender() {

        System.out.println("Prender moto");

    }

    public void apagar() {

        System.out.println("Apagar moto");

    }

    public void rutear() {

        System.out.println("Hacer viajes");

    }

}
