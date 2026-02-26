/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Nicola
 */
public class NodoArbol {

    NodoArbol izq;
    NodoArbol der;
    int data;

    public NodoArbol(int data) {
        this.izq = null;
        this.der = null;
        this.data = data;
    }

    public void insertarIzquierda(int val) {
        if (this.izq == null) {
            this.izq = new NodoArbol(val);

        } else {
            this.izq.insertarHijo(val);
        }
    }

    public void insertarDerecho(int val) {
        if (this.der == null) {
            this.der = new NodoArbol(val);

        } else {
            this.der.insertarHijo(val);
        }
    }

    public void insertarHijo(int val) {
        if (this.data > val) {
            this.insertarIzquierda(val);
        } else {
            this.insertarDerecho(val);
        }
    }

    public String PreOrder() {
        String str = "";
        str += this.data+ ", ";
        if (this.izq != null) {
            str += this.izq.PreOrder();
        }
        if (this.der != null) {
            str += this.der.PreOrder();
        }
        return str;
    }
    
    public String InOrder() {
        String str = "";
        if (this.izq != null) {
            str += this.izq.InOrder();
        }
        str += this.data+ ", ";
        if (this.der != null) {
            str += this.der.InOrder();
        }
        return str;
    }
    
        public String PostOrder() {
        String str = "";
        if (this.izq != null) {
            str += this.izq.PostOrder();
        }
        if (this.der != null) {
            str += this.der.PostOrder();
        }
        str += this.data+ ", ";
        return str;
    }
    

}
