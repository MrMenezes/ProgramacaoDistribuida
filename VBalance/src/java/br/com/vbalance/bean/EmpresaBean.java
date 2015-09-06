/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vbalance.bean;

import br.com.vbalance.dao.EmpresaDAO;
import br.com.vbalance.dto.EmpresaDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mr Menezes
 */
public class EmpresaBean {
    private List<EmpresaDTO> arrayList = new ArrayList<EmpresaDTO>();
    
    
    public List<EmpresaDTO> getArrayList() {

        EmpresaDAO emp = new EmpresaDAO();
        arrayList = (List) emp.recuperaRegistroComParametros("");
        return arrayList;
    }

    public void setArrayList(List<EmpresaDTO> arrayList) {
        this.arrayList = arrayList;
    }
    
}
