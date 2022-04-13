
package MicroSistemaBancario;
//composição

public class Conta {
    //metodos
    private Cliente cliente;
    private String tipo;
    private int numCont;
    public double saldo;
    private double limite;
    private int senha;
    
    //GETTERS E SETTES
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumCont() {
        return numCont;
    }

    public void setNumCont(int numCont) {
        this.numCont = numCont;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    public void Sacar(double valor){
        if (valor < this.saldo){
            System.out.println("Opps! não é possivel sacar esse valor");
        }
        else{
            this.saldo -= valor;
            System.out.println("SALDO ATUAL"+ this.saldo);
        }
       
    }
    public void Depositar(double valor){
        this.saldo += valor;
        System.out.println("DEPOSITANDO"+ valor);
        System.out.println("SALDO ATUAL"+ this.saldo);
        
    }
    
}
