
package Aula12;

public class Ave extends Animal{
    private String corPena;
    
    
    @Override
    public void locomover() {
        System.out.println("VOANDO");
    }

    @Override
    public void alimentar() {
        System.out.println("COMENDO FRUTAS");
    }

    @Override
    public void emitirSom() {
        System.out.println("SOM DE AVE");
    }
    
    public void fazerNinho(){
        System.out.println("COSNTRUINDO NINHO...");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
    
}
