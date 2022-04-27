package Alumno;

public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("kevin", "Arteaga", 2018160037, 73627795, "Jr Leon de Huanuco");

        System.out.println(alumno.obtenerNombre());

        System.out.println(alumno.obtenerApellido());

        System.out.println(alumno.obtenerCodigo());

        System.out.println(alumno.obtenerDni());

        System.out.println(alumno.obtenerDireccion());

        alumno.asistirUni();

        alumno.estudiar();

        alumno.practicar();
    }

}
