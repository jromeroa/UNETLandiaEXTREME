/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package imperia;
import java.io.*;
import java.math.*;
import simulacion.*;
/**
 *
 * @author Administrador
 */
public class Principal{
    
    private double tsim,t;
    private Poblacion p;
    private Ocupacion carpinteria, cantera, mina, econolibre;
    private Edificios cuartel, caballeriza, arqueria, casa, almacen, mina_piedra, mercado;
    private Actualizacion mejora;
    private Personal_Batalla infanteria, caballeria, arqueros;
    private Recursos madera,piedra,oro,hierro;
    private double Lef[]= new double[18];
    public int pobtot=0,sele,jugador,acumorog=0,acumorop=0,acumpobm=0,acumpobp=0,acummilm=0,acummilp=0,acumbatgo=0,acumbatgd=0,acumbatpd=0,acumbatpo=0;
    private ventana venobj;


    public Principal(ventana windo,int mnsj){
        venobj=windo;
        pobtot=venobj.total;
        jugador=mnsj;
        p = new Poblacion(100-pobtot);
        madera = new Recursos();
        piedra = new Recursos();
        oro = new Recursos();
        hierro = new Recursos();



        carpinteria = new Ocupacion();
        carpinteria.activar();
        carpinteria.setTasa(2);

        cantera = new Ocupacion();
        cantera.activar();
        cantera.setTasa(2);

        mina = new Ocupacion();
        mina.activar();
        mina.setTasa(2);
        
        econolibre = new Ocupacion();
        econolibre.activar();
        econolibre.setTasa(2);

        carpinteria.asignarObreros(venobj.carpintero);
        cantera.asignarObreros(venobj.hiero);
        mina.asignarObreros(venobj.mineria);
        econolibre.asignarObreros(venobj.economia);



        caballeriza = new Edificios(20,20,20,20);
        caballeriza.activar();
        
        arqueria = new Edificios(25,25,25,25);
        arqueria.activar();
        
        cuartel = new Edificios(15,15,15,15);
        cuartel.activar();

        casa = new Edificios(10,5,5,5);
        casa.activar();
        
        mina_piedra = new Edificios(2,2,2,2);
        mina_piedra.activar();
        
        mercado = new Edificios(30,30,30,30);
        mercado.activar();
        
        almacen = new Edificios(10,10,10,10);
        almacen.activar();
        
        mejora = new Actualizacion(45,51,45,40);

        infanteria = new Personal_Batalla(10,10,10,10);
        infanteria.activar();
        infanteria.incrementar(venobj.infante);

        caballeria = new Personal_Batalla(10,10,10,10);
        caballeria.activar();
        caballeria.incrementar(venobj.caballer);

        arqueros = new Personal_Batalla(10,10,10,10);
        arqueros.activar();
        arqueros.incrementar(venobj.arquer);
      
    }

    public void setTsim(double v){
        tsim=v;
    }
    public double getTsim(){
        return tsim;
    }
    public double getTiempo(){
        return t;
    }
    private void setTiempo(double v){
        t=v;
    }
    private void setLEF(int pos,double val){
        Lef[pos]=val;
    }
    private double getLEF(int pos){
        return Lef[pos];
    }
    private double getSalida(){
        double ran=Math.random();
        return (-0.5*(Math.log(ran)));
    }
    private boolean encargarEdificio(int tipo){

        if(tipo==0 ){
           if(madera.getCantidad()>=casa.getMadera() && hierro.getCantidad()>=casa.getHierro() && piedra.getCantidad()>=casa.getPiedra() && oro.getCantidad()>=casa.getOro()){
                    madera.disminuir(casa.getMadera());
                    hierro.disminuir(casa.getHierro());
                    piedra.disminuir(casa.getPiedra());
                    oro.disminuir(casa.getOro());
                    return true;
            }
        }
        else if(tipo==1 ){
                        if(madera.getCantidad()>=mina_piedra.getMadera() && hierro.getCantidad()>=mina_piedra.getHierro() && piedra.getCantidad()>=mina_piedra.getPiedra() && oro.getCantidad()>=mina_piedra.getOro()){
                    madera.disminuir(mina_piedra.getMadera());
                    hierro.disminuir(mina_piedra.getHierro());
                    piedra.disminuir(mina_piedra.getPiedra());
                    oro.disminuir(mina_piedra.getOro());
                    return true;
            }
        }
        else if(tipo==2 ){
                       if(madera.getCantidad()>=almacen.getMadera() && hierro.getCantidad()>=almacen.getHierro() && piedra.getCantidad()>=almacen.getPiedra() && oro.getCantidad()>=almacen.getOro()){
                    madera.disminuir(almacen.getMadera());
                    hierro.disminuir(almacen.getHierro());
                    piedra.disminuir(almacen.getPiedra());
                    oro.disminuir(almacen.getOro());
                    return true;
            }
        }
        else if(tipo==3 ){
                        if(madera.getCantidad()>=mercado.getMadera() && hierro.getCantidad()>=mercado.getHierro() && piedra.getCantidad()>=mercado.getPiedra() && oro.getCantidad()>=mercado.getOro()){
                    madera.disminuir(mercado.getMadera());
                    hierro.disminuir(mercado.getHierro());
                    piedra.disminuir(mercado.getPiedra());
                    oro.disminuir(mercado.getOro());
                    return true;
            }
        }
        else if(tipo==4){
            if(madera.getCantidad()>=caballeriza.getMadera() && hierro.getCantidad()>=caballeriza.getHierro() && piedra.getCantidad()>=caballeriza.getPiedra() && oro.getCantidad()>=caballeriza.getOro()){
                    madera.disminuir(caballeriza.getMadera());
                    hierro.disminuir(caballeriza.getHierro());
                    piedra.disminuir(caballeriza.getPiedra());
                    oro.disminuir(caballeriza.getOro());
                    return true;
            }
        }
        else if(tipo==5 ){
            if(madera.getCantidad()>=arqueria.getMadera() && hierro.getCantidad()>=arqueria.getHierro() && piedra.getCantidad()>=arqueria.getPiedra() && oro.getCantidad()>=arqueria.getOro()){
                    madera.disminuir(arqueria.getMadera());
                    hierro.disminuir(arqueria.getHierro());
                    piedra.disminuir(arqueria.getPiedra());
                    oro.disminuir(arqueria.getOro());
                    return true;
            }
        }
        else if(tipo==6){
            if(madera.getCantidad()>=cuartel.getMadera() && hierro.getCantidad()>=cuartel.getHierro() && piedra.getCantidad()>=cuartel.getPiedra() && oro.getCantidad()>=cuartel.getOro()){
                    madera.disminuir(cuartel.getMadera());
                    hierro.disminuir(cuartel.getHierro());
                    piedra.disminuir(cuartel.getPiedra());
                    oro.disminuir(cuartel.getOro());
                    return true;
            }
        }
        return false;
    }
    private void convertirPoblacion(int can){
        int sel = (int)(-0.5*(Math.log(Math.random()))*4);
        if(carpinteria.getEstado() || cantera.getEstado() || mina.getEstado() || econolibre.getEstado())
        p.aumentar(can*4);
        if(carpinteria.getEstado() && sel == 0)
            carpinteria.retirarObreros(can);
        if(cantera.getEstado() && sel == 1)
            cantera.retirarObreros(can);
        if(mina.getEstado() && sel == 2)
            mina.retirarObreros(can);
        if(econolibre.getEstado() && sel == 3)
            econolibre.retirarObreros(can);
    }
    private void convertirInfanteria(int can){
        if(cuartel.getEstado()){
            p.disminuir(can);
            if(infanteria==null){

            }else{
                if(madera.getCantidad()>=infanteria.getMadera()*can && hierro.getCantidad()>=infanteria.getHierro()*can && piedra.getCantidad()>=infanteria.getPiedra()*can && oro.getCantidad()>=infanteria.getOro()*can){
                    madera.disminuir(infanteria.getMadera()*can);
                    hierro.disminuir(infanteria.getHierro()*can);
                    piedra.disminuir(infanteria.getPiedra()*can);
                    oro.disminuir(infanteria.getOro()*can);
                    infanteria.incrementar(can);
                }

            }
        }

    }
    private void convertirCaballeria(int can){
        if(caballeriza.getEstado()){
            p.disminuir(can);
            if(caballeria==null){

            }else{
                if(madera.getCantidad()>=caballeria.getMadera()*can && hierro.getCantidad()>=caballeria.getHierro()*can && piedra.getCantidad()>=caballeria.getPiedra()*can && oro.getCantidad()>=caballeria.getOro()*can){
                    madera.disminuir(caballeria.getMadera()*can);
                    hierro.disminuir(caballeria.getHierro()*can);
                    piedra.disminuir(caballeria.getPiedra()*can);
                    oro.disminuir(caballeria.getOro()*can);
                    caballeria.incrementar(can);
                }
            }

        }
    }
    private void convertirArqueros(int can){
        if(arqueria.getEstado()){
            p.disminuir(can);
            if(arqueros==null){

            }else{
                if(madera.getCantidad()>=arqueros.getMadera()*can && hierro.getCantidad()>=arqueros.getHierro()*can && piedra.getCantidad()>=arqueros.getPiedra()*can && oro.getCantidad()>=arqueros.getOro()*can){
                    madera.disminuir(arqueros.getMadera()*can);
                    hierro.disminuir(arqueros.getHierro()*can);
                    piedra.disminuir(arqueros.getPiedra()*can);
                    oro.disminuir(arqueros.getOro()*can);
                    arqueros.incrementar(can);
                }
            }

        }
    }
    private void convertirObreros(int can){
        int sel = (int)(-0.5*(Math.log(Math.random()))*4);
        if(carpinteria.getEstado() || cantera.getEstado() || mina.getEstado() || econolibre.getEstado())
            p.disminuir(can);
        if(carpinteria.getEstado() && sel == 0)
            carpinteria.asignarObreros(can);
        if(cantera.getEstado() && sel == 1)
            cantera.asignarObreros(can);
        if(mina.getEstado() && sel == 2)
            mina.asignarObreros(can);
        if(econolibre.getEstado() && sel == 3)
            econolibre.asignarObreros(can);
    }
    private void encargarActualizacion(int tipo){
        if(tipo==0){
            if(madera.getCantidad()>=mejora.getMadera() && hierro.getCantidad()>=mejora.getHierro() && piedra.getCantidad()>=mejora.getPiedra() && oro.getCantidad()>=mejora.getOro())
            {
                mejora.activar();
                madera.disminuir(mejora.getMadera());
                hierro.disminuir(mejora.getHierro());
                piedra.disminuir(mejora.getPiedra());
                oro.disminuir(mejora.getOro());
            }
        }
    }
    private void terminarEdificio(int tipo){
        
        while(true){
            int hor = (int)(Math.random()*10);
            int ver = (int)(Math.random()*8);
            if(venobj.mat2[ver][hor]==1){
                venobj.mat2[ver][hor]=tipo;
                System.out.println("Deberia pintar X = "+hor+" Y = "+ver+"valor mat2 "+venobj.mat2[ver][hor]);
                venobj.repinta2();
                break;
            }
        }
    }
    private double getmayLEF(Principal pr){
        double mayor=0;
        for(int i=0;i<18;i++){
            if(pr.Lef[i]>mayor && pr.Lef[i]!=1000)
                mayor=pr.Lef[i];
        }
        return mayor;
    }
    private int enfrentamiento(Principal yo, Principal otro,int tipo){
        int botin=0,ae,be;
        ae=yo.infanteria.getCantidad();
        be=otro.infanteria.getCantidad();
        int infan=ae-be;
        if(infan>=0){
            yo.infanteria.disminuir(be);
            acummilm+=be;
            acummilp+=be;
        }
        else {
            otro.infanteria.disminuir(ae);
            acummilm+=ae;
            acummilp+=ae;
        }
        ae=yo.caballeria.getCantidad();
        be=otro.caballeria.getCantidad();
        int caball=ae-be;
        if(caball>=0){
            yo.caballeria.disminuir(be);
            acummilm+=be;
            acummilp+=be;
        }
        else {
            otro.caballeria.disminuir(ae);
            acummilm+=ae;
            acummilp+=ae;
        }
        ae=yo.arqueros.getCantidad();
        be=otro.arqueros.getCantidad();
        int arque=ae-be;
        if(arque>0){
            yo.arqueros.disminuir(be);
            acummilm+=be;
            acummilp+=be;
        }
        else {
            otro.arqueros.disminuir(ae);
            acummilm+=ae;
            acummilp+=ae;
        }
        botin=infan+caball*3+arque*2;

        if(botin>0){
            System.out.println("Gané yo");

            if(tipo==1){
                otro.p.disminuir(botin*2);
                acumbatgo++;
                acumpobm+=botin*2;
            }
            else{
                acumbatgd++;
            }
            if(otro.oro.getCantidad()>=(botin*20)){
                yo.oro.aumentar(botin*20);
                otro.oro.disminuir(botin*20);
                acumorog+=botin*20;
            }else{
                yo.oro.aumentar(otro.oro.getCantidad());
                acumorog+=otro.oro.getCantidad();
                otro.oro.disminuir(otro.oro.getCantidad());
                
            }
        }
        else{
            System.out.println("Ganó el otro");
            if(tipo==2){
                acumbatpd++;
                yo.p.disminuir(botin*(-2));
                acumpobp+=botin*(-2);
            }
            else{
                acumbatpo++;
            }
            if(yo.oro.getCantidad()>=(botin*(-20))){
                otro.oro.aumentar(botin*(-20));
                yo.oro.disminuir(botin*(-20));
                acumorop+=botin*(-20);
            }else{
                otro.oro.aumentar(yo.oro.getCantidad());
                acumorop+=yo.oro.getCantidad();
                yo.oro.disminuir(yo.oro.getCantidad());
                
            }
        }
        return botin;
    }

    public void simulacion(Principal o){
            pobtot=p.getPoblacion()+carpinteria.getCatObre()+cantera.getCatObre()+mina.getCatObre()+econolibre.getCatObre()+infanteria.getCantidad()+arqueros.getCantidad()+caballeria.getCantidad();
            int c;
            double a,x,mayor;
         
            c = o.buscarLEF(o);
         
            a = o.getLEF(c);
     
            mayor=o.getmayLEF(o);
        
            x = mayor+o.getLlegada();

            
            o.setTiempo(a);
           
                    p.aumentar(p.getPoblacion()*0.001);
                    p.disminuir(p.getPoblacion()*0.0005);
                    madera.aumentar(carpinteria.getCatObre());
                    piedra.aumentar(cantera.getCatObre());
                    hierro.aumentar(mina.getCatObre());
                    oro.aumentar(econolibre.getCatObre());

            if(c>=0 && c<9){
                o.setLEF(c, x);
                if(c==0){
                    sele = (int)(Math.random()*7);
                    if(encargarEdificio(sele))
                        o.setLEF(c+9,a+o.getSalida());
                }
                if(c==1){
                    convertirPoblacion(9);
                    o.setLEF(c+9,a+o.getSalida());
                }
                if(c==2){
                    convertirInfanteria(3);
                    o.setLEF(c+9,a+o.getSalida());
                }
                if(c==3){
                    convertirCaballeria(7);
                    o.setLEF(c+9,a+o.getSalida());
                }
                if(c==4){
                    convertirArqueros(10);
                    o.setLEF(c+9,a+o.getSalida());
                }
                if(c==5){
                    convertirObreros(8);
                    o.setLEF(c+9,a+o.getSalida());
                }
                if(c==6){
                    encargarActualizacion(0);
                    o.setLEF(c+9,a+o.getSalida());
                }
                if(c==7 && jugador==1){
                    /**Ataque al otro equipo*/
                    enfrentamiento(venobj.m,venobj.adv,1);
                    o.setLEF(c+9,a+o.getSalida());
                }
                if(c==8 && jugador==1){
                    /**Nos atacan!!!*/
                    enfrentamiento(venobj.m,venobj.adv,2);
                    o.setLEF(c+9,a+o.getSalida());
                }
            }
            else{
                if(c==9){
                    terminarEdificio(sele+2);
                }
                o.setLEF(c, 1000);
            }
            

        
    }

public void actuCamText(){
            venobj.oro.setText(String.valueOf(oro.getCantidad()));
            venobj.hierro.setText(String.valueOf(hierro.getCantidad()));
            venobj.madera.setText(String.valueOf(madera.getCantidad()));
            venobj.piedra.setText(String.valueOf(piedra.getCantidad()));
            venobj.habitantes.setText(String.valueOf(p.getPoblacion())+"/"+String.valueOf(pobtot));
}
    
    
    private int buscarLEF(Principal o){
        double men=o.getLEF(0);
        int q=0;
        for(int j=1;j<18;j++){
            if(men>o.getLEF(j)){
                men=o.getLEF(j);
                q=j;
            }
        }
        return q;
    }

    public void inicializar(Principal m1){
        
        m1.setTiempo(0);
        
        for(int j=0;j<9;j++){
            double x=m1.getLlegada();
            System.out.println(x);
            m1.setLEF(j, x);
        }
        for(int j=9;j<18;j++){
            m1.setLEF(j,1000);
        }
    }
    private double getLlegada(){
        double ran=Math.random();
        return (-0.5*(Math.log(ran)));
    }




}
