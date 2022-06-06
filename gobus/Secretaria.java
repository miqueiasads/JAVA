
package gobus;
import java.util.ArrayList;

public class Secretaria {
    private String nome;
    private String endereço;
    private String email;
    private int telefone;
    private long cnpj;
    ArrayList <Aluno> cadastro = new ArrayList();
    ArrayList <Onibus> cadastrobus = new ArrayList();
    ArrayList <Motorista> cadastromotor = new ArrayList();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
    
    public void cadastroalun(Aluno aluno){
        if(cadastro.contains(aluno) == true){
            System.out.println("Opps! Usuario já cadastrado");
        }else{
            cadastro.add(aluno);
            System.out.println("Cadastro realizado!");
        }
    }
    
    public void cadastrobus(Onibus onibus){
        if(cadastrobus.contains(onibus) == true){
            System.out.println("Opps! Onibus já cadastrado");
        }else{
            cadastrobus.add(onibus);
            System.out.println("Cadastro realizado!");
        }
        
    }
    public void cadastromotor(Motorista Motor){
        if(cadastromotor.contains(Motor) == true){
            System.out.println("Opps! Usuario já cadastrado");
        }else{
            cadastromotor.add(Motor);
            System.out.println("Cadastro realizado!");
        }
        
    }
    
    public void visaogeral(int opção){ // 01 para Alunos, 02 para motorista, 03 para onibus
        switch(opção){
            case 1:
                for(int i=0;i <= cadastro.size();i++){
            System.out.println("-------------------LISTA ALUNOS----------------------");
            System.out.println(i + "ALUNO " + cadastro.get(i).getNome() + "Matricula" + cadastro.get(i).getMatricula()+ "Telefone" + cadastro.get(i).getTelefone());
            
         }
            break;
            
            case 2:
                 for(int i=0;i <= cadastromotor.size();i++){
            System.out.println("-------------------LISTA MOTORISTA----------------------");
            System.out.println(i + "ALUNO " + cadastromotor.get(i).getNome() + "CNH" + cadastromotor.get(i).getCNH()+ "Telefone" + cadastromotor.get(i).getTelefone());
            
        }
            break;
            
            case 3:
                 for(int i=0;i <= cadastrobus.size();i++){
            System.out.println("-------------------LISTA ONIBUS----------------------");
            System.out.println(i + "PLACA " + cadastrobus.get(i).getPlaca());
            
        }
            
        
    }
        
    }
    
}
