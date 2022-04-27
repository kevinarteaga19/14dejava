package JuegosMesa;

public class Main {
    public static void main(String[] args) {
        JuegosMesa juegosMesa = new JuegosMesa("Marron", "Mediano", 4, 15);
        System.out.println(juegosMesa.color);

        System.out.println(juegosMesa.tamanio);

        System.out.println(juegosMesa.numeroJugadores);

        System.out.println(juegosMesa.edadJugar);

        juegosMesa.unirPersonas();

        juegosMesa.entretener();

        juegosMesa.divertirse();
    }

}
