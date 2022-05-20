
package Projeto02;

import java.util.InputMismatchException;


import java.util.Scanner;

class principal {
	  public static void main(String[] args) {
	  
	  double valVenda = 0;
	  Sistema s1 = new Sistema();
	  Scanner input = new Scanner(System.in);
	  Scanner inputInt = new Scanner(System.in);
	  
	  
	  
	  String a1 = "";
	  double a2 = 0.0;
	  int a3 = 0;
	  
	  
	  while(true) {
		  
		  System.out.println("==========MENU==========");
		  System.out.println("1 - Cadastrar bebida");
		  System.out.println("2 - Cadastrar complemento");
		  System.out.println("3 - Vender");
		  System.out.println("4 - Exibir estoque");
                  System.out.println("5 - Saiba Mais!");
		  System.out.println("========================");
		  
                  int teste = input.nextInt();
                  System.out.println("|||||||||||||||||||||||");
		  
		  if(teste < 1 || teste > 5) {
			  System.out.println("Você Digitou uma opção inválida!,\nescolha uma opção entre 1 e 4");
		  }
		  
		  
		  else if(teste == 1) {
			  System.out.println("Digite o NOME da bebida");
			  a1 = input.next();
			  System.out.println("Digite o VALOR UNITÁRIO da bebida");
			  a2 = input.nextDouble();
			  System.out.println("Digite uma quantidade a ser ARMAZENADA NO ESTOQUE");
			  a3 = inputInt.nextInt();
			  
			  
			  
			  s1.CadastBeb(a1, a2, a3);
			  System.out.println("PRODUTO CADASTRADO COM SUCESSO!");
                          
		  }
		  
		  
		  
		  
		  else if(teste == 2) {
			  System.out.println("Digite o NOME do complemento");
			  a1 = input.next();
			  System.out.println("Digite o VALOR UNITÁRIO do complemento");
			  a2 = input.nextDouble();
			  System.out.println("Digite uma quantidade a ser ARMAZENADA NO ESTOQUE");
			  a3 = inputInt.nextInt();
			  
			  
			  
			  s1.CadastComp(a1, a2, a3);
			  
			  
		  }
		  
		  
		  
		  
		  else if(teste == 3) {
                      
                      if(s1.lBebidas.size() > 0){
                      int c = 0;
                      int teste1,teste2,qtd,testec = 0;
                      
                      
                      s1.apresentar();
                      System.out.println("//////////////////////////");
                      try{
                      System.out.println("SELECIONE A OPÇÃO DE BEBIBA PELO INDICE");
                      teste1 = input.nextInt();
                      System.out.println("//////////////////////////");
                      System.out.println("QUANTIDADE?");
                      qtd = input.nextInt();
                      s1.venderBebida(teste1,qtd);
                      
                      System.out.println("//////////////////////////");
                      System.out.println("QUANTOS COMPLEMENTOS VOCÊ DESEJA?");
                      teste2 = input.nextInt();
                      
                     
                      for(c=0;c < teste2;c++){
                          System.out.println("DIGITE O INDICE DO " + c+1 +" COMPLEMENTO");
                          testec = input.nextInt();
                          s1.venderComplemento(testec, teste2);
                      }
                    
                    
                        
                          System.out.println("=====RESUMO=====");
                          System.out.println("BEBIDA " + s1.lBebidas.get(teste1).getNome() + " QUANTIDADE " + qtd);
                          System.out.println("COMPLEMENTO " + s1.lComplemento.get(testec).getNome()+" QUANTIDADE "+teste2);
                          System.out.println("VALOR: " + (s1.lBebidas.get(teste1).getValor() * qtd + (s1.lComplemento.get(testec).getValor() * teste2)));
                          System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                          System.out.println("FORMA DE PAGAMENTO?");
                          String pg = input.nextLine();
                          System.out.println("Aguardando pagamento....");
                          System.out.println("ATENÇÃO! SE BEBER NÃO DIRIJA!");
                        
                        }catch(Exception x){
                            System.out.println("Você selecionou um produto/opção inexistente");
                    }
                  }
                      
                      else{
                          System.out.println("Só é possivel vender com bebidas cadastradas no estoque! SELECIONE A OPÇÃO 01");
                      }
			  
			  
		  }
                  else if(teste == 4){
                      
                      if(s1.lBebidas.size() > 0){
                          
                      int c = 0;
                      System.out.println("||||||||||||BEBIDAS||||||||||||||||||");
                        for(c=0;c < s1.lBebidas.size();c++){
                          System.out.println("BEBIDA "+ s1.lBebidas.get(c).getNome() + " VALOR UN: " + s1.lBebidas.get(c).getValor() + " QUANTIDADE " + s1.lBebidas.get(c).getQuantidadeun());
                      }
                      }else{
                        System.out.println("Opps! não possuimos bebidas cadastradas");      
                        } 
                      if(s1.lComplemento.size() > 0){
                          
                      int c = 0;
                      System.out.println("||||||||||||COMPLEMENTOS||||||||||||||||||");
                        for(c=0;c < s1.lComplemento.size();c++){
                          System.out.println("BEBIDA "+ s1.lComplemento.get(c).getNome() + " VALOR UN: " + s1.lComplemento.get(c).getValor() + " QUANTIDADE " + s1.lComplemento.get(c).getQuantidade());
                      }
                      }else{
                        System.out.println("Opps! não possuimos Complementos cadastrados");      
                        } 
                     
                      
                  }
                  if(teste == 5){
                      s1.Acessaweb();
                  }
                  }  
                  
                  
          }
          
          }

                         
                  
		  
		  
		  
		  
		  
	  
	  

	    
	  
	