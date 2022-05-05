/*

 */
package extends2;

import java.util.ArrayList;


public class Extends2 {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Bernardo", 10);
        Vendedor v1 = new Vendedor("Pamela", 1500, 300);
        Consultor c1 = new Consultor("Ivan", 400, 5);
        Gerente g1 = new Gerente("Daniele", 90000, 100000);
        
        System.out.println("Funcionario: "+ f1.getSalario());
        System.out.println("Vendedor: "+ v1.getSalario());
        System.out.println("Consultor: "+ c1.getSalario());
        System.out.println("Gerente: "+ g1.getSalario());
        
        v1.addVenda(10);
        c1.Extras(10);
        
        System.out.println("\n-_-_-_-_-_-_-_-\n");
        
        System.out.println("Funcionario: "+ f1.getSalario());
        System.out.println("Vendedor: "+ v1.getSalario());
        System.out.println("Consultor: "+ c1.getSalario());
        System.out.println("Gerente: "+ g1.getSalario());
        
        System.out.println("\n-_-_-_-_-_-_-_-\n");
        
        ArrayList<Funcionario> meus_funcionarios = new ArrayList<>();
        meus_funcionarios.add(f1);
        meus_funcionarios.add(v1);
        meus_funcionarios.add(c1);
        meus_funcionarios.add(g1);
        meus_funcionarios.add(new Gerente("Gabi", 300, 10000));
        
        Funcionario temp;
        
        for(int i=0;i<meus_funcionarios.size();i++){
            temp = meus_funcionarios.get(i);
            System.out.println("Nome: "+temp.nome+" - Salario -> "+temp.getSalario());
        }
        
    }
    
}
