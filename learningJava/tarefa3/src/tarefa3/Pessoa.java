package tarefa3;

public class Pessoa {
	private final long cpf;
	private String nome;
	private long telefone;
	private String email;

	public Pessoa(long cpf, String nome, long telefone, String email) {
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	public long getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(int tel) {
		this.telefone = tel;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
