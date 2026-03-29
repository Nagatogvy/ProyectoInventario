import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArbolInventario arbol =
            new ArbolInventario();

        int opcion;

        do {

            System.out.println(
            "\n=== INVENTARIO TREE-STOCK ===");

            System.out.println(
            "1. Registrar Producto");

            System.out.println(
            "2. Mostrar Inventario");

            System.out.println(
            "3. Buscar Producto");

            System.out.println(
            "0. Salir");

            System.out.print(
            "Seleccione opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print(
                    "Ingrese ID: ");

                    int id =
                    scanner.nextInt();

                    scanner.nextLine();

                    System.out.print(
                    "Ingrese nombre: ");

                    String nombre =
                    scanner.nextLine();

                    arbol.insertar(id, nombre);

                    System.out.println(
                    "Producto registrado.");

                    break;

                case 2:

                    System.out.println(
                    "\nInventario ordenado:");

                    arbol.mostrarInventario();

                    break;

                case 3:

                    System.out.print(
                    "Ingrese ID a buscar: ");

                    int idBuscar =
                    scanner.nextInt();

                    if (arbol.buscar(idBuscar)) {

                        System.out.println(
                        "Producto encontrado.");

                    } else {

                        System.out.println(
                        "Producto NO encontrado.");

                    }

                    break;

                case 0:

                    System.out.println(
                    "Saliendo...");

                    break;

                default:

                    System.out.println(
                    "Opción inválida.");

            }

        } while (opcion != 0);

        scanner.close();
    }
}
