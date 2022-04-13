
package Questao05;

public class principal05 {
    public static void main(String [] args){
        //criando o funcionario
        funcionario f1 = new funcionario("Miqueias",2.500,080420);
        //criando o departamento
        departamento rh = new departamento("Recursos humanos",f1);
        rh.statusdep();
        //criando a empresa
        empresa unifip = new empresa("UNIFIP",1425789635,rh);
    }
}
