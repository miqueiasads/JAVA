
package InterfaceEncapsulamento;

public class Controleremoto implements Controlador {
    //definir os atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public void Controleremoto(){
        this.volume = 10;
        this.ligado = false;
        this.tocando = false;
}

    //metodos especias

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    //metodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("LIGADO:" + this.getLigado());
        System.out.println("TOCANDO:" + this.getTocando());
        System.out.print("VOLUME" + this.getVolume());
        for(int i = 0; i <= this.getVolume();i+= 10){
            System.out.println("|" + this.getVolume());
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu....");
    }

    @Override
    public void maisVolume() {
        //if (this.getVolume() == true){
            
        //}
    }

    @Override
    public void menosVolume() {
    }

    @Override
    public void ligarMudo() {
    }

    @Override
    public void desligarMudo() {
    }

    @Override
    public void play() {
    }

    @Override
    public void pause() {
    }
    
        
}
