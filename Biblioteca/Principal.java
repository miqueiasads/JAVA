
package Biblioteca;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = 0, y;
        Biblioteca b1 = new Biblioteca();
        System.out.println("Bem vindo a nossa biblioteca");
        System.out.println("Quantos livros deseja cadastrar?");
        y = Integer.parseInt(input.nextLine());
        Livro livros[] = new Livro[y];
        while(x < livros.length){       
            livros[x] = new Livro();
            System.out.println("INSIRA O TITULO:");
            String titulo = input.nextLine();
            livros[x].setTitulo(titulo);
            System.out.println("INSIRA O AUTOR:");
            String autor = input.nextLine();
            livros[x].setAutor(autor);
            System.out.println("INSIRA O ISBN:");
            int isbn = Integer.parseInt(input.nextLine());
            livros[x].setIsbn(isbn);
//            System.out.println("QUANTIDADE:");
//            int quantidade = Integer.parseInt(input.nextLine());
//            livros[x].setDisponibilidade(quantidade);
            x+= 1;
        }
        b1.setLivro(livros);
        b1.Status();
        
//        System.out.println(b1.getLivro());
}
}
    
    
