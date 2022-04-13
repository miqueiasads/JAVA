
package MicroSistemaBancario;


public class Cliente extends Conta{
    private String nome;
    private long cpf;
    private Conta conta;
    private int idade;
    private String sexo;
   
    
    public Cliente(String nome,long cpf,int idade){
       this.nome = nome;
       this.cpf = cpf;
       this.idade = idade;
       this.sexo = sexo;
       this.conta = new Conta();
     
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
            

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = new Conta();
    }
    
    public void sacar(double valor ){
        conta.Sacar(valor);
    }
    public void depositar(double valor ){
        conta.Depositar(valor);
        System.out.println("");
    }
    
    
    public void Transferir(Cliente c1, double trs){
       conta.Sacar(trs);
       c1.Depositar(trs); 
        
    }
    public void Status(){
        System.out.println("//////////STATUS CONTA /////////////");
        System.out.println("NOME: "+ this.getNome());
        System.out.println("IDADE: "+ this.getIdade());
        System.out.println("CPF: "+ this.getCpf());
        System.out.println("SALDO: "+ conta.getSaldo());
        
    }
    }
    

