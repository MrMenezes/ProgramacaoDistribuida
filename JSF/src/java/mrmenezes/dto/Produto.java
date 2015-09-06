/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrmenezes.dto;

/**
 *
 * @author Mr Menezes
 */
public class Produto {
  private Integer Codigo;
  private String Descricao;

    public Integer getCodigo() {
        return Codigo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setCodigo(Integer Codigo) {
        this.Codigo = Codigo;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
  
  
}
