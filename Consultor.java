/*

 */
package extends2;

public class Consultor extends Funcionario {
    double valor_hora;
    double horasTrab;
 
    Consultor(String nome, double salarioBase, double valor_hora){
    super(nome, salarioBase);
    this.valor_hora = valor_hora;
    this.horasTrab = 0;
    }
    
    void Extras(double horasTrab){
    this.horasTrab = horasTrab + this.horasTrab;
    }
    
    @Override
    double getSalario(){
    double soma = salariobase + (horasTrab*valor_hora);
    return soma;
    }
    
}
