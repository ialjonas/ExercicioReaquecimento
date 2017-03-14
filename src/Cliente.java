
public class Cliente {
	private int idade;
	private String nome;

	public Cliente(String nome,int idade) {
		this.idade = idade;
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cliente [idade=" + idade + ", nome=" + nome + "]";
	}
}
