/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vbalance.dao.interfaces;

import java.util.Collection;

/**
 *
 * @author Mr Menezes
 */
public interface IEmpresaDAO {
    Collection recuperaRegistroComParametros(String sNome);

    String recuperaRegistroPorPK(int codigo);
}
