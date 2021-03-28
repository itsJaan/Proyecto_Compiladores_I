/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolAST;
import ArbolAST.Nodo;
/**
 *
 * @author ItsJaan
 */
public class Arbol {
 
    private final Nodo raiz;

    public Arbol (Nodo raiz) {
        this.raiz = raiz;
    }

    /**
     * Muestra por pantalla el árbol.
     */
    public void imprimir () {
        raiz.imprimir();
    }
}
