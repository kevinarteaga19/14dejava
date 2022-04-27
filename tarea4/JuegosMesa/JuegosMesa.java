package JuegosMesa;

public class JuegosMesa {
    public String color;

    public String tamanio;

    public Integer numeroJugadores;

    public Integer edadJugar;

    public JuegosMesa(String col, String tam, Integer num, Integer ed) {
        establecerColor(col);

        establecerTamanio(tam);

        establecerNumeroJugadores(num);

        establecerEdadJugar(ed);
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

    public Integer obtenerNumeroJugadores() {
        return numeroJugadores;
    }

    public void establecerNumeroJugadores(Integer num) {
        numeroJugadores = num;
    }

    public Integer obtenerEdadJugar() {
        return edadJugar;
    }

    public void establecerEdadJugar(Integer ed) {
        edadJugar = ed;
    }

    public void unirPersonas() {

        System.out.println("Jugar para amenizar");

    }

    public void entretener() {

        System.out.println("Desestrezarse");

    }

    public void divertirse() {

        System.out.println("Pasar momentos divertidos");

    }

}
