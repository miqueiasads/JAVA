
package Revisãodomingo;


public class principal {
    public static void main(String[] args){
       //criando um funcionario
       Funcionario Wall = new Funcionario("Wallennon",7.000,24042022);
       // criar departamento
       Departamento desenvolvimento = new Departamento("Desenvolvimento",Wall);
       //criando a empresa
       Empresa PupilosJava = new Empresa("PupilosJava",142536987,desenvolvimento);
       PupilosJava.dadosEmpresa();
    }
}
