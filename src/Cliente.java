
public class Cliente {
	private String nome;
	private int idade;

	public Cliente(String nome, int idade) {
		this.idade = idade;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Cliente [idade=" + idade + ", nome=" + nome + "]";
	}
}
