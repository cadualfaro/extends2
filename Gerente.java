/*

 */
package extends2;

public class Gerente extends Funcionario {
    double bonificacao;
 
    Gerente(String nome, double salarioBase, double bonificacao){
        super(nome, salarioBase);
        this.bonificacao = bonificacao;
    
    }
    
    @Override
    double getSalario(){
    double soma = salariobase + bonificacao;
        return soma;
    }
    
    
}
