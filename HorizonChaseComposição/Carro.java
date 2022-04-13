
package HorizonChaseComposição;


public class Carro {
    private String Modelo;
    private int velocidade = 0;
    private String cor;
    
    public Carro(String modelo,String cor){
        this.Modelo = modelo;
        this.cor = cor;
        
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void acelerar(){
        this.velocidade += 10;
        System.out.println("Aumentando a velocidade " + this.velocidade);
    }
    public void frear(){
        this.velocidade -= 10;
        System.out.println("Reduzindo a velocidade.....");
    }

    
}
