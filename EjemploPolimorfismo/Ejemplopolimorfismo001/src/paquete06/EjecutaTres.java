package paquete06;

public class EjecutaTres {

    public static void main(String[] args) {
        String nombre = "Rene";
        String apellido = "Elizalde";
        EstudianteDistancia e = new EstudianteDistancia(nombre, apellido, 5, 150);
        e.establecerIdentificacionEstudiante("1010101010");
        e.establecerEdadEstudiante(40);
        e.calcularMatricula();
        System.out.printf("%s\n", e);
    }
}
