package paquete06;

import java.util.ArrayList;
import java.util.Scanner;
import paquete04.Estudiante;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        
         */
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;
        int contador;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        // inicio de solución
        contador = 0;
        while (contador < 4) {
            System.out.println("Tipo de Estudiante a ingresar\n"
                    + "Ingrese (1) para Estudiante Presencial"
                    + "Ingrese (2) para Estudiante Distancia");
            tipoEstudiante = entrada.nextInt();
            entrada.nextLine();
            
            System.out.println("Ingrese los nombres del estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = entrada.nextInt();
            if (tipoEstudiante == 1) {
                
            }
            // ciclo que permite comprobar el polimorfismo
            // este código no debe ser modificado.
            for (int i = 0; i < estudiantes.size(); i++) {
                // 1.  
                estudiantes.get(i).calcularMatricula();

                System.out.printf("Datos Estudiante\n"
                        + "%s\n",
                        estudiantes.get(i));

            }
        }

    }
}
