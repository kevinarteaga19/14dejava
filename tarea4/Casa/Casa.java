package Casa;

public class Casa {
    public String direccion;

    public String color;

    public Integer numeroHabitantes;

    public String tamanio;

    public Casa(String dire, String col, Integer num, String tam) {
        establecerDireccion(dire);

        establecerColor(col);

        establecerNumeroHabitantes(num);

        establecerTamanio(tam);
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public void establecerDireccion(String dire) {
        direccion = dire;
    }

    public String obtenerColor() {
        return color;
    }

    public void establecerColor(String col) {
        color = col;
    }

    public Integer obtenerNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void establecerNumeroHabitantes(Integer num) {
        numeroHabitantes = num;
    }

    public String obtenerTamanio() {
        return tamanio;
    }

    public void establecerTamanio(String tam) {
        tamanio = tam;
    }

    public void alojarPersonas() {

        System.out.println("Dar hospedaje");

    }

    public void almacenarPertenencia() {

        System.out.println("Guardar cosas de valor");

    }

}
