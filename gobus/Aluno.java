
package gobus;


public class Aluno {

  private int telefone, matricula;
  private String endereço, nome;
  

public Aluno(String nome, String endereço, int telefone, int matricula){
  this.nome = nome;
  this.endereço = endereço;
  this.telefone = telefone;
  this.matricula = matricula;
    
}
  
public String getNome(){
  return nome;
    
}

public void setNome(String nome){
  this.nome = nome;
  
}

public String getEndereço(){
  return endereço;
    
}

public void setEndereço(String endereço){
  this.endereço = endereço;
  
}

public int getTelefone(){
  return telefone;
  
}

public void setTelefone(int telefone){
  this.telefone = telefone;
  
}

public int getMatricula(){
  return matricula;
    
}

public void setMatricula(int matricula){
  this.matricula = matricula;
  
}

  
}
    
    
    

