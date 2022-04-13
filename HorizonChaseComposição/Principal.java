
package HorizonChaseComposição;
import java.util.Scanner;
//import java.io.EOFException;
public class Principal {
    public static void main(String [] args){
        Scanner teste = new Scanner(System.in);
        Carro v1 = new Carro("Tesla","Preto");
        Carro v2 = new Carro("Camaro", "Vermelho");
        
        Piloto c1 = new Piloto("Miqueias","Brasil","Ferrari");
        Piloto c2 = new Piloto("Sauron","Canada","Os cavaleiros sombrios");
        c1.setCarro(v1);
        c2.setCarro(v2);
        
        int distancia = 100;
        while(v1.getVelocidade() < distancia && v2.getVelocidade() < distancia){
            System.out.println("Play 01 deseja 01 acelerar ou 02 reduzir");
            int entrada = teste.nextInt();
            if (entrada == 01){
                c1.aumentarVe();
            }else{
                c1.reduzirVe();
             
            }
            //System.getProperty("os.name").contains("Windows");
            System.out.println("Play 02 deseja 01 acelerar ou 02 reduzir");
            entrada = teste.nextInt();
            if (entrada == 01){
                c2.aumentarVe();
            }else{
                c2.reduzirVe();
            }
     
        }
        if(v1.getVelocidade() > v2.getVelocidade()){
            c1.ganharCorr();
        }else{
            c2.ganharCorr();
        }
        
    }
}
