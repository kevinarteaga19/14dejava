package Barbero;

public class Barbero {
    public String nombre;

    public String apellido;

    public Integer dni;

    public String direccion;

    public Barbero(String nom, String ape, Integer dn, String dire) {
        establecerNombre(nom);

        establecerApellido(ape);

        establecerDni(dn);

        establecerDireccion(dire);
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public void establecerApellido(String ape) {
        apellido = ape;
    }

    public Integer obtenerDni() {
        return dni;
    }

    public void establecerDni(Integer dn) {
        dni = dn;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public void establecerDireccion(String dire) {
        direccion = dire;
    }

    public void cortarCabello() {

        System.out.println("Cabello cortado");

    }

    public void afeitarBarba() {

        System.out.println("Barba afeitada");

    }

    public void peinar() {

        System.out.println("Cabello Peinado");

    }

    public void mojarCabello() {

        System.out.println("Cabello mojado");

    }

    public void cobrarCorte() {

        System.out.println("Cobrar a cliente");

    }
}
