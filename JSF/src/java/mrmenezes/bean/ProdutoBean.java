/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrmenezes.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import mrmenezes.dto.Produto;

/**
 *
 * @author Mr Menezes
 */
@ManagedBean(name = "produtoBean")
@ViewScoped
public class ProdutoBean implements Serializable{
    private List<Produto> produtos = new ArrayList<Produto>();
    private Produto tempProd = new  Produto();
    
    public ProdutoBean(){
        
    }
    
    public void salvarProduto(){  
        if(!produtos.contains(tempProd)) {
           
            produtos.add(tempProd);
        }
        
        tempProd = new  Produto();
        
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
    

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    public void addProduto(Produto produto){
        System.out.println(produto.getCodigo());
        
        produtos.add(produto);
    }
    public void remProduto(Produto produto){
        produtos.remove(produto);
    }
    public void editProduto(Produto produto){
        tempProd = produto;
    }

    public Produto getTempProd() {
        return tempProd;
    }

    public void setTempProd(Produto tempProd) {
        this.tempProd = tempProd;
    }
    
}
