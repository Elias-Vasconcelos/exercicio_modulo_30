package main.Java.br.com.Elias.Services;

import main.Java.br.com.Elias.Dao.IProdutoDAO;
import main.Java.br.com.Elias.Domain.Produto;
import main.Java.br.com.Elias.Services.Generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
