
package Revisãodomingo;

public class Funcionario {
    private String nome;
    private double salario;
    private int dataadmin;
    
    //metodo construtor
    public Funcionario(String nome,double salario,int dataadmin){
        this.nome = nome;
        this.salario = salario;
        this.dataadmin = dataadmin;
    }
    //getters e setters 
    public void setNome(String nome){
        this.nome = nome;  
    }
    public String getNome(){
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getDataadmin() {
        return dataadmin;
    }

    public void setDataadmin(int dataadmin) {
        this.dataadmin = dataadmin;
    }
    
    
    
    //metodos exibir dados
    public void exibirDados(){
        System.out.println("NOME "+ this.nome);
        System.out.println("SALARIO " + this.salario);
        System.out.println("DATA " + this.dataadmin);
        System.out.println("/////////////////////////");
    }
}
