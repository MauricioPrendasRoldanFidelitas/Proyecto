/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoestructurasdedatos;
import java.util.Scanner;
/**
 *
 * @author Melvin Prendas
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de la planta recicladora Pequeña Lisa");
        Scanner scanner = new Scanner(System.in);
        PilaResiduos pilaResiduos = new PilaResiduos();
        ColaResiduos colaReciclaje = new ColaResiduos();
        while (true) {
            System.out.println("\nMenú Principal:");
            System.out.println("1. Registrar ingreso de residuo");
            System.out.println("2. Ver residuos apilados");
            System.out.println("3. Apilar residuo");
            System.out.println("4. Trasladar residuos a Cola de reciclaje");
            System.out.println("5. Ver residuos encolados");
            System.out.println("6. Desencolar residuos");
            System.out.println("7. Convertir residuos desencolados en productos reciclados");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registrarIngresoResiduos(scanner, pilaResiduos);
                    scanner.nextLine();
                    break;
                case 2:
                    verResiduosApilados(pilaResiduos);
                    scanner.nextLine();
                    break;
                case 3:
                    apilarResiduo(scanner, pilaResiduos);
                    scanner.nextLine();
                    break;
                case 4:
                    trasladarResiduosACola(pilaResiduos, colaReciclaje);
                    scanner.nextLine();
                    break;
                case 5:
                    verResiduosEncolados(colaReciclaje);
                    scanner.nextLine();
                    break;
                case 6:
                    desencolarResiduos(colaReciclaje);
                    scanner.nextLine();
                    break;
                case 7:
                    convertirResiduosEnProductos(colaReciclaje);
                    scanner.nextLine();
                    break;
                case 8:
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }
    }

    // Métodos para cada opción del menú
    public static void registrarIngresoResiduos(Scanner scanner, PilaResiduos pilaResiduos) {
        System.out.print("Ingrese el nombre del residuo: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el tipo de residuo (aluminio, papel, vidrio, etc.): ");
        String tipo = scanner.next();
        Residuo residuo = new Residuo(nombre, tipo);
        pilaResiduos.Push(residuo);
        System.out.println("Residuo registrado y apilado.");
    }

    public static void verResiduosApilados(PilaResiduos pilaResiduos) {
        System.out.println("Residuos apilados:");
        pilaResiduos.print();
    }

    public static void apilarResiduo(Scanner scanner, PilaResiduos pilaResiduos) {
        System.out.print("Ingrese el nombre del residuo: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el tipo de residuo (aluminio, papel, vidrio, etc.): ");
        String tipo = scanner.next();
        Residuo residuo = new Residuo(nombre, tipo);
        pilaResiduos.Push(residuo);
        System.out.println("Residuo apilado.");
    }

    public static void trasladarResiduosACola(PilaResiduos pilaResiduos, ColaResiduos colaReciclaje) {
        System.out.println("Trasladando residuos de Pila a Cola de reciclaje...");
        while (!pilaResiduos.isEmpty()) {
            Residuo residuo = pilaResiduos.pop();
            NodoCola nodo = new NodoCola(residuo, null);
            colaReciclaje.enqueue(nodo);
        }
        System.out.println("Traslado completado.");
    }

    public static void verResiduosEncolados(ColaResiduos colaReciclaje) {
        System.out.println("Residuos encolados:");
        System.out.println(colaReciclaje.toString());
    }

    public static void desencolarResiduos(ColaResiduos colaReciclaje) {
        System.out.println("Desencolando residuos de la Cola de reciclaje...");
        while (!colaReciclaje.isEmpty()) {
            NodoCola nodo = colaReciclaje.dequeue();
            Residuo residuo = nodo.getResiduo();
            System.out.println(residuo.toString());
            // Aquí puedes procesar el residuo si es necesario
        }
        System.out.println("Desencolado completado.");
    }

    public static void convertirResiduosEnProductos(ColaResiduos colaReciclaje) {
        System.out.println("Convirtiendo residuos en productos reciclados...");
        while (!colaReciclaje.isEmpty()) {
            NodoCola nodo = colaReciclaje.dequeue();
            Residuo residuo = nodo.getResiduo();
            ProductoReciclado producto = new ProductoReciclado(residuo);
            System.out.println(producto.toString());
            // Aquí puedes añadir el producto a una lista o base de datos
        }
        System.out.println("Conversión completada.");
    }
}
    