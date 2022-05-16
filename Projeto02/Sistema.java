
package Projeto02;
import java.util.ArrayList;
//import java.util.Scanner;


public class Sistema{
  
//private Bebidas bebida;
  
ArrayList <Bebidas> lBebidas = new ArrayList <Bebidas>(); 
ArrayList <Complementos> lComplemento = new ArrayList <Complementos>();


  
public void CadastBeb(String Nome,double valor,int quantidade){
    Bebidas x = new Bebidas(Nome,valor,quantidade);
    lBebidas.add(x); 
}

  
public void CadastComp(String Nome,double Valor, int Quantidade){
    Complementos c = new Complementos(Nome,Valor,Quantidade);
    lComplemento.add(c);
}

  
public void apresentar(){
    
	System.out.println("====LISTA DE BEBIDAS====");
	for(int c = 0; c < lBebidas.size(); c++) {
		System.out.println("BEBIDA " + c +"-"+ lBebidas.get(c).getNome());
	}
    
    System.out.println("==LISTA DE COMPLEMENTOS==");
    for(int c = 0; c < lComplemento.size(); c++) {
    	System.out.println("COMPLEMENTO "+ c +"-"+ lComplemento.get(c).getNome());
    }
   
}



  
public double venderBebida (int indice, int quantidade){

  if (lBebidas.get(indice).getQuantidadeun() < quantidade){
    
    System.out.println("O estoque é insuficiente!");
    System.out.println("Estoque atual: " + lBebidas.get(indice).getQuantidadeun());
    return 0;
    
  }
  
  else{
    
    int quantTemp = lBebidas.get(indice).getQuantidadeun() - quantidade;
    
    lBebidas.get(indice).setQuantidadeun(quantTemp);
   // System.out.println("Valor total: " + lBebidas.get(indice).getValor() * quantidade;);
    return lBebidas.get(indice).getValor() * quantidade;
    
  }
  
}



public double venderComplemento (int indice, int quantidade){

	  if (lComplemento.get(indice).getQuantidade() < quantidade){
	    
	    System.out.println("O estoque é insuficiente!");
	    System.out.println("Estoque atual: " + lComplemento.get(indice).getQuantidade());
	    return 0;
	    
	  }
	  
	  else{
	    
	    int quantTemp = lComplemento.get(indice).getQuantidade() - quantidade;
	    
	    lBebidas.get(indice).setQuantidadeun(quantTemp);
	    return lComplemento.get(indice).getValor() * quantidade;
	    
	  }
	  
	}



  
}

