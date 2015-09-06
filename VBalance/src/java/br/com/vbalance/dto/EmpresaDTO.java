/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vbalance.dto;

/**
 *
 * @author Mr Menezes
 */
public class EmpresaDTO {
    private int EmpresaId;
    private String Nome;
    private int CargaHoraria; 

    public EmpresaDTO(int EmpresaId, String Nome, int CargaHoraria) {
        this.EmpresaId = EmpresaId;
        this.Nome = Nome;
        this.CargaHoraria = CargaHoraria;
    }

    public int getEmpresaId() {
        return EmpresaId;
    }

    public void setEmpresaId(int EmpresaId) {
        this.EmpresaId = EmpresaId;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(int CargaHoraria) {
        this.CargaHoraria = CargaHoraria;
    }

    
    
    
    
}
