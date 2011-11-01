/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package imperia;

/**
 *
 * @author Administrador
 */
public class Actualizacion {
    private int madera,hierro,piedra,oro;
    private boolean estado=false;
    public Actualizacion(int mad, int hierr, int piedr, int or){
        madera = mad;
        hierro = hierr;
        piedra = piedr;
        oro = or;

    }
    protected int getMadera(){
        return madera;
    }
    protected int getHierro(){
        return hierro;
    }
    protected int getPiedra(){
        return piedra;
    }
    protected int getOro(){
        return oro;
    }
    protected void activar(){
        estado=true;
    }
    protected boolean getEstado(){
        return estado;
    }

}
