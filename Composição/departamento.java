
package Questao05;

public class departamento {
    private String nome;
    private funcionario funcionario;
    
    //metodo construtor
    public departamento(String nome,funcionario funcio){
        this.nome = nome;
        this.funcionario = funcio;
       
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setFuncionario(funcionario func){
        this.funcionario = func;
    }
    public funcionario getFuncionario(){
        return funcionario;
    }
    public void statusdep(){
        System.out.println("////////////////////////////////");
        System.out.println("DEPARTAMENTO " + this.getNome());
        System.out.println("FUNCIONARIOS " + this.funcionario.getNome());
        System.out.println("SALARIO ANTERIOR " + this.funcionario.getSalario());
        this.funcionario.setSalario(funcionario.getSalario() + funcionario.getSalario() * 0.10);
        System.out.println("SALARIO ATUAL " + this.funcionario.getSalario());
    }
}
