package ab_computoypresupuesto;

import static ab_computoypresupuesto.FuncionesComputo.computarMateriales;
import static ab_computoypresupuesto.FuncionesComputo.eliminarMaterial;
import static ab_computoypresupuesto.FuncionesComputo.mostrarMateriales;
import static ab_computoypresupuesto.FuncionesComputo.nuevoMaterial;
import static ab_computoypresupuesto.FuncionesComputo.reiniciarComputo;
import java.util.Scanner;

public class Menu {

    static int opcionMenu = -1;
    static Scanner leerTeclado = new Scanner(System.in);

    public static void iniciarMenu() {
        while (opcionMenu != 0) {
            mostrarMenu();
            opcionMenu = leerTeclado.nextInt();
            ejecutarMenu();
            computarYPresupuestar();
        }

    }

    public static void mostrarMenu() {
        System.out.println("OPCIONES");
        System.out.println("0 - Salir");
        System.out.println("1 - Nuevo material");
        System.out.println("2 - Eliminar material");
        System.out.println("3 - Mostrar materiales");
        System.out.println("4 - Reiniciar");
        opcionMenu = leerTeclado.nextInt();
    }

    public static void ejecutarMenu() {
        switch (opcionMenu) {
            case 0:
                System.out.println("--- PROGRAMA FINALIZADO ---");
                break;
            case 1:
                System.out.println("--- Ingrese un nuevo material ---");
                nuevoMaterial();
                break;
            case 2:
                System.out.println("--- Ingrese nombre del material a eliminar ---");
                eliminarMaterial();
                break;
            case 3:
                System.out.println("--- Materiales computados ---");
                mostrarMateriales();
                break;
            case 4:
                System.out.println("--- Programa reiniciado ---");
                reiniciarComputo();
                break;
        }
    }

    public static void computarYPresupuestar() {
        computarMateriales();
        System.out.println("--- Materiales computados ---");
        mostrarMateriales();
    }

}
