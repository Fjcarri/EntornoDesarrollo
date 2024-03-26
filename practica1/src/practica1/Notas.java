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
    double primera, segunda, tercera; // Notas de las unidades
    double acumulada1, acumulada2, acumulada3, def; // Acumulados y nota definitiva //Cambio para GitHub
    Scanner entrada = new Scanner(System.in); // Scanner para entrada de datos

    /**
     * Método para ingresar las notas del estudiante.
     * 
     * Este método permite al usuario ingresar las notas de las tres unidades formativas.
     */
    public void IngresarNotas() {
        System.out.println("Ingrese las notas del estudiante");
        System.out.print("Ingrese la primera nota: ");
        primera = entrada.nextDouble();
        System.out.print("Ingrese la segunda nota: ");
        segunda = entrada.nextDouble();
        System.out.print("Ingrese la tercera nota: ");
        tercera = entrada.nextDouble();
    }

    /**
     * Método para comprobar la correcta introducción de las notas.
     * 
     * Este método realiza la comprobación de las notas introducidas para asegurar que se encuentran en la localización correcta
     */
    public void comprobar() {
        // Comprobación de las notas introducidas
        if (primera > 10) {
            System.out.println("Primera nota mal introducida");
        } else {
            System.out.println("Primera nota correcta");
        }

        if (segunda > 10) {
            System.out.println("Segunda nota mal introducida");
        } else {
            System.out.println("Segunda nota correcta");
        }

        if (tercera > 10) {
            System.out.println("Tercera nota mal introducida");
        } else {
            System.out.println("Tercera nota correcta");
        }
    }

    /**
     * Método para calcular la nota definitiva del estudiante.
     * 
     * Este método calcula la nota definitiva del estudiante teniendo en cuenta las tres unidades formativas.
     */
    public void CalcularNotas() {
        acumulada1 = primera * 0.35; //Cambios para GitHub
        acumulada2 = segunda * 0.35;
        acumulada3 = tercera * 0.30;

        def = acumulada1 + acumulada2 + acumulada3; //Cambios GitHub
    }

    /**
     * Método para mostrar las notas introducidas y la nota definitiva del estudiante.
     * 
     * Este método muestra las notas introducidas por el usuarioy la nota definitiva calculada.
     */
    public void Mostrar() {
        // Muestra las notas y la nota definitiva
        System.out.println("Las notas introducidas son:");
        System.out.println("Primera = " + primera);
        System.out.println("Segunda = " + segunda);
        System.out.println("Tercera = " + tercera);

        System.out.println("Acumulado 1 = " + acumulada1); //Cambios GitHub
        System.out.println("Acumulado 2 = " + acumulada2);
        System.out.println("Acumulado 3 = " + acumulada3);

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

        fc.IngresarNotas();
        fc.comprobar();
        fc.CalcularNotas();
        fc.Mostrar();
        fc.aprobado();
    }
}

