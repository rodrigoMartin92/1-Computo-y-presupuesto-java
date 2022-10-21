package ab_computoypresupuesto;

import static ab_computoypresupuesto.FuncionesComputo.computarMateriales;
import static ab_computoypresupuesto.FuncionesComputo.eliminarMaterial;
import static ab_computoypresupuesto.FuncionesComputo.leerTeclado;
import static ab_computoypresupuesto.FuncionesComputo.mostrarMateriales;
import static ab_computoypresupuesto.FuncionesComputo.nuevoMaterial;
import static ab_computoypresupuesto.FuncionesComputo.reiniciarComputo;

public class AB_ComputoYPresupuesto {

    static int opcionMenu = -1;

    public static void mostrarMenu() {
        System.out.println("OPCIONES");
        System.out.println("0 - Salir");
        System.out.println("1 - Nuevo material");
        System.out.println("2 - Eliminar material");
        System.out.println("3 - Mostrar materiales");
        System.out.println("4 - Reiniciar");
        opcionMenu = leerTeclado.nextInt();
    }

    public static void main(String[] args) {

        while (opcionMenu != 0) {
            mostrarMenu();
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
            computarMateriales();
            System.out.println("--- Materiales computados ---");
            mostrarMateriales();
        }
    }
}
