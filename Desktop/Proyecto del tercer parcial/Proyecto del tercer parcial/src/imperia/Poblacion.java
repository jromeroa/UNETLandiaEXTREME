/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package imperia;

/**
 *
 * @author Administrador
 */
public class Poblacion {
    private int poblacion=0;

    public Poblacion(int pob){
        poblacion = pob;

    }
    protected int getPoblacion(){
        return poblacion;
    }
    protected void disminuir(double n){
        if(n<=poblacion)
            poblacion=(int)(poblacion-n);
    }
    protected void aumentar(double n){
        poblacion=(int)(poblacion+n);
    }
}
