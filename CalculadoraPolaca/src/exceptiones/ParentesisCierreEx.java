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
public class ParentesisCierreEx extends Exception {

    /**
     * Creates a new instance of <code>ParentesisCierreEx</code> without detail
     * message.
     */
    public ParentesisCierreEx() {
    }

    /**
     * Constructs an instance of <code>ParentesisCierreEx</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ParentesisCierreEx(String msg) {
        super(msg);
    }
}
