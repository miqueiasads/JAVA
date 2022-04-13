
package HorizonChaseComposição;


public class Piloto {
    private String nome;
    private String nacionalidade;
    private String equipe;
    private int vitorias;
    private int derrotas;
    private Carro carro;

    
    
    public Piloto(String nome,String nacionalidade,String equipe){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.equipe = equipe;
        System.out.println("Uhuu! vamos lá!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    
    public void aumentarVe(){
        carro.acelerar();
    }
    public void reduzirVe(){
        carro.frear();
    }
    public void resultado(){
        System.out.println("////////HORIZON CHASE///////");
        System.out.println("NOME: " + this.nome);
        System.out.println("NACIONALIDADE: " + this.nacionalidade);
        System.out.println("EQUIPE " + this.equipe);
        System.out.println("VITORIAS: " + this.vitorias);
    }
    public void ganharCorr(){
        this.vitorias += 1;
        System.out.println("Uhuuu!!! Você acaba de ganhar mais uma corrida");
        System.out.println("Parabéns " + this.nome);
        resultado();
    }
    
            
    
}
