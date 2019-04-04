/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class Pila {
    private ArrayList<Character>pila;
    private char dato;
    public Pila(){//(int max) {//el constructor pide el tamaño de la pila
        pila=new ArrayList<>();
    }
    public boolean vacia() {//Método para cuando la pila es vacia
        if(this.pila.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
    public void push(char dato) {//Metodo por si la pia esta llena
        pila.add(dato);
    }
    public char pop() {
        int i=0;
        i=this.pila.size()-1;
        dato=this.pila.get(i);
        this.pila.remove(i);
        
    return dato;
    } 
    public char getTope() {//devuelve el tope de la pila
        int n=this.pila.size()-1;
        char top=0;
        if (vacia()){ 
        }
        else{
            top= pila.get(n);
        }           
    return top;
    }
}
