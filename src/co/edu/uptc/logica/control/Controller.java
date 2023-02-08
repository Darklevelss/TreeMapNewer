package co.edu.uptc.logica.control;

import co.edu.uptc.logica.Modelo.Nodo;


import java.util.TreeMap;

public class Controller {
    private TreeMap<Integer,String> stringTreeMap=new TreeMap<>();
    private Nodo raiz;

    private int numRamas;

    public int getTamaño() {
        return tamaño;
    }

    private int tamaño;
    public Controller(){
        numRamas=0;
        tamaño=0;
    }

    public TreeMap<Integer, String> getStringTreeMap() {
        return stringTreeMap;
    }

    public void addNodo(int clave, String cosaEscrita){
        stringTreeMap.put(clave,cosaEscrita);
        tamaño++;
        Nodo nuevo;
        if(raiz==null){
            raiz=new Nodo(clave,cosaEscrita);
        }
        nuevo=new Nodo(clave,cosaEscrita);
        nuevo.setPadre(raiz);
        while(true){
            if (nuevo.getClave()<nuevo.getPadre().getClave()){

                if (nuevo.getPadre().getIzquierda()!=null){
                    nuevo.getPadre().setIzquierda(nuevo);

                }
                else {
                    nuevo.setPadre(nuevo.getPadre().getIzquierda());
                }
                numRamas++;
                break;
            }else {
                if(nuevo.getPadre().getDerecha()==null){
                    nuevo.getPadre().setDerecha(nuevo);
                }else{
                    nuevo.setPadre(nuevo.getPadre().getDerecha());

                }
                numRamas++;
                break;
            }
        }
    }
    public Nodo buscar(int numero){
        Nodo temp=raiz;
        if (temp==null){
                return null;
        }
        do{
            if (numero==temp.getClave()){
                return temp;
            }
            else if (numero<temp.getClave()){
                temp=temp.getIzquierda();
            } else if (numero> temp.getClave()) {
                temp=temp.getDerecha();
            }
        }while(temp!=null);
        return null;
    }

    public int getNumRamas() {
        return numRamas;
    }

    public Nodo getRaiz() {
        return raiz;
    }

}
