
package Projeto02;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class Acessaweb {
    
    public static void main(String[] args){
try{
    URI link = new URI("www.google.com");
    Desktop.getDesktop().browse(link);
}catch(IOException | URISyntaxException erro){
    System.out.println("Opps! Algo deu errado!");
}
    }
}
