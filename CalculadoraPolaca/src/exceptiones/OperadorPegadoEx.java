/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiones;

/**
 *
 * @author Victor
 */
public class OperadorPegadoEx extends Exception {

    public OperadorPegadoEx() {
    }
    public OperadorPegadoEx(String msg) {
        super(msg);
    }
}
