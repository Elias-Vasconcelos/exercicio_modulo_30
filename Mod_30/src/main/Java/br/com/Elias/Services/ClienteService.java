package main.Java.br.com.Elias.Services;

import main.Java.br.com.Elias.Dao.IClienteDAO;
import main.Java.br.com.Elias.Domain.Cliente;
import main.Java.br.com.Elias.Services.Generic.GenericService;
import main.Java.br.com.Elias.exceptions.DAOException;
import main.Java.br.com.Elias.exceptions.MaisDeUmRegistroException;
import main.Java.br.com.Elias.exceptions.TableException;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	//private IClienteDAO clienteDAO;
	
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		//this.clienteDAO = clienteDAO;
	}

//	@Override
//	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
//		return clienteDAO.cadastrar(cliente);
//	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

//	@Override
//	public void excluir(Long cpf) {
//		clienteDAO.excluir(cpf);
//	}
//
//	@Override
//	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException{
//		clienteDAO.alterar(cliente);
//	}

}
