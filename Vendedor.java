/*

 */
package extends2;

public class Vendedor extends Funcionario {
    double vendas;
    double comissao;
    
    Vendedor(String nome, double salarioBase, double comissao){
    super(nome, salarioBase);
    this.comissao = comissao;
    this.vendas = 0;
    }
    
    void addVenda(int venda){
    vendas = vendas + venda;
    
    }

    double getSalario(){
    double soma = salariobase + (vendas*comissao);
        return soma;
    }
    
}
