/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto1;
import javax.swing.*;
import java.awt.*;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Q1{
    
    
    JFrame j = new JFrame();
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel b = new JPanel();
    JPanel b2 = new JPanel();
    JPanel bt = new JPanel();
    JPanel al = new JPanel();
    
    JFrame a = new JFrame();
    JLabel l = new JLabel("Login ou senha errados!");
        
    
        
    
    JLabel em = new JLabel("Email: ");
    JLabel se = new JLabel("Senha");
    JButton butt = new JButton("Login");
    JButton butt2 = new JButton("Cancelar");
    
    
    JTextField t1 = new JTextField(20);
    JPasswordField t2 = new JPasswordField(20);
    
    
    
    Q1(){
    
        j.setTitle("Login");
        j.setVisible(true);
        j.setLocation(480, 200);
        j.setSize(480, 360);
        butt.setSize(2, 2);
        butt2.setSize(2,2);
        
        p1.add(em);
        p2.add(se);
        p1.add(t1);
        p2.add(t2);
        b.add(butt);
        b2.add(butt2);
        j.setLayout(new GridLayout(4, 2));
        j.setBackground(Color.black);
        
        j.add(p1);
        j.add(p2);
        j.add(b);
        j.add(b2);
        al.add(l);
        
        a.add(al);
        
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        butt.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                confere();
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
       
        butt2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Operaçaõ cancelada pelo usuario");
                fecha();
                System.exit(0);
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
}
    public void fecha(){
        this.setVisible(false);
    }
  public void confere(){
     
   
   String User = "jaqueline.campelo@outlook.com";
   String pass = "123987";
   String senha = new String(t2.getPassword());
   if(t1.getText().contains(User)&& senha.contains(pass)){
    
    CadForm cd = new CadForm();
    
    this.setVisible(false);
   }else{
       JOptionPane.showMessageDialog(null,"Usuario ou senha incorretos");
       JOptionPane.showMessageDialog(null,"Verifique seus dados");
   }
  }

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
    
     
}
    

    
    
    

