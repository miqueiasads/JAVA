
package Projeto02;

public class Bebidas {
    
    private String nome;
    private int quantidadeun;
    private double valor;
    private Sistema sistema;

    Bebidas(String Nome, double valor, int quantidade) {
        this.nome = Nome;
        this.valor = valor;
        this.quantidadeun = quantidade;
    }

    public void setNome(String Nome){
        this.nome = Nome;
    }

    public String getNome(){
        return nome;
    }
    
    public void setValor(double Valor){
        this.valor = Valor;
    }
    
    public double getValor(){
        return valor;
    }
    
    public void setQuantidadeun(int quantidadeun) {
        this.quantidadeun = quantidadeun;
    }
    
    public int getQuantidadeun() {
        return quantidadeun;
    }

   

}