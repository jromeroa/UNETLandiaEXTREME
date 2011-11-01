/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package simulacion;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Emmanuel
 */
public class estaconst {
    
    public JFrame esta;
    JLabel fondo4= new JLabel(new ImageIcon(getClass().getResource("imagenes/estadis.jpg")));
    JLabel oro1=new JLabel("Oro ganado"),oro2=new JLabel("Oro perdido"),pob1=new JLabel("Poblacion asesinada"),pob2=new JLabel("Poblacion perdida"),mil1=new JLabel("Militares asesinados"),mil2=new JLabel("Militares perdidos"),bat1=new JLabel("Batallas Ganadas en Defensiva"),bat2=new JLabel("Batallas Ganadas en Ofensiva"),bat3=new JLabel("Batallas Perdidas en Defensiva"),bat4=new JLabel("Batallas Perdidas en Ofensiva");
    JLabel orog = new JLabel(),orop = new JLabel(),pobm = new JLabel(),pobp = new JLabel(),milm = new JLabel(),milp = new JLabel(),batgd = new JLabel(),batgo = new JLabel(),batpo = new JLabel(),batpd = new JLabel();
  public void estar(int acumorog,int acumorop,int acumpobm,int acumpobp,int acummilm,int acummilp,int acumbatgo,int acumbatgd,int acumbatpd,int acumbatpo)
  {
    esta=new JFrame();
    esta.setSize(350,650);
    esta.setLayout(null);
    
    fondo4.setBounds(0,0,350,650);

    oro1.setBounds(10,80,100,20);
    oro2.setBounds(10,100,100,20);
    pob1.setBounds(10,120,150,20);
    pob2.setBounds(10,140,150,20);
    mil1.setBounds(10,160,150,20);
    mil2.setBounds(10,180,150,20);
    bat1.setBounds(10,200,200,20);
    bat2.setBounds(10,220,200,20);
    bat3.setBounds(10,240,200,20);
    bat4.setBounds(10,260,200,20);

    orog.setBounds(280,80,100,20);
    orog.setText(String.valueOf(acumorog));
    orop.setBounds(280,100,100,20);
    orop.setText(String.valueOf(acumorop));
    pobm.setBounds(280,120,100,20);
    pobm.setText(String.valueOf(acumpobm));
    pobp.setBounds(280,140,100,20);
    pobp.setText(String.valueOf(acumpobp));
    milm.setBounds(280,160,100,20);
    milm.setText(String.valueOf(acummilm));
    milp.setBounds(280,180,100,20);
    milp.setText(String.valueOf(acummilp));
    batgd.setBounds(280,200,100,20);
    batgd.setText(String.valueOf(acumbatgd));
    batgo.setBounds(280,220,100,20);
    batgo.setText(String.valueOf(acumbatgo));
    batpd.setBounds(280,240,100,20);
    batpd.setText(String.valueOf(acumbatpd));
    batpo.setBounds(280,260,100,20);
    batpo.setText(String.valueOf(acumbatpo));

    esta.add(fondo4);

    fondo4.add(oro1);
    fondo4.add(oro2);
    fondo4.add(pob1);
    fondo4.add(pob2);
    fondo4.add(mil1);
    fondo4.add(mil2);
    fondo4.add(bat1);
    fondo4.add(bat2);
    fondo4.add(bat3);
    fondo4.add(bat4);
    fondo4.add(orog);
    fondo4.add(orop);
    fondo4.add(pobm);
    fondo4.add(pobp);
    fondo4.add(milm);
    fondo4.add(milp);
    fondo4.add(batgd);
    fondo4.add(batgo);
    fondo4.add(batpd);
    fondo4.add(batpo);

    esta.setVisible(true);
    esta.setDefaultCloseOperation(esta.HIDE_ON_CLOSE);

  }
}