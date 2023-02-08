package co.edu.uptc.presentacion;

import co.edu.uptc.logica.Modelo.Nodo;
import co.edu.uptc.logica.control.Controller;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Console {
    private Controller controller=new Controller();
    private Scanner sc=new Scanner(System.in);
    public void menu(){
        int op=6;
        do {
        System.out.println("""
                Menu
                1.añadir al treemap
                2.tamaño
                3.buscar un elemento y sus relaciones
                4.mostrar treemap
                0 salir
                """);
        op=sc.nextInt();
        switch (op){
            case 1:
                System.out.println("ingrese la clave");
                int clave = sc.nextInt();
                System.out.println("ingrese el contenido");
                String content=sc.nextLine();
                controller.addNodo(clave,content);
                break;

            case 2:
                System.out.printf("el tamaño del treemap es de %d y el numero de ramas es de %d",controller.getTamaño(),controller.getNumRamas());
                break;
            case 3:
                System.out.println("ingrese la clave ");
                int claveB = sc.nextInt();
                Nodo mostrar=controller.buscar(claveB);
                if (mostrar!=null){
                System.out.println("clave del obj: "+mostrar.getClave()+"\ncontenido del obj: "+mostrar.getCosaEscrita()+
                        "\nclave del padre: "+mostrar.getPadre().getClave()+"\ncontenido del padre: "+mostrar.getPadre().getCosaEscrita()+
                        "\nclave del hijo derecho: "+mostrar.getDerecha().getClave()+"\ncontenido del hijo derecho: "+mostrar.getDerecha().getCosaEscrita()+
                        "\nclave del hijo Izquierdo: "+mostrar.getIzquierda().getClave()+"\ncontenido del hijo izquierdo: "+mostrar.getIzquierda().getCosaEscrita());}
                else{
                    System.out.println("no existe " +
                            "xd");
                }
                break;
            case 4:
                mostrarTreeMap();
                break;
            case 0:
                System.out.println("bay");
                break;


        }
        }while(op!=0);
    }

    private void mostrarTreeMap() {
        TreeMap<Integer,String>paImprimir=controller.getStringTreeMap();
        Set<Integer> keyVal=paImprimir.keySet();
        for (Integer i:keyVal) {
            System.out.println("clave: "+i+"|contenido: "+paImprimir.get(i));
            
        }
    }
}
