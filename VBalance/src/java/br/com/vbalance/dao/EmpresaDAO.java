/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vbalance.dao;

import br.com.vbalance.dao.interfaces.IEmpresaDAO;
import br.com.vbalance.dto.EmpresaDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Mr Menezes
 */
public class EmpresaDAO extends DAO implements IEmpresaDAO   {

   

    public EmpresaDAO() {
    }

 
    @Override
    public Collection recuperaRegistroComParametros(String sNome) {
        String sql = "select EmpresaId,Nome,CargaHoraria from empresas WHERE Nome like ?";
        List retorno = new ArrayList();
        startConnection();
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, "%" + sNome + "%");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                retorno.add(new EmpresaDTO(rs.getInt("EmpresaId"),
                        rs.getString("Nome"),
                        rs.getInt("CargaHoraria")));
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            System.err.println("\nError Menssage: " + e.getMessage());
        }
        destroyConnection();
        return retorno;
    }


    @Override
    public String recuperaRegistroPorPK(int codigo) {
        String sql = "SELECT Nome FROM empresas WHERE EmpresaId = ?";
        String nome = "";
        startConnection();
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, codigo);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                nome = rs.getString("Nome");
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            System.err.println("\nError Menssage: " + e.getMessage());
        }
        destroyConnection();
        return nome;
    }

   

    
}
