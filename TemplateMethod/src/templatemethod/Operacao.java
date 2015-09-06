/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;
//Model View Controller
//Data Access Model
//Comportamental-TemplateMethod
//Criacional-Singletow
//Estrutural
/**
 *
 * @author Mr Menezes
 */
public abstract class Operacao {
    abstract public int handleOperacao(int valor1, int valor2);
    
    public void efetuaOperacao(int valor1, int valor2){
        int resultado = handleOperacao(valor1,valor2);        
        System.out.println("O resultado da " + this.getClass().toString().replace("class templatemethod.", "") + " é: " + resultado);
    }
    
}
