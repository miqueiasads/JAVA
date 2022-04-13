
package MicroSistemaBancario;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){  
        Scanner entrada = new Scanner(System.in);
        Cliente W = new Cliente("Walleno Germano",1457869633,35);
        System.out.println("Olá, bem vindo ao MyBank Soluções Digitais");
        System.out.println("//////////////////////////////////////////");
        System.out.println("NOME:");
        String nome = entrada.nextLine();
        System.out.println("CPF:");
        long cpf = entrada.nextLong();
        System.out.println("IDADE:");
        int idade = entrada.nextInt();
        Cliente n = new Cliente(nome,cpf,idade);
        System.out.println("//////////////////////////////////////////");
        System.out.println("Conta criada com Sucesso");
        System.out.println("O que deseja fazer?");
        System.out.println("01 - DEPOSITAR" );
        System.out.println("02 - SACAR     ");
        System.out.println("03 - TRANSFERIR");
        System.out.println("04 - STATUS");
        System.out.println("SELECIONE UMA OPÇÃO:");
        int teste = entrada.nextInt();
        
            switch(teste){
                case 01 -> {
                    System.out.println("Digite o valor");
                    double ent = entrada.nextDouble();
                    n.depositar(ent);
                    n.Status();
                    break;
                }
                case 02 -> {
                    System.out.println("Digite o valor");
                    float ent = entrada.nextFloat();
                    n.sacar(ent);
                    System.out.println("Saque realizado");
                    n.Status();
                    break;
                }
                case 03 -> {
                    System.out.println("DIGITE A CONTA QUE DESEJA TRASNFERIR");
                    Cliente cc;
                    cc = W;
                    n.Transferir(cc, teste);

                }

                case 04 -> {
                    n.Status();
                    break;
                }
                
                }
        
        
                
                
        }
        }
        
               
          
        
        
        
    

