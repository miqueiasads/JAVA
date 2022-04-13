
package Aula12;


public class Principal {
    public static void main(String[] args){
        Mamifero m = new Mamifero();
//        m.alimentar();
//        m.locomover();
//        m.emitirSom();
        System.out.println("////////////////");
        Reptil r = new Reptil();
//        r.alimentar();
//        r.locomover();
//        r.emitirSom();
        System.out.println("////////////////");
        Peixe p = new Peixe();
//        p.alimentar();
//        p.locomover();
//        p.emitirSom();
//        p.soltandoBolha();
        System.out.println("////////////////");
        Ave a = new Ave();
//        a.alimentar();
//        a.emitirSom();
//        a.locomover();
//        a.fazerNinho();
        Dog d = new Dog();
        Canguru g = new Canguru();
        Cobra c = new Cobra();
        Tartaruga t= new Tartaruga();
        Goldfish pp = new Goldfish();
        Arara bl = new Arara();
        g.locomover();
        t.locomover();
        d.emitirSom();
    }
}
