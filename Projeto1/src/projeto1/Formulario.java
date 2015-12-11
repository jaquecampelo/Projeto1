/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto1;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Jaqueline
 */
public class Formulario {
    
 JFrame f = new JFrame();
 JPanel p = new JPanel();
 JPanel p2 = new JPanel();
 JPanel p3 = new JPanel();
 JPanel p4 = new JPanel();
 JPanel pp = new JPanel();
 JPanel pp0 = new JPanel();
 JPanel pp1 = new JPanel();
 JPanel pp2 = new JPanel();
 JPanel pp3 = new JPanel();
 JPanel pn = new JPanel();
 JPanel cc = new JPanel();
 
 JPanel bot1 = new JPanel();
 JPanel bot2 = new JPanel();
 
 JButton bconf = new JButton("Salva");
 JButton bcancel = new JButton("Cancelar");
 
 JLabel nome = new JLabel("NOME");
 JLabel sex = new JLabel("Sexo:");
 JLabel ds = new JLabel("Disciplinas");
 JLabel cm = new JLabel("Comentarios");
 
 
 JTextField t = new JTextField(40);
 JTextArea tc = new JTextArea("Deixe seu comentario aqui");
 
 CheckboxGroup cbg = new CheckboxGroup();
 Checkbox fem = new Checkbox("fem", cbg, false);
 Checkbox mas = new Checkbox("masc", cbg, false);
 
 Checkbox poo = new Checkbox("P.O.O");
 Checkbox ed = new Checkbox("Estruturas de Dados");
 Checkbox bd = new Checkbox("Banco de Dados");
 Checkbox cr = new Checkbox("Circuitos Digitais");
 Checkbox pl = new Checkbox("Prolog");

    public JLabel getNome() {
        return nome;
    }

    public void setNome(JLabel nome) {
        this.nome = nome;
    }

    public JLabel getSex() {
        return sex;
    }

    public void setSex(JLabel sex) {
        this.sex = sex;
    }

    public JLabel getDs() {
        return ds;
    }

    public void setDs(JLabel ds) {
        this.ds = ds;
    }

    public JLabel getCm() {
        return cm;
    }

    public void setCm(JLabel cm) {
        this.cm = cm;
    }
 
 
 
 Formulario(){
      f.setSize(620, 500);
      // f.setLocation(100, 100);
       f.setTitle("Formulario");
       
       f.setResizable(true);
       f.setVisible(true);
       f.setLayout(new GridLayout(13,14));
       
       p.add(nome);
       p.add(t);
       
       p2.add(sex);
       p3.add(fem);
       cc.add(cm);
       cc.add(tc); 
       p4.add(mas);
       pn.add(ds);
       pp.add(poo);
       pp0.add(ed);
       pp1.add(bd);
       pp2.add(cr);
       pp3.add(pl);
       bot1.add(bconf);
       bot2.add(bcancel);
       f.add(p);
       f.add(p2);
       f.add(p3);
       f.add(p4);
       f.add(pn);
       f.add(pp);
       f.add(pp0);
       f.add(pp1);
       f.add(pp2);
       f.add(pp3);
       f.add(cc);
       f.add(bot1);
       f.add(bot2);
       
       
       bconf.addActionListener(new ActionListener() {

          @Override
          public void actionPerformed(ActionEvent e) {
              imprime();
              throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }
      });
       bcancel.addActionListener(new ActionListener() {

          @Override
          public void actionPerformed(ActionEvent e) {
              enc();
              throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }
      });
       
 }
  
   public class Closer  extends WindowAdapter{
     
     @Override
     public void windowClosing(WindowEvent e){
         System.exit(0);
         
     }
 }
 
   public void imprime(){
        JOptionPane.showMessageDialog(null,"Nome:\n" +getNome()+ "Sexo:\n" +getSex()+ "Disciplinas"
                + ""+getDs()+"Comentarios"+getCm());
        f.setVisible(true);
        
    }
    public void enc(){
       f.setVisible(false);
    }
  
     
    public static void main(String[] args) {
        
        Formulario f = new Formulario(); 
        
        
    }
  
}
