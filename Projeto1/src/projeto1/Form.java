/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projeto1;

/**
 *
 * @author Jaqueline
 */
public class Form {
    public String nome;
    public String cpf;
    public String Curso;
    public String sexo;
    
    
    public Form(String n, String c, String cs, String s){
        
        this.nome = n;
        this.cpf = c;
        this.sexo = s;
        this.Curso = cs;
    }
   public Form(){
       
   }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
}
