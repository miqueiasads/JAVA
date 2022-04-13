
package Aula12;


public class Mamifero extends Animal{
    //metodo propio
    //implemantação para deferença
    private String corPelo;
    
    //
    //polimorfismo >> o mesmo nome, porem ações diferentes ..
    //mesmas assinaturas, porem resultados diferentes
    @Override
    public void locomover() {
        System.out.println("CORRENDO");
    }

    @Override
    public void alimentar() {
        System.out.println("MAMANDO");
    }

    @Override
    public void emitirSom() {
        System.out.println("SOM DE MAMIFERO");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
}
