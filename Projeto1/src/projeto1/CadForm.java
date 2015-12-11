/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto1;

import static java.awt.Color.blue;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Jaqueline
 */
public class CadForm extends JFrame{
    
    Form f = new Form(); 
    String seleciona; 
    public  JLabel nome;
    public JLabel sexo;
    public JLabel cpf;
    public JLabel curso;
    public JTextField tn, tcpf,tc ;
    public JRadioButton mas, fem;
    public RadioButtonHandler tipo;
    public ButtonGroup g;
    public JButton bot, bot2;
    public JPanel panel;
    
     
    
 public CadForm(){ 
    
      setTitle("Formulario SI");
      setLayout(null);
      setResizable(false);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
     
     nome = new JLabel("Nome");
     sexo = new JLabel("Sexo");
     cpf = new JLabel("CPF");
     curso = new JLabel("curso");
      
     tn= new JTextField(50);
     tc = new JTextField(20);
     tcpf = new JTextField(); 
     
     
    mas= new JRadioButton("Masculino",false);
    fem= new JRadioButton("Feminino",false);
    tipo = new RadioButtonHandler();
    
    bot = new JButton("Salvar");
    bot2 = new JButton("Cancela");
    panel= new JPanel(new GridLayout(12,12));
    panel.setBounds(20,20,500,200);
    setSize(200, 120);
    bot.setSize(3,3)
            ;
    bot2.setSize(3, 3);
    panel.add(nome);
    panel.add(tn);
    
    panel.add(cpf);
    panel.add(tcpf);
    panel.add(curso);
    panel.add(tc);
    panel.add(sexo);
    panel.add(mas);
    panel.add(fem);
    panel.add(bot);
    panel.add(bot2);
    add(panel);
    
    g = new ButtonGroup();
    g.add(mas);
    g.add(fem);
    
    mas.addItemListener(tipo);
    fem.addItemListener(tipo);
    
    bot.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
           Cadastra();
           imprime();
           
        }
 
    });
    bot2.addActionListener(new ActionListener() {
        
          @Override
          
          public void actionPerformed(ActionEvent e) {
              JOptionPane.showMessageDialog(null, "Operação cancelada");
              enc();
             // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }
      });
    setMinimumSize(new Dimension(800,420));
     setVisible(true);
 
 }
    public void Confirma(){
     
     Confirma confirma = new Confirma(f);
     
     }
     public void Cadastra(){
     this.f.setNome(tn.getText());
     this.f.setCpf(tcpf.getText());
     this.f.setSexo(seleciona);
     this.f.setCurso(tc.getText());
     
     
     }
     
  
   
    private  class RadioButtonHandler implements ItemListener {

      @Override
      public void itemStateChanged(ItemEvent e){
      if(mas.isSelected()){
      seleciona="Masculino";
      }
      if(fem.isSelected()){
      seleciona="Fem";
      }
      }
        
    }
 
    public void imprime(){
        JOptionPane.showMessageDialog(null,"\nNome:\n" +f.getNome()+ "\nSexo:\n" +f.getSexo()+ "\nCPF\n"
                + ""+f.getCpf()+"\nCurso\n"+f.getCurso());
        this.setVisible(false);
        
    }
    public void enc(){
        this.setVisible(false);
    }
    public static void main(String[] args) {
       CadForm cc = new CadForm();
    }
    
}
