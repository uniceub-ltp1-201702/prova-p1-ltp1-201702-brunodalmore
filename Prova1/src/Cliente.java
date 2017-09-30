import java.time.LocalDate;

public class Cliente {
	private String nome;
	private String CPF;
	private LocalDate dataNascimento;
	private String numeroTelefone;
	private String cidade;
	private String UF;
	
	
	public Cliente(String nome, String cPF, LocalDate dataNascimento, String numeroTelefone, String cidade, String uF) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.dataNascimento = dataNascimento;
		this.numeroTelefone = numeroTelefone;
		this.cidade = cidade;
		UF = uF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNumeroTelefone() {
		return numeroTelefone;
	}
	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}
	
	
	
	
}
