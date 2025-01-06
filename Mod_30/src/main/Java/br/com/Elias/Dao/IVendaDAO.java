package main.Java.br.com.Elias.Dao;


import main.Java.br.com.Elias.Dao.Generic.IGenericDAO;
import main.Java.br.com.Elias.Domain.Venda;
import main.Java.br.com.Elias.exceptions.DAOException;
import main.Java.br.com.Elias.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
