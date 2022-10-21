package ab_computoypresupuesto;

import static ab_computoypresupuesto.Menu.leerTeclado;
import java.util.ArrayList;

public class FuncionesComputo {

    static ArrayList<MaterialComputado> listaMateriales = new ArrayList<MaterialComputado>();
    static int numeroDeMaterial = 1;
    static int sumatoriaParcial = 0;

    static void nuevoMaterial() {
        MaterialComputado material1 = new MaterialComputado();

        material1.setNumeroMaterial(numeroDeMaterial);
        numeroDeMaterial++;
        System.out.println("NOMBRE DEL MATERIAL A COMPUTAR");
        material1.setNombreMaterial(leerTeclado.next());
        System.out.println("CANTIDAD DEL MATERIAL COMPUTADO");
        material1.setCantidad(leerTeclado.nextInt());
        System.out.println("PRECIO DEL MATERIAL COMPUTADO");
        material1.setPrecio(leerTeclado.nextInt());
        material1.setComputoParcial(material1.getCantidad() * material1.getPrecio());
        sumatoriaParcial += material1.getComputoParcial();
        listaMateriales.add(material1);
    }

    static void eliminarMaterial() {
        System.out.println("Ingrese numero del material a eliminar");
        int materialAEliminar = leerTeclado.nextInt();
        boolean logreEliminar = false;
        for (MaterialComputado item : listaMateriales) {
            if (item.getNumeroMaterial() == materialAEliminar) {
                listaMateriales.remove(item);
                logreEliminar = true;
                break;
            }
        }
        if (logreEliminar) {
            System.out.println(" --- Material eliminado --- ");
            // sumatoriaParcial -= listaMateriales
        } else {
            System.out.println(" --- No existe ese material --- ");
        }
    }

    static void reiniciarComputo() {
        listaMateriales.clear();
    }

    static void computarMateriales() {

    }

    static void mostrarMateriales() {
        for (MaterialComputado item : listaMateriales) {
            System.out.println(item.toString());
        }
    }

}
