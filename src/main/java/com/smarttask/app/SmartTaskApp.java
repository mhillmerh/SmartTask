package com.smarttask.app;

import com.smarttask.service.GestorTareas;
import java.util.Scanner;

/**
 * Clase por la cual se interactua por la consola. Permitiendo eligir la opción que se quiere utilizar.
 */
public class SmartTaskApp {
    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Agregar tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Marcar como completada");
            System.out.println("4. Eliminar tarea");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Nombre");
                    String nombre = scanner.nextLine();
                    System.out.println("Prioridad");
                    int prioridad = scanner.nextInt();
                    System.out.println("¡¿Urgente?! (true/false): ");
                    boolean urgente = scanner.nextBoolean();
                    gestor.agregarTarea(nombre, prioridad, urgente);
                    break;

                case 2:
                    gestor.listarTareas();;
                    break;

                case 3:
                    System.out.println("ID: ");
                    gestor.marcarComoCompletada(scanner.nextInt());
                    break;

                case 4:
                    System.out.println("ID: ");
                    gestor.eliminarTareas(scanner.nextInt());
                    break;
            }

        } while (opcion != 0);
        scanner.close();
    }
}
