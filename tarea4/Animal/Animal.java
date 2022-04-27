package Animal;

public class Animal {

    public String tipo;

    public String tamanio;

    public String color;

    public String habitad;

    public Animal(String tip, String tam, String col, String hab) {
        establecerTipo(tip);

        establecerTamanio(tam);

        establecerColor(col);

        establecerHabitad(hab);

    }

    public String obtenerTipo() {
        return tipo;
    }

    public void establecerTipo(String tip) {
        tipo = tip;
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

    public String obtenerHabitad() {
        return habitad;
    }

    public void establecerHabitad(String hab) {
        habitad = hab;
    }

    public void cazar() {
        System.out.println("Para alimentar");
    }

    public void beber() {
        System.out.println("Para hidratarse");
    }

    public void sobrevivir() {
        System.out.println("Estar atento a todo amenaza");
    }

    public void aparearse() {
        System.out.println("Para que no se extingen");
    }

}
