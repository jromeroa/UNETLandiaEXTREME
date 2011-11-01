/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package simulacion;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import java.awt.event.*;
import imperia.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Emmanuel
 */
public class ventana  {
    
    public JFrame principal;
    public JFrame carga;
   public JLabel madera,hierro,oro,piedra,habitantes,tiempo;
    JButton boton4=new JButton();
    JButton boton1=new JButton();
    public ventana2 h=new ventana2();
    public estaconst g=new estaconst();
    public int total=0,cont_tiempo=0,carpintero=0,hiero=0,mineria=0,economia=0,infante=0,arquer=0,caballer=0;
    public Timer time;
    public JLabel [][]mat=new JLabel[8][10];
    public  int mat2[][]= new int [][]{
        {1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,7,1,6,4,1,1},
        {1,1,1,5,1,1,1,1,2,1},
        {1,1,8,1,1,1,1,1,3,1},
        {1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1}};
public String di1,di2,di3,di4,di5,di6,di7,di8,fond,lado;
public Icon d11,d22,d33,d44,d55,d66,d77,d88,fond1,lado1;
public JLabel t11,t22,t33,t44,t55,t66,t77,t88,tf,tla;
 public boolean  err=false;
    public Principal m,adv;
    JLabel fondo = new JLabel(new ImageIcon(getClass().getResource("imagenes/bannerfin.png")));
    JLabel fondo2 = new JLabel(new ImageIcon(getClass().getResource("imagenes/izq.jpg")));
    JLabel fondo3 = new JLabel(new ImageIcon(getClass().getResource("imagenes/fondo3.png")));
            

    public void ven(int carp, int hie, int min, int econo, int infant,int arq,int cab)
    {

        err=false;
        try{
            di1=getClass().getResource("imagenes/fondo.png").toString().replaceAll("%20"," ").replaceAll("file:","");
            di2=getClass().getResource("imagenes/casa.png").toString().replaceAll("%20"," ").replaceAll("file:","");
            di3=getClass().getResource("imagenes/cosas.png").toString().replaceAll("%20"," ").replaceAll("file:","");
            di4=getClass().getResource("imagenes/cosas1.png").toString().replaceAll("%20"," ").replaceAll("file:","");
            di5=getClass().getResource("imagenes/mercado.png").toString().replaceAll("%20"," ").replaceAll("file:","");
            di6=getClass().getResource("imagenes/milicia.png").toString().replaceAll("%20"," ").replaceAll("file:","");
            di7=getClass().getResource("imagenes/univesidad.png").toString().replaceAll("%20"," ").replaceAll("file:","");
            di8=getClass().getResource("imagenes/castillo.png").toString().replaceAll("%20"," ").replaceAll("file:","");

        }catch(Exception e){err=true;JOptionPane.showMessageDialog(principal,"Error en la carga de la Imagen","Imperia",JOptionPane.ERROR_MESSAGE);}
        if(err==true)
            System.exit(0);

        carpintero=carp;
        hiero=hie;
        economia=econo;
        mineria=min;
        infante=infant;
        arquer=arq;
        caballer=cab;
        total=carp+hie+min+econo+infant+arq+cab;

        m= new Principal(this,1);
        m.setTsim(200);
        System.out.println(m.getTsim());
        m.inicializar(m);

        adv= new Principal(this,2);
        adv.setTsim(200);
        System.out.println(adv.getTsim());
        adv.inicializar(adv);

          eventos();
         // simulin();
          sim();
          
         //asig();
        pinta();
        
    }
    public void eventos()
    {

        boton1.addMouseListener(new MouseAdapter()
        {
            public void mousePressed(MouseEvent evt)
            {
             g.estar(m.acumorog,m.acumorop,m.acumpobm,m.acumpobp,m.acummilm,m.acummilp,m.acumbatgo,m.acumbatgd,m.acumbatpd,m.acumbatpo);
            }
        });
    }
     public void sim()
     {
     principal=new JFrame();
        principal.setSize(660,580);
        fondo.setBounds(0,0,660,150);
        fondo2.setBounds(0,150,150,400);
        fondo3.setBounds(150,150,500,400);

        t11=new JLabel();
        tla=new JLabel();
        t22=new JLabel();
        t33=new JLabel();
        t44=new JLabel();
        t55=new JLabel();
        t66=new JLabel();
        t77=new JLabel();
        t88=new JLabel();
        d11=new ImageIcon(di1);
        d22=new ImageIcon(di2);
        d33=new ImageIcon(di3);
        d44=new ImageIcon(di4);
        d55=new ImageIcon(di5);
        d66=new ImageIcon(di6);
        d77=new ImageIcon(di7);
        d88=new ImageIcon(di8);
        t11.setIcon(d11);
        t11.setSize(50,50);
        t22.setIcon(d22);
        t22.setSize(50,50);
        t33.setIcon(d33);
        t33.setSize(50,50);
        t44.setIcon(d44);
        t44.setSize(50,50);
        t55.setIcon(d55);
        t55.setSize(50,50);
        t66.setIcon(d66);
        t66.setSize(50,50);
        t77.setIcon(d77);
        t77.setSize(50,50);
        t88.setIcon(d88);
        t88.setSize(50,50);
        principal.getContentPane().setLayout(null);
        principal.getContentPane().add(fondo3);
        fondo3.setLayout(null);
     


        boton4.setIcon(new ImageIcon(getClass().getResource("imagenes/carga.gif")));
        boton4.setBounds(35,340,31,30);
        fondo2.add(boton4);
        fondo2.setLayout(null);
       


        boton1.setIcon(new ImageIcon(getClass().getResource("imagenes/estasdis.gif")));
        boton1.setBounds(90,340,31,30);
        fondo2.add(boton1);
        fondo2.setLayout(null);

        oro=new JLabel();
        oro.setBounds(75,70,80,25);
        oro.setFont(new java.awt.Font("Old English Text MT", 1, 12));
        oro.setForeground(new java.awt.Color(255, 255, 255));
        oro.setText("0000");
        fondo2.add(oro);

        hierro=new JLabel();
        hierro.setBounds(75,105,80,25);
        hierro.setFont(new java.awt.Font("Old English Text MT", 1, 12));
        hierro.setForeground(new java.awt.Color(255, 255, 255));
        hierro.setText("0000");
        fondo2.add(hierro);

        piedra=new JLabel();
        piedra.setBounds(75,140,80,25);
        piedra.setFont(new java.awt.Font("Old English Text MT", 1, 12));
        piedra.setForeground(new java.awt.Color(255, 255, 255));
        piedra.setText("0000");
        fondo2.add(piedra);

        madera=new JLabel();
        madera.setBounds(75,173,80,25);
        madera.setFont(new java.awt.Font("Old English Text MT", 1, 12));
        madera.setForeground(new java.awt.Color(255, 255, 255));
        madera.setText("0000");
        fondo2.add(madera);

        habitantes=new JLabel();
        habitantes.setBounds(75,255,80,25);
        habitantes.setFont(new java.awt.Font("Old English Text MT", 1, 12));
        habitantes.setForeground(new java.awt.Color(255, 255, 255));
        habitantes.setText(String.valueOf(total));
        fondo2.add(habitantes);

        tiempo=new JLabel();
        tiempo.setBounds(550,95,150,35);
        tiempo.setFont(new java.awt.Font("Old English Text MT", 1, 22));
        tiempo.setForeground(new java.awt.Color(255, 255, 255));
        tiempo.setText("00:00");
        fondo.add(tiempo);


        principal.setLayout(null);
        principal.setResizable(false);
        principal.add(fondo);
        principal.add(fondo2);
        principal.setVisible(true);

           time= new Timer(1000,new ActionListener(){
            public void actionPerformed(ActionEvent t){
                cont_tiempo++;
                tiempo.setText(String.valueOf(cont_tiempo));
                if(m.getTsim()>cont_tiempo){
                 m.simulacion(m);
                 m.actuCamText();
                }
                else{
                    time.stop();
                }
                if(adv.getTsim()>adv.getTiempo())
                    adv.simulacion(adv);

            }
        });
        time.start();
        principal.setDefaultCloseOperation(principal.EXIT_ON_CLOSE);
     }


       public void pinta(){

        int x=0,y=0;
        for(int j=0;j<8;j++){
            if(y==400)
                y=0;

            for(int i=0;i<10;i++){

                if(x==500)
                    x=0;
              

                mat[j][i]=new JLabel();
                mat[j][i].setBounds(x,y,50,50);

                if(mat2[j][i]==1){
                    mat[j][i].setIcon(d11);
                   
                }
                if(mat2[j][i]==2){
                    mat[j][i].setIcon(d22);
                    
                }
                  if(mat2[j][i]==3){
                    mat[j][i].setIcon(d33);
                    
                }
                  if(mat2[j][i]==4){
                    mat[j][i].setIcon(d44);
                   
                }
                  if(mat2[j][i]==5){
                    mat[j][i].setIcon(d55);
                    
                }
           
                if(mat2[j][i]==6){
                    mat[j][i].setIcon(d66);
                    
                }
               if(mat2[j][i]==7){
                    mat[j][i].setIcon(d77);
                    
                }
               if(mat2[j][i]==8){
                   
                    mat[j][i].setIcon(d88);

                }
                x+=50;
                fondo3.add(mat[j][i]);

            }
            y+=50;

        }

        principal.setDefaultCloseOperation(principal.EXIT_ON_CLOSE);
    }
           public void repinta2(){
        int x=0,y=0;
        for(int j=0;j<8;j++){
            if(y==400)
                y=0;

            for(int i=0;i<10;i++){

                if(x==500)
                    x=0;
                mat[j][i].setBounds(x,y,50,50);

                if(mat2[j][i]==1){
                    mat[j][i].setIcon(d11);
                }
                if( mat2[j][i]==2){
                    mat[j][i].setIcon(d22);
                }
                if( mat2[j][i]==3){
                    mat[j][i].setIcon(d33);
                }
                if( mat2[j][i]==4){
                    mat[j][i].setIcon(d44);
                }
                if( mat2[j][i]==5){
                    mat[j][i].setIcon(d55);
                }
                if( mat2[j][i]==6){
                    mat[j][i].setIcon(d66);
                }
                if( mat2[j][i]==7){
                    mat[j][i].setIcon(d77);
                }
                if( mat2[j][i]==8){
                    mat[j][i].setIcon(d88);
                }
                x+=50;
                fondo3.add(mat[j][i]);
            }
            y+=50;
        }

    }
}
