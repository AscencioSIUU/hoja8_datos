package uvg;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner teclado = new Scanner(System.in);
        FileManager manager = new FileManager();

        System.out.println("Hospital: Cada día más cerca de Cristo ");
        System.out.println(
                "1. Mostrar cola de emergencias\n2. Mostrar cola ordenada por prioridad de emergencias\n3. Salir del programa");
        int opcion = teclado.nextInt();

        ArrayList<Paciente> pacientes = manager.readTXTFile("/pacientes.txt");
        switch (opcion) {
            case 1:
                if (!pacientes.isEmpty()) {
                    System.out.println("Cola de emergencias: ");
                    for (Paciente paciente : pacientes) {
                        System.out.println(paciente);
                    }
                    System.out.println("Lista de pacientes terminada");
                }
                break;

            case 2:
                VectorHeap<Paciente> colaOrdenada = new VectorHeap<>();
                for (Paciente paciente : pacientes) {
                    colaOrdenada.add(paciente);
                }
                while (!colaOrdenada.isEmpty()) {
                    System.out.println(colaOrdenada.remove());
                }
                System.out.println("Lista de pacientes terminada");
                break;

            case 3:
                System.out.println("Saliendo de programa...");
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }
        teclado.close();
    }
}