/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.beam;

import main.java.DAO.Database;
import java.io.Serializable;
import java.util.ArrayList;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import main.java.Funcionario;

@Named(value = "FuncionarioBeam")
@RequestScoped

public class FuncionarioBeam implements Serializable {

//    @Inject private AddDatabase database;
    private String nome = "";
    private double salario = 0;
    private static Database database = new Database();
    private Funcionario funcionario = new Funcionario();
    private static int id = 0;
    private int id_departamento;
    private int a;
    
    public FuncionarioBeam() {
        funcionario.setId(id);
        this.id = this.id + 1;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        System.out.println("aaaaaaaaaaaaaaaaa");
        this.a = a;
    }
    
    
    
        
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        funcionario.setNome(this.nome);
        System.out.println("teste do print 0");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
        funcionario.setSalario(salario);
//      funcionario.setId_departamento(10);
//      database.setLista_funcionarios(funcionario);
        System.out.println("teste do print 1111111111111111111");
        
    }

    public int getId_departamento() {
        return this.id_departamento;
    }

    public void setId_departamento(int id_departamento) {
        System.out.println("teste do print 2222222222222222222");
        this.id_departamento = id_departamento;
        funcionario.setId_departamento(id_departamento);
        database.setLista_funcionarios(funcionario);
    }

    public ArrayList<Funcionario> getLista_funcionarios() {
        return database.getLista_funcionarios();
    }
  public String doSomething() {  
        System.out.println("teste do print 333333333333333333333");

      return null;
      
  } 
  
}