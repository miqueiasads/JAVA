
package Projeto02;

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
		  System.out.println("========================");
		  
		  int opcao = input.nextInt();

		  
		  
		  if(opcao < 1 || opcao > 5) {
			  System.out.println("Você Digitou uma opção inválida!,\nescolha uma opção entre 1 e 4");
		  }
		  
		  
		  else if(opcao == 1) {
			  System.out.println("Digite o NOME da bebida");
			  a1 = input.next();
			  System.out.println("Digite o VALOR da bebida");
			  a2 = input.nextDouble();
			  System.out.println("Digite uma quantidade para esse produto");
			  a3 = inputInt.nextInt();
			  
			  
			  
			  s1.CadastBeb(a1, a2, a3);
			  System.out.println("PRODUTO CADASTRADO COM SUCESSO!");
                          
		  }
		  
		  
		  
		  
		  else if(opcao == 2) {
			  System.out.println("Digite o NOME do complemento");
			  a1 = input.next();
			  System.out.println("Digite o VALOR do complemento");
			  a2 = input.nextDouble();
			  System.out.println("Digite uma quantidade para esse produto");
			  a3 = inputInt.nextInt();
			  
			  
			  
			  s1.CadastComp(a1, a2, a3);
			  
			  
		  }
		  
		  
		  
		  
		  else if(opcao == 3) {
                      if(s1.lBebidas.size() > 0){
                      int c = 0;
                      int teste1,teste2,qtd,testec = 0;
                      s1.apresentar();
                      System.out.println("//////////////////////////");
                      System.out.println("SELECIONE A OPÇÃO DE BEBIBA PELO INDICE");
                      teste1 = input.nextInt();
                      System.out.println("//////////////////////////");
                      System.out.println("QUANTIDADE?");
                      qtd = input.nextInt();
                      s1.venderBebida(c,qtd);
                      System.out.println("//////////////////////////");
                      System.out.println("QUANTOS COMPLEMENTOS VOCÊ DESEJA?");
                      teste2 = input.nextInt();
                      for(c=1;c <= teste2;c++){
                          System.out.println("DIGITE O" + c +" COMPLEMENTO");
                          testec = input.nextInt();
                          s1.venderComplemento(testec, teste2);
                      }
                          System.out.println("=====RESUMO=====");
                          System.out.println("BEBIDA " + s1.lBebidas.get(teste1).getNome() + " QUANTIDADE " + qtd);
                          System.out.println("COMPLEMENTO " + s1.lComplemento.get(testec).getNome()+" QUANTIDADE "+teste2);
                          System.out.println("VALOR: " + (s1.lBebidas.get(teste1).getValor()+ s1.lComplemento.get(testec).getValor()));
                          System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                          System.out.println("FORMA DE PAGAMENTO?");
                          String pg = input.nextLine();
                          System.out.println("Aguardando pagamento....");
                    }else{
                          System.out.println("Só é possivel vender com bebidas cadastradas no estoque! SELECIONE A OPÇÃO 01");
                      }
			  
			  
		  }
                  else if(opcao == 4){
                      if(s1.lBebidas.size() > 0){
                      int c = 0;
                      System.out.println("||||||||||||BEBIDAS||||||||||||||||||");
                      for(c=0;c <= s1.lBebidas.size();c++){
                          System.out.println("BEBIDA "+ s1.lBebidas.get(c).getNome() + "VALOR UN: " + s1.lBebidas.get(c).getValor() + "QUANTIDADE " + s1.lBebidas.get(c).getQuantidadeun());
                      }
                      
                    }else{
                        System.out.println("Opps! não possuimos bebidas cadastradas");      
                              } 
                      
                      if(s1.lComplemento.size() > 0){
                      int x = 0;
                      System.out.println("||||||||||||COMPLEMENTOS||||||||||||||||||");
                      for(x=0;x <= s1.lComplemento.size();x++){
                          System.out.println("BEBIDA "+ s1.lComplemento.get(x).getNome() + "VALOR UN: " + s1.lComplemento.get(x).getValor() + "QUANTIDADE " + s1.lComplemento.get(x).getQuantidade());
                      }
                  }else{
                      System.out.println("Opps! não possuimos complementos cadastrados"); 
                      }
                  }
          }
          
          }
}
                         
                  
		  
		  
		  
		  
		  
	  
	  
	  /*
	  s1.CadastBeb("pitu", 1.0, 50);
	  s1.CadastBeb("Wiski", 3.0, 50);
	  
	  
	  s1.CadastComp("Limão", 0.50, 50);
	  s1.CadastComp("Leite Condensado", 1.0, 50);

	  s1.apresentar(); 
	  
	  valVenda += s1.venderBebida(0, 2);
	  valVenda += s1.venderComplemento(0, 2);
	  
	  System.out.println("Valor total da venda: " + valVenda);
	  
	  
	  */
	    
	  
	