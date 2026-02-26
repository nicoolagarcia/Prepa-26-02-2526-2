/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Nicola
 */
public class ABB {

    NodoArbol raiz;
    
    public ABB(NodoArbol raiz) {
        this.raiz = raiz;
    }

    public ABB() {
    }
    
    
    
    public void insertar(int val) {
        if (this.raiz == null) {
            this.raiz = new NodoArbol(val);
        } else {
            this.raiz.insertarHijo(val);
        }
        
    }
    
    public String PreOrder(){
        if (this.raiz!=null) {
            return this.raiz.PreOrder();
        }
        return "El arbol esta vacio";
    
    }
    
    
    public String InOrder(){
        if (this.raiz!=null) {
            return this.raiz.InOrder();
        }
        return "El arbol esta vacio";
    }
    
    public String PostOrder(){
        if (this.raiz!=null) {
            return this.raiz.PostOrder();
        }
        return "El arbol esta vacio";
    }
    
    
}


