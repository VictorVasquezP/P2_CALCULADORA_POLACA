/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import exceptiones.IniciaConOperadorEx;
import exceptiones.OperadorPegadoEx;
import exceptiones.FaltaParentesisEx;
import exceptiones.ParentesisCierreEx;
import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class Funcion {
    private ArrayList<Character> funcion;
    private Pila pila;
    public Funcion(){
        funcion=new ArrayList<>();
    }
    public void insertarValores(Character a) throws IniciaConOperadorEx, OperadorPegadoEx{
        int pos=funcion.size()-1;
        if((funcion.isEmpty())&&((a==')')||(OperadorConsec(a)))){
            throw new IniciaConOperadorEx();
        }
        if((!funcion.isEmpty())&&(OperadorConsec(funcion.get(pos)))&&(OperadorConsec(a))){
            throw new OperadorPegadoEx();
        }
        funcion.add(a);
    }
    public ArrayList<Character> getFuncion() {
        return funcion;
    }

    public void setFuncion(ArrayList<Character> funcion) {
        this.funcion = funcion;
    }
    public String dato(){
        StringBuilder buld = new StringBuilder(this.funcion.size());
        for(Character a: this.funcion){
            buld.append(a);
        }
        return buld.toString();
    }
    public void eliminar(){
        int a=this.funcion.size()-1;
        if(a>=0){
            this.funcion.remove(a);
        }
    }
    public void borrar(){
        this.funcion.clear();
    }
    public String convertirApostfija(){//se crea el metodo convertirApostfija
    String postfija="";
    pila = new Pila();
    for (int i=0; i<this.funcion.size(); i++){// se recorre la operacion infija para hacer la conversion. se detendra cuando haya recorrido cada 
        char letra= this.funcion.get(i);         // elemento de la operacion infija 
        if (esOperador(letra)){//si es un operador se evalua si es ( ) y la jerarquia de operadores
            if (letra== ')'){ //si es ) tenemos que sacar todo lo que esta dentro de la pila hasta encontrar el (
                while(pila.getTope()!= '('){
                    postfija += pila.pop();
                }
                if(pila.getTope()== '('){
                    pila.pop();
                }
            }else{
                if (pila.vacia()){ //si la pila esta vacia insertar cualquier operador 
                    if (letra!= ')'){ //si el operador es diferente del ) insertar el operador
                    pila.push(letra);
                    }
                }else{ //si la pila contiene un operador
                    if (letra!= ')'){ //mientras sea diferente ) checaremos la jerarquia
                        int prioOper= prioridadExp(letra); //sacamos que prioridad tiene el operador
                        int prioOperTope= prioridadPila((char)pila.getTope());//veamos la prioridad del valor del tope de la pila
                        if (prioOper > prioOperTope){//si el operador a ingresar es de mayor prioridad
                            //metemos el operador normalmente porque es mayor que el que ya esta
                            pila.push(letra);
                        }else {//si es de menor jerarquia
                            postfija += pila.pop();//sacamos el valor de la pila y lo metemos al String
                            pila.push(letra);//insertamos el nuevo operador
                        }
                    }
                } 
            }
    }else{ //si es una variable(numero) o letra solo se mete al String
        postfija += letra;
        } 
    }//termina for
    while (!pila.vacia()){//mientras la pila contenga algo vamos ir sacando los valores y meterlos al String
    postfija += pila.pop();
    }
    return postfija;
    } 
    public int prioridadExp(char x){ //se le aasigna la prioridad a cada operador de la expresion
    if (x == '^') return 4;
    if (x == '*' || x == '/') return 2;
    if (x == '+' || x == '-') return 1;
    if (x == '(') return 5; //mayor prioridad para que los meta a lo cuche
    if (x== ')') return 5;
    return 0;
    } 
    public int prioridadPila(char x){ //se le asigna prioridad a cada operador de la pila 
    if (x == '^') return 3;
    if (x == '*' || x == '/') return 2;
    if (x == '+' || x == '-') return 1;
    if (x == '(') return 0;//menor prioridad para que meta cualquier operador despues de (
    if (x== ')') return 0;
    return 0;
    } 
    public boolean esOperador(char letra){
    if (letra == '*' || letra == '/' || letra == '+' || letra == '-' || letra == '^' || letra == '(' || letra == ')'){
        return true;         //se compara letra con cada uno de los operadores 
    }else{
        return false;
    }
    }
    public int buscarParentesisCierre(){
        int encontrado=0;
        int encontradoCierre=0;
        for(Character x : funcion){
            if(x=='('){
                encontrado++;
            }
        }
        for(Character x : funcion){
            if(x==')'){
                encontradoCierre++;
            }
        }
        int busqueda=encontrado+encontradoCierre;
        //return encontrado==encontradoCierre;
        return busqueda;
    }
    public boolean OperadorConsec(Character letra){
    if (letra == '*' || letra == '/' || letra == '+' || letra == '-' || letra == '^'){
        return true;         //se compara letra con cada uno de los operadores 
    }else{
        return false;
    }
    }
}
