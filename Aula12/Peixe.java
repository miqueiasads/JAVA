
package Aula12;

public class Peixe extends Animal{
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("NADANDO");
    }

    @Override
    public void alimentar() {
        System.out.println("COMENDO SUBSTANCIAS");
    }

    @Override
    public void emitirSom() {
        System.out.println("NOT FOUND");
    }
    public void soltandoBolha(){
        System.out.println("°.°..°°.;°°°:");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
