/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

/**
 *
 * @author Mr Menezes
 */
public class TemplateMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int valor1 =2 , valor2 = 4;
       Operacao soma = new Soma();
       Operacao sub = new Subtracao();
       Operacao mult = new Multiplicacao();
       soma.efetuaOperacao(valor1, valor2);
       sub.efetuaOperacao(valor1, valor2);
       mult.efetuaOperacao(valor1, valor2);
    }
    
}
