
package Questao05;

public class funcionario {
    private String nome;
    private double salario;
    private int dtadmissao;
    
    //metodo construtor
    public funcionario(String nome,double salario,int dtadmissao){
        this.nome = nome;
        this.salario = salario;
        this.dtadmissao = dtadmissao;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }
    public void setDtadmissao(int dtadmissao){
        this.dtadmissao = dtadmissao;
    }
    public int getDtadmissao(){
        return dtadmissao;
    }
}
