/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package imperia;

/**
 *
 * @author Administrador
 */
public class Edificios implements Runnable{
    private int cantidad=0,madera,hierro,piedra,oro;
    private boolean estado=false;
    private Thread t;
    public Edificios(int mad, int hierr, int piedr, int or){
        madera = mad;
        hierro = hierr;
        piedra = piedr;
        oro = or;
        t=new Thread(this);
        t.start();

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
    public void run(){
        int i=0;
        while(i<20){
            try{
                t.sleep(10);
            }catch(Exception w){
            }
        }
        cantidad=cantidad+1;
    }
}
