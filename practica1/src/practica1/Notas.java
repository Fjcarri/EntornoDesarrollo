package practica1;

import java.util.Scanner;

/**
 * La clase Notas permite ingresar, comprobar y calcular notas de estudiantes.
 * 
 * @version 1.0
 * @since 2024-03-22
 * @author Francisco Javier Carrillo
 */
public class Notas {
    double uf1, uf2, uf3; // Notas de las unidades
    double acu1, acu2, acu3, def; // Acumulados y nota definitiva
    Scanner entrada = new Scanner(System.in); // Scanner para entrada de datos

    /**
     * Método para ingresar las notas del estudiante.
     * 
     * Este método permite al usuario ingresar las notas de las tres unidades formativas.
     */
    public void IngresaNotas() {
        System.out.println("Ingrese las notas del estudiante");
        System.out.print("Ingrese nota 1: ");
        uf1 = entrada.nextDouble();
        System.out.print("Ingrese nota 2: ");
        uf2 = entrada.nextDouble();
        System.out.print("Ingrese nota 3: ");
        uf3 = entrada.nextDouble();
    }

    /**
     * Método para comprobar la correcta introducción de las notas.
     * 
     * Este método realiza la comprobación de las notas introducidas para asegurar que se encuentran en la localización correcta
     */
    public void comprobacion() {
        // Comprobación de las notas introducidas
        if (uf1 > 10) {
            System.out.println("Nota 1 mal introducida");
        } else {
            System.out.println("Nota 1 correcta");
        }

        if (uf2 > 10) {
            System.out.println("Nota 2 mal introducida");
        } else {
            System.out.println("Nota 2 correcta");
        }

        if (uf3 > 10) {
            System.out.println("Nota 3 mal introducida");
        } else {
            System.out.println("Nota 3 correcta");
        }
    }

    /**
     * Método para calcular la nota definitiva del estudiante.
     * 
     * Este método calcula la nota definitiva del estudiante teniendo en cuenta las tres unidades formativas.
     */
    public void Calculonotas() {
        acu1 = uf1 * 0.35;
        acu2 = uf2 * 0.35;
        acu3 = uf3 * 0.30;

        def = acu1 + acu2 + acu3;
    }

    /**
     * Método para mostrar las notas introducidas y la nota definitiva del estudiante.
     * 
     * Este método muestra las notas introducidas por el usuarioy la nota definitiva calculada.
     */
    public void Mostrar() {
        // Muestra las notas y la nota definitiva
        System.out.println("Las notas introducidas son:");
        System.out.println("Nota 1 = " + uf1);
        System.out.println("Nota 2 = " + uf2);
        System.out.println("Nota 3 = " + uf3);

        System.out.println("Acumulado 1 = " + acu1);
        System.out.println("Acumulado 2 = " + acu2);
        System.out.println("Acumulado 3 = " + acu3);

        System.out.println("La nota definitiva es = " + def);
    }

    /**
     * Método para verificar si el estudiante aprobó o no.
     * 
     * Este método verifica si la nota definitiva del estudiante está aprobada del 5 al 10 o suspensa del 4 al 0.
     */
    public void aprobado() {
        // Verificación de aprobación
        if (def < 5 && def >= 0) {
            System.out.println("Suspendió");
        } else {
            if (def >= 5 && def <= 10) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Error en las notas");
            }
        }
    }

    /**
     * Método principal para la ejecución del programa.
     *
     * @param args Argumentos de la línea de comandos que no se están utilizando actualmente.
     */
    public static void main(String[] args) {
        // Instanciar la clase Notas y llamar a los métodos necesarios
        Notas fc = new Notas();

        fc.IngresaNotas();
        fc.comprobacion();
        fc.Calculonotas();
        fc.Mostrar();
        fc.aprobado();
    }
}

