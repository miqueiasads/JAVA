
package Biblioteca;


public class Livro {
    private String autor;
    private String titulo;
    private int isbn;
    private double valor;
    public int disponibilidade;

    public int getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(int disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    
    public Livro(String autor,String titulo,int isbn,double valor){
        this.autor = autor;
        this.titulo = titulo;
        this.isbn = isbn;
        this.valor = valor;
        System.out.println("LIVRO" + this.titulo + "CADASTRADO COM SUCESSO!");
    }
    public Livro(){
        
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}


