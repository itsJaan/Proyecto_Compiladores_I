/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolAST;

/**
 *
 * @author ItsJaan
 */
import java_cup.runtime.*;
import java.util.ArrayList;

/**
 * Nodo para el árbol sintáctico.
 */
public class Nodo {
    /**Identificador. */
    private String identificador;

    /**Lista de hijos de este nodo. */
    public final ArrayList<Nodo> hijos;

    
    public Nodo (String identificador) {
        this.identificador = identificador;
        hijos = new ArrayList<>();
    }
    
    public void agregarHijo (Nodo nodo) {
        hijos.add (nodo);
    }
    
    public ArrayList <Nodo> verHijos () {
        return hijos;
    }
    public String toString () {
        return identificador;
    }
    public boolean esHoja () {
        return hijos.isEmpty();
    }
   
    public void imprimir () {
        print("", true);
    }

    public void print (String prefijo, boolean esHoja) {
        System.out.println (prefijo + (esHoja ? "|____" : "|── ") + toString ());
        for (int i = 0; i < hijos.size() - 1; i++) {
            hijos.get(i).print(prefijo + (esHoja ? "    " : "|   "), false);
        }
        if (hijos.size() > 0) {
            hijos.get(hijos.size () - 1)
                    .print(prefijo + (esHoja ?"    " : "|   "), true);
        }
    }

}
