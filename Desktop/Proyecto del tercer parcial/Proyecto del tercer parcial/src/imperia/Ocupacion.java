/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package imperia;

/**
 *
 * @author Administrador
 */
public class Ocupacion{
    private int cantobreros=0;
    private int tasa;
    private boolean estado=false;

    public Ocupacion(){
        
    }
    protected int getTasa(){
        return tasa;
    }
    protected void setTasa(int ts){
        tasa=ts;
    }
    protected void asignarObreros(int can){
        cantobreros = cantobreros+can;
    }
    protected void retirarObreros(int can){
        if(can<=cantobreros)
        cantobreros = cantobreros-can;
    }
    protected void activar(){
        estado=true;
    }
    protected boolean getEstado(){
        return estado;
    }
    protected int getCatObre(){
        return cantobreros;
    }

}
