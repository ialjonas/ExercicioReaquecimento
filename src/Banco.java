import java.util.LinkedList;

public class Banco {

	private LinkedList<Cliente> clientes;
	private LinkedList<Caixa> caixas;

	public Banco() {
		this.clientes = new LinkedList<Cliente>();
		this.caixas = new LinkedList<Caixa>();
	}

	public boolean addCliente(Cliente cliente) {
		return this.clientes.add(cliente);
	}

	public boolean addCaixa(Caixa caixa) {
		return this.caixas.add(caixa);
	}

	public LinkedList<Cliente> getClientes() {
		return this.clientes;
	}

	public LinkedList<Caixa> getCaixas() {
		return this.caixas;
	}
}