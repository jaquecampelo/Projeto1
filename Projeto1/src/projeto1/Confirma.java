/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto1;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Jaqueline
 */
public class Confirma extends JFrame{
    
    public Form f;
    public JButton salva;
    public JButton cancel;
    public JPanel panel;
    public JLabel texto;
    
    Confirma(Form f){
    
    setTitle("Menu de Cadastros");
    setLayout(null);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    this.f= f;
    
    salva = new JButton("Salvar");
    cancel = new JButton("Cancelar");
    texto = new JLabel("Deseja realmente guardar estas informações");
    panel = new JPanel(new GridLayout(5, 5));
    
    panel.add(texto);
    panel.add(salva);
    panel.add(cancel);
    
    add(panel);
    salva.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            imprime();
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    });
    
    cancel.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            enc();
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    });
        setVisible(true);
        setMinimumSize(new Dimension(400, 320));
    }

   
    public void imprime(){
        JOptionPane.showMessageDialog(null,"Nome:\n" +f.getNome()+ "Sexo:\n" +f.getSexo()+ "CPF"
                + ""+f.getCpf()+"Curso"+f.getCurso());
        this.setVisible(false);
        
    }
    public void enc(){
        this.setVisible(false);
    }
   
  public static void main(String[] args) {
       
    }
}
