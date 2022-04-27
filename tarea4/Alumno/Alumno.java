package Alumno;

public class Alumno {

    public String nombre;

    public String apellido;

    public Integer codigo;

    public Integer dni;

    public String direccion;

    public Alumno(String nom, String ape, Integer cod, Integer dn, String dire) {
        establecerNombre(nom);

        establecerApellido(ape);

        establecerCodigo(cod);

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

    public Integer obtenerCodigo() {
        return codigo;
    }

    public void establecerCodigo(Integer cod) {
        codigo = cod;
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

    public void asistirUni() {
        System.out.println("Ir a clases");
    }

    public void estudiar() {
        System.out.println("Estudiar Poo");
    }

    public void practicar() {
        System.out.println("Programar");
    }

}
