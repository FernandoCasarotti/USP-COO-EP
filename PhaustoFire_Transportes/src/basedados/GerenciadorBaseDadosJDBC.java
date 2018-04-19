package basedados;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import beans.Cliente;
import beans.Funcionario;
import beans.Motorista;
import beans.Pedido;
import beans.Pessoa;
import beans.Produto;
import beans.Veiculo;

public class GerenciadorBaseDadosJDBC extends ConectorJDBC implements
		GerenciadorBaseDados {

	private static final String PASSWORD = "";
	private static final String USER = "";
	private static final String HOST = "";
	private static final String DB_NAME = "";

	public GerenciadorBaseDadosJDBC() throws BaseDadosException {
		super(DB.MYSQL);
	}

	protected String getUser() {
		return USER;
	}

	@Override
	protected String getPassword() {
		return PASSWORD;
	}

	@Override
	protected String getDbHost() {
		return HOST;
	}

	@Override
	protected String getDbName() {
		return DB_NAME;
	}
}
