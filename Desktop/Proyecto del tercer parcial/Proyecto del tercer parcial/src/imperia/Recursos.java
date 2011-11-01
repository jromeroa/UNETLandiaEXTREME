/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package imperia;

/**
 *
 * @author Administrador
 */
public class Recursos {
    private int cantidad=0;
    public Recursos(){

    }
    protected void aumentar(int can){

        cantidad=cantidad+can;
        
    }
    protected void disminuir(int can){
        if(can<=cantidad)
            cantidad=cantidad-can;
        
    }
    protected int getCantidad(){
        return cantidad;
    }

}
