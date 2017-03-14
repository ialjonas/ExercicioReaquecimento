import java.util.LinkedList;

public class Caixa {

	private int numero_caixa;
	private boolean livre;

	public Caixa(int numero_caixa) {
		this.numero_caixa = numero_caixa;
		this.livre = true;
	}

	public int getNumeroCaixa() {
		return numero_caixa;
	}

	public void setNumeroCaixa(int numero_caixa) {
		this.numero_caixa = numero_caixa;
	}

	public boolean Livre() {
		return true;
	}

	public void setLivre() {
		this.livre = true;
	}

	public void atenderCliente(LinkedList<Cliente> clientes) {
		int fila = clientes.size();
		this.livre = false;
		boolean idoso = false;
		if (this.numero_caixa >= 1 && this.numero_caixa <= 5) {
			for (int cli = 0; cli < fila; cli++) {
				if (clientes.get(cli).getIdade() >= 65) {
					idoso = true;
					clientes.remove(cli);
					break;
				}
			}
			if (idoso) {
				clientes.remove(0);
			} else {
				clientes.remove(0);
			}

		}
	}

	@Override
	public String toString() {
		return "Caixa [numero_caixa=" + numero_caixa + "]";
	}
}