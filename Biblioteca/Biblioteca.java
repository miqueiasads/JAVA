
package Biblioteca;

public class Biblioteca {
   private Livro livro[];
   int i;
    public Livro[] getLivro() {
        return livro;
    }

    public void setLivro(Livro[] livro) {
        this.livro = livro;
    }

   
   
   
   
   
   public void Status(){
       for(int i=0;i < 2;i++){
           System.out.println("///////////////////");
           System.out.println("LISTA DE LIVROS");
           System.out.println("TITULO: "+ livro[i].getTitulo());
           System.out.println("AUTOR: "+ livro[i].getAutor());
           System.out.println("ISBN: "+ livro[i].getIsbn());
           //System.out.println("QTD "+ livro[i].getDisponibilidade());
       }
//       public void Estoque(String nome){
//           for(int c=0;c<livro.length;c++){
//               if(livro[i].getAutor() == nome){
//                   livro[i].disponibilidade -= 1;
//               }
           }
       }

//   public void Estoque(String nome){
//        for(int i =0;i < livro.length;i++){
//           if (livro[i].getAutor() == nome){
//               livro[i].disponibilidade -= 1;
//           }
//       }
//    }
//       
    
       
       
   
   
 
   

