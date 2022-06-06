
package gobus;

import java.util.ArrayList;

public class Onibus {
    private Motorista motorista;
    private int numassentos;
    private String placa;
    private Secretaria secretaria; //adicionar alunos da secretaria
    ArrayList<Aluno> alunosida = new ArrayList();
    ArrayList<Aluno> alunosvolta = new ArrayList();

    public Onibus(Motorista funcionario, int numassentos, String placa) {
        this.motorista = funcionario;
        this.numassentos = numassentos;
        this.placa = placa;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public int getNumassentos() {
        return numassentos;
    }

    public String getPlaca() {
        return placa;
    }

    public ArrayList<Aluno> getAlunosida() {
        return alunosida;
    }

    public ArrayList<Aluno> getAlunosvolta() {
        return alunosvolta;
    }

    public void setAlunosvolta(ArrayList<Aluno> alunosvolta) {
        this.alunosvolta = alunosvolta;
    }
   
    
    public void adicionaralunoida(Aluno aluno){
        if(alunosida.size() <= numassentos){
            alunosida.add(aluno);
        }else{
            System.out.println("Opps! O onibus já está lotado");
        }
        
    }
    public void adicionaralunovolta(Aluno aluno){
        if(alunosvolta.size() <= numassentos){
            alunosida.add(aluno);
            System.out.println("Partiu!");
        }else{
            System.out.println("Opps! O onibus já está lotado");
        }
    }
    public void removeralu(int lista,int indice){
        switch(lista){
            case 1:
                alunosida.remove(indice);
                System.out.println("Aluno " + alunosida.get(indice).getNome() + "Removido com Sucesso da lista 01!");
            break;
            
            case 2:
                alunosvolta.remove(indice);
                System.out.println("Aluno " + alunosida.get(indice).getNome() + "Removido com Sucesso da lista 02!");
            break;
            
            case 3:
                alunosida.remove(indice);
                alunosvolta.remove(indice);
                System.out.println("Aluno " + alunosida.get(indice).getNome() + "Removido com Sucesso das listas !");
            
        
    }
    }
        
    }

