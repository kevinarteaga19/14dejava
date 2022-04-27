package CobradorMicro;

public class CobradorMicro {
    public String nombre;

    public String apellido;

    public Integer dni;

    public String direccion;

    public Integer edad;

    public CobradorMicro(String nom, String ape, Integer dn, String dire, Integer ed) {
        establecerNombre(nom);

        establecerApellido(ape);

        establecerDni(dn);

        establecerDireccion(dire);

        establecerEdad(ed);
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

    public Integer obtenerEdad() {
        return edad;
    }

    public void establecerEdad(Integer ed) {
        edad = ed;
    }

    public void cobrarPasaje() {

        System.out.println("Pedir pasaje a los pasajeros");

    }

    public void decirDistino() {

        System.out.println("llamar los nombres de los paraderos");

    }

}
