
package paquete06;

public class EjecutaDos {
    public static void main(String[] args) {
        String nombre= "Rene";
        String apellido = "Elizalde";
        EstudianteDistancia e = new EstudianteDistancia(nombre,apellido);
        e.establecerIdentificacionEstudiante("1010101010");
        e.establecerEdadEstudiante(40);
        e.establecerNumeroAsginaturas(10);
        e.establecerCostoAsignatura(100);
        e.calcularMatricula();
        System.out.printf("%s\n",e);
    }
}
