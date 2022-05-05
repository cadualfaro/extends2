/*

 */
package extends2;

public class Funcionario {
    String nome;
    double salariobase;
    
    Funcionario(String nome, double salarioBase){
    this.nome = nome;
    salariobase = salarioBase;
    }
    
    double getSalario(){
    return salariobase;
    }
    
}
