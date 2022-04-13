
package Questao05;

public class empresa {
    private String nome;
    private int cnpj;
    private departamento departamento;
    
    public empresa(String nome,int cnpj,departamento dep){
        this.nome = nome;
        this.cnpj = cnpj;
        this.departamento = dep;
        
    }
    //metodos getters e setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setCnpj(int cnpj){
        this.cnpj = cnpj;
    }
    public int getCnpj(){
        return cnpj;
    }
    public void setDepartamento(departamento dep){
        this.departamento = dep;
    }
    public departamento getDepartamento(){
        return departamento;
    }
    
}
