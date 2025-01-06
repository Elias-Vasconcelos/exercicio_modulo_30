package main.Java.br.com.Elias.Services;

import main.Java.br.com.Elias.Domain.Cliente;
import main.Java.br.com.Elias.Services.Generic.IGenericService;
import main.Java.br.com.Elias.exceptions.DAOException;

public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
