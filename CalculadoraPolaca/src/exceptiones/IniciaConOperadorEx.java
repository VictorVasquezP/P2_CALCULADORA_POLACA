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
public class IniciaConOperadorEx extends Exception {
    public IniciaConOperadorEx() {
    }
    public IniciaConOperadorEx(String msg) {
        super(msg);
    }
}
