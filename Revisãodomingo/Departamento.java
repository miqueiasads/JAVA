
package Revisãodomingo;

public class Departamento {
    private String nomedepartamento;
    private Funcionario funcionario; //composição no atributos
    
    public Departamento(String nomedepartamento,Funcionario funcionario){
        this.nomedepartamento = nomedepartamento;
        this.funcionario = funcionario;
    }


    public String getNomedepartamento() {
        return nomedepartamento;
    }

    public void setNomedepartamento(String nomedepartamento) {
        this.nomedepartamento = nomedepartamento;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
   
}
