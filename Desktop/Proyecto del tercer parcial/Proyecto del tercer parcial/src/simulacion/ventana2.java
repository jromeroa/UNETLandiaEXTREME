/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package simulacion;

import java.awt.event.KeyEvent;
import java.awt.Robot;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Emmanuel
 */
public class ventana2 {
  public JFrame carga,carga2;
   public JLabel pobla;
  JLabel fondo3= new JLabel(new ImageIcon(getClass().getResource("imagenes/cargaf.jpg")));
  JTextField car,he,mi,eco,infan,arq,cab;
  JButton boton1;
  ventana j;
  public  int aa =0;
  public int total=0;
  public String texto;
  public void activa()
  {
  cargar();
  event2();
  }
  public void cargar()
  {
    carga=new JFrame();
    carga2=new JFrame();
    carga.setSize(400,600);
    carga.setLayout(null);
    carga.setResizable(false);

    fondo3.setBounds(0,0,400,600);
    
    car=new JTextField();
    car.setBounds(50,150,60,20);
    car.setFont(new java.awt.Font("Old English Text MT", 1, 12)); // NOI18N
    car.setText("0000");

    he=new JTextField();
    he.setBounds(280,150,60,20);
    he.setFont(new java.awt.Font("Old English Text MT", 1, 12)); // NOI18N
    he.setText("0000");

    mi=new JTextField();
    mi.setBounds(50,290,60,20);
    mi.setFont(new java.awt.Font("Old English Text MT", 1, 12)); // NOI18N
    mi.setText("0000");

    eco=new JTextField();
    eco.setBounds(280,290,60,20);
    eco.setFont(new java.awt.Font("Old English Text MT", 1, 12)); // NOI18N
    eco.setText("0000");

    infan=new JTextField();
    infan.setBounds(50,420,60,20);
    infan.setFont(new java.awt.Font("Old English Text MT", 1, 12)); // NOI18N
    infan.setText("0000");

    arq=new JTextField();
    arq.setBounds(280,420,60,20);
    arq.setFont(new java.awt.Font("Old English Text MT", 1, 12)); // NOI18N
    arq.setText("0000");

    cab=new JTextField();
    cab.setBounds(50,550,60,20);
    cab.setFont(new java.awt.Font("Old English Text MT", 1, 12)); // NOI18N
    cab.setText("0000");

     pobla=new JLabel();
        pobla.setBounds(280,520,80,25);
        pobla.setFont(new java.awt.Font("Old English Text MT", 1, 12));
        pobla.setForeground(new java.awt.Color(255, 255, 255));
        pobla.setText("0/100");
        fondo3.add(pobla);

    boton1=new JButton();
    boton1.setBounds(150,520,60,20);
    boton1.setText("Play"); 

    fondo3.add(boton1);
    fondo3.add(car);
    fondo3.add(he);
    fondo3.add(mi);
    fondo3.add(eco);
    fondo3.add(infan);
    fondo3.add(arq);
    fondo3.add(cab);
    j=new ventana();

   

    carga.add(fondo3);
    carga.setVisible(true);
  //  carga.setDefaultCloseOperation(carga.HIDE_ON_CLOSE);
    carga.setDefaultCloseOperation(carga.EXIT_ON_CLOSE);

  }
   public void event2()
  {

  car.addKeyListener(new KeyAdapter() {
	            public void keyReleased(KeyEvent e) {
	                valido();
                          Character caracter = new Character(e.getKeyChar());
                          String a=String.valueOf(caracter);
                          if(total>100)
                          {
                           String texto = "";
	                    for (int i = 0; i < (car.getText().length())-1; i++)
	                        if (isNumeric(String.valueOf(new Character(car.getText().charAt(i)))))
	                            texto += car.getText().charAt(i);
                            if((texto.equalsIgnoreCase("")))
                            {
                            texto="0";
                            }
	                    car.setText(texto);
                           total=0;
	               total =total+ Integer.parseInt(car.getText());
                       total =total+ Integer.parseInt(he.getText());
                       total =total+ Integer.parseInt(mi.getText());
                       total =total+ Integer.parseInt(eco.getText());
                       total =total+ Integer.parseInt(infan.getText());
                       total =total+ Integer.parseInt(arq.getText());
                       total =total+ Integer.parseInt(cab.getText());
                       pobla.setText(total+"/100");
                          }
	                if (!isNumeric(a))
                        {
	                    String texto = "";
	                    for (int i = 0; i < car.getText().length(); i++)
	                        if (isNumeric(String.valueOf(new Character(car.getText().charAt(i)))))
	                            texto += car.getText().charAt(i);
                            if((texto.equalsIgnoreCase("")))
                            {
                            texto="0";
                            }
	                    car.setText(texto);
	               }
                          
                    }

   });
he.addKeyListener(new KeyAdapter() {
	            public void keyReleased(KeyEvent e) {
	                valido();
                          Character caracter = new Character(e.getKeyChar());
                          String a=String.valueOf(caracter);
                            if(total>100)
                          {
                           String texto = "";
	                    for (int i = 0; i < (he.getText().length())-1; i++)
	                        if (isNumeric(String.valueOf(new Character(he.getText().charAt(i)))))
	                            texto += he.getText().charAt(i);
                           if((texto.equalsIgnoreCase("")))
                            {
                            texto="0";
                            }
	                    he.setText(texto);
                                total=0;
	               total =total+ Integer.parseInt(car.getText());
                       total =total+ Integer.parseInt(he.getText());
                       total =total+ Integer.parseInt(mi.getText());
                       total =total+ Integer.parseInt(eco.getText());
                       total =total+ Integer.parseInt(infan.getText());
                       total =total+ Integer.parseInt(arq.getText());
                       total =total+ Integer.parseInt(cab.getText());
                       pobla.setText(total+"/100");
                          }
	                if (!isNumeric(a))
                        {
	                    String texto = "";
	                    for (int i = 0; i < he.getText().length(); i++)
	                        if (isNumeric(String.valueOf(new Character(he.getText().charAt(i)))))
	                            texto += he.getText().charAt(i);
                            if((texto.equalsIgnoreCase("")))
                            {
                            texto="0";
                            }
	                    he.setText(texto);
	                }
              
	            }
   });
   mi.addKeyListener(new KeyAdapter() {
	            public void keyReleased(KeyEvent e) {
	               valido();
                          Character caracter = new Character(e.getKeyChar());
                          String a=String.valueOf(caracter);
                            if(total>100)
                          {
                           String texto = "";
	                    for (int i = 0; i < (mi.getText().length())-1; i++)
	                        if (isNumeric(String.valueOf(new Character(mi.getText().charAt(i)))))
	                            texto += mi.getText().charAt(i);
                            if((texto.equalsIgnoreCase("")))
                            {
                            texto="0";
                            }
	                    mi.setText(texto);
                               total=0;
	               total =total+ Integer.parseInt(car.getText());
                       total =total+ Integer.parseInt(he.getText());
                       total =total+ Integer.parseInt(mi.getText());
                       total =total+ Integer.parseInt(eco.getText());
                       total =total+ Integer.parseInt(infan.getText());
                       total =total+ Integer.parseInt(arq.getText());
                       total =total+ Integer.parseInt(cab.getText());
                       pobla.setText(total+"/100");
                          }
	                if (!isNumeric(a))
                        {
	                    String texto = "";
	                    for (int i = 0; i < mi.getText().length(); i++)
	                        if (isNumeric(String.valueOf(new Character(mi.getText().charAt(i)))))
	                            texto += mi.getText().charAt(i);
                            if((texto.equalsIgnoreCase("")))
                            {
                            texto="0";
                            }
	                    mi.setText(texto);
	                }
                  
	            }
   });
   eco.addKeyListener(new KeyAdapter() {
	            public void keyReleased(KeyEvent e) {
	                valido();
                        Character caracter = new Character(e.getKeyChar());
                          String a=String.valueOf(caracter);
                            if(total>100)
                          {
                           String texto = "";
	                    for (int i = 0; i < (eco.getText().length())-1; i++)
	                        if (isNumeric(String.valueOf(new Character(eco.getText().charAt(i)))))
	                            texto += eco.getText().charAt(i);
                            if((texto.equalsIgnoreCase("")))
                            {
                            texto="0";
                            }
	                    eco.setText(texto);
                                total=0;
	               total =total+ Integer.parseInt(car.getText());
                       total =total+ Integer.parseInt(he.getText());
                       total =total+ Integer.parseInt(mi.getText());
                       total =total+ Integer.parseInt(eco.getText());
                       total =total+ Integer.parseInt(infan.getText());
                       total =total+ Integer.parseInt(arq.getText());
                       total =total+ Integer.parseInt(cab.getText());
                       pobla.setText(total+"/100");
                          }
	                if (!isNumeric(a))
                        {
	                    String texto = "";
	                    for (int i = 0; i < eco.getText().length(); i++)
	                        if (isNumeric(String.valueOf(new Character(eco.getText().charAt(i)))))
	                            texto += eco.getText().charAt(i);
                            if((texto.equalsIgnoreCase("")))
                            {
                            texto="0";
                            }
	                    eco.setText(texto);
	                }
                   
	            }
   });
   infan.addKeyListener(new KeyAdapter() {
	            public void keyReleased(KeyEvent e) {
	                valido();
                          Character caracter = new Character(e.getKeyChar());
                          String a=String.valueOf(caracter);
                            if(total>100)
                          {
                           String texto = "";
	                    for (int i = 0; i < (infan.getText().length())-1; i++)
	                        if (isNumeric(String.valueOf(new Character(infan.getText().charAt(i)))))
	                            texto += infan.getText().charAt(i);
                            if((texto.equalsIgnoreCase("")))
                            {
                            texto="0";
                            }
	                    infan.setText(texto);
                                total=0;
	               total =total+ Integer.parseInt(car.getText());
                       total =total+ Integer.parseInt(he.getText());
                       total =total+ Integer.parseInt(mi.getText());
                       total =total+ Integer.parseInt(eco.getText());
                       total =total+ Integer.parseInt(infan.getText());
                       total =total+ Integer.parseInt(arq.getText());
                       total =total+ Integer.parseInt(cab.getText());
                       pobla.setText(total+"/100");
                          }
	                if (!isNumeric(a))
                        {
	                    String texto = "";
	                    for (int i = 0; i < infan.getText().length(); i++)
	                        if (isNumeric(String.valueOf(new Character(infan.getText().charAt(i)))))
	                            texto += infan.getText().charAt(i);
                            if((texto.equalsIgnoreCase("")))
                            {
                            texto="0";
                            }
	                    infan.setText(texto);
	                }
                  
	            }
   });
arq.addKeyListener(new KeyAdapter() {
	            public void keyReleased(KeyEvent e) {
                       valido();
                          Character caracter = new Character(e.getKeyChar());
                          String a=String.valueOf(caracter);
                            if(total>100)
                          {
                           String texto = "";
	                    for (int i = 0; i < (arq.getText().length())-1; i++)
	                        if (isNumeric(String.valueOf(new Character(arq.getText().charAt(i)))))
	                            texto += arq.getText().charAt(i);
                            if((texto.equalsIgnoreCase("")))
                            {
                            texto="0";
                            }
	                    arq.setText(texto);
                               total=0;
	               total =total+ Integer.parseInt(car.getText());
                       total =total+ Integer.parseInt(he.getText());
                       total =total+ Integer.parseInt(mi.getText());
                       total =total+ Integer.parseInt(eco.getText());
                       total =total+ Integer.parseInt(infan.getText());
                       total =total+ Integer.parseInt(arq.getText());
                       total =total+ Integer.parseInt(cab.getText());
                       pobla.setText(total+"/100");
                          }
	                if (!isNumeric(a))
                        {
	                    String texto = "";
	                    for (int i = 0; i < arq.getText().length(); i++)
	                        if (isNumeric(String.valueOf(new Character(arq.getText().charAt(i)))))
	                            texto += arq.getText().charAt(i);
                            if((texto.equalsIgnoreCase("")))
                            {
                            texto="0";
                            }
	                    arq.setText(texto);
	                }
                
	            }
   });
cab.addKeyListener(new KeyAdapter() {
	            public void keyReleased(KeyEvent e) {
                      valido();
                          Character caracter = new Character(e.getKeyChar());
                          String a=String.valueOf(caracter);
                            if(total>100)
                          {
                           String texto = "";
	                    for (int i = 0; i < (cab.getText().length())-1; i++)
	                        if (isNumeric(String.valueOf(new Character(cab.getText().charAt(i)))))
	                            texto += cab.getText().charAt(i);
                            if((texto.equalsIgnoreCase("")))
                            {
                            texto="0";
                            }
	                    cab.setText(texto);
                               total=0;
	               total =total+ Integer.parseInt(car.getText());
                       total =total+ Integer.parseInt(he.getText());
                       total =total+ Integer.parseInt(mi.getText());
                       total =total+ Integer.parseInt(eco.getText());
                       total =total+ Integer.parseInt(infan.getText());
                       total =total+ Integer.parseInt(arq.getText());
                       total =total+ Integer.parseInt(cab.getText());
                       pobla.setText(total+"/100");
                          }
	                if (!isNumeric(a))
                        {
	                    String texto = "";
	                    for (int i = 0; i < cab.getText().length(); i++)
	                        if (isNumeric(String.valueOf(new Character(cab.getText().charAt(i)))))
	                            texto += cab.getText().charAt(i);
                            if((texto.equalsIgnoreCase("")))
                            {
                            texto="0";
                            }
	                    cab.setText(texto);
	                }
                
	            }
   });
     boton1.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mousePressed(MouseEvent evt)
            {
              
               
                     carga.setVisible(false);
                     j.ven(Integer.parseInt(car.getText()),Integer.parseInt(he.getText()),Integer.parseInt(mi.getText()),Integer.parseInt(eco.getText()),Integer.parseInt(infan.getText()),Integer.parseInt(arq.getText()),Integer.parseInt(cab.getText()));
                     
                
            }
        });

  }

  /* public void keyPressed( KeyEvent evento )
	   {
	      Integer.parseInt(car.getText())
	   }*/

  public static boolean isNumeric(String cadena){
      try {
          Integer.parseInt(cadena);
          return true;
      } catch (NumberFormatException nfe){
          return false;	}}

  public void  valido(){
           if((ventana2.isNumeric(car.getText())==true)&& (ventana2.isNumeric(he.getText())==true)&&(ventana2.isNumeric(mi.getText())==true)&&(ventana2.isNumeric(eco.getText())==true)&&(ventana2.isNumeric(infan.getText())==true)&&(ventana2.isNumeric(arq.getText())==true)&&(ventana2.isNumeric(cab.getText())==true))
                        {

	               total=0;

	               total =total+ Integer.parseInt(car.getText());
                       total =total+ Integer.parseInt(he.getText());
                       total =total+ Integer.parseInt(mi.getText());
                       total =total+ Integer.parseInt(eco.getText());
                       total =total+ Integer.parseInt(infan.getText());
                       total =total+ Integer.parseInt(arq.getText());
                       total =total+ Integer.parseInt(cab.getText());
                       pobla.setText(total+"/100");
                        }else{
                         if((car.getText().equalsIgnoreCase("-"))|| ((he.getText().equalsIgnoreCase("-")))||((mi.getText().equalsIgnoreCase("-")))||((eco.getText().equalsIgnoreCase("-")))||((infan.getText().equalsIgnoreCase("-")))||((arq.getText().equalsIgnoreCase("-")))&&((cab.getText().equalsIgnoreCase("-"))))
                         {
                          aa=1;
                          JOptionPane.showMessageDialog(carga2,"Solo debe ingresar Numeros Positivos","Imperia",JOptionPane.ERROR_MESSAGE);
                         }
                         if(aa==0)
                         {
                          JOptionPane.showMessageDialog(carga2,"Solo debe ingresar Numeros ","Imperia",JOptionPane.ERROR_MESSAGE);
                         }
                        }
           aa=0;

  }

}

