
package Revisãodomingo;

public class Empresa {
   private String nomeemp;
   private int cnpj;
   private Departamento departamento;

public Empresa(String nomeemp, int cnpj, Departamento departamento) {
    this.nomeemp = nomeemp;
    this.cnpj = cnpj;
    this.departamento = departamento;
   }

    public String getNomeemp() {
        return nomeemp;
    }

    public void setNomeemp(String nomeemp) {
        this.nomeemp = nomeemp;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
   
    public void dadosEmpresa(){
        System.out.println("//////////////////////");
        System.out.println("NOME " + this.getNomeemp());
        System.out.println("DEPARTAMENTO " + this.departamento.getNomedepartamento());
        System.out.println("FUNCIONARIO " + this.departamento.getFuncionario().getNome());
        System.out.println("SALARIO ANTERIOR " + this.departamento.getFuncionario().getSalario());
        this.departamento.getFuncionario().setSalario(this.departamento.getFuncionario().getSalario() + (this.departamento.getFuncionario().getSalario() *0.10));
        System.out.println("SALARIO ATUAL " + this.departamento.getFuncionario().getSalario());
    }
}
