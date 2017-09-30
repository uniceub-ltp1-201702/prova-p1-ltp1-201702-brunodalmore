import java.time.LocalDateTime;

public class Ligacao {
	private int cadigo;
	private String numeroTelefoneDestino;
	private LocalDateTime dataHoraInicio;
	private LocalDateTime dataHoraFim;
	private String cidadeDestino;
	private String UFDestino;
	private Cliente Cliente;
	
	public Ligacao(int cadigo, String numeroTelefoneDestino, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim,
			String cidadeDestino, String uFDestino, Cliente cliente) {
		super();
		this.cadigo = cadigo;
		this.numeroTelefoneDestino = numeroTelefoneDestino;
		this.dataHoraInicio = dataHoraInicio;
		this.dataHoraFim = dataHoraFim;
		this.cidadeDestino = cidadeDestino;
		UFDestino = uFDestino;
		Cliente = cliente;
	}
	public int getCadigo() {
		return cadigo;
	}
	public void setCadigo(int cadigo) {
		this.cadigo = cadigo;
	}
	public String getNumeroTelefoneDestino() {
		return numeroTelefoneDestino;
	}
	public void setNumeroTelefoneDestino(String numeroTelefoneDestino) {
		this.numeroTelefoneDestino = numeroTelefoneDestino;
	}
	public LocalDateTime getDataHoraInicio() {
		return dataHoraInicio;
	}
	public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}
	public LocalDateTime getDataHoraFim() {
		return dataHoraFim;
	}
	public void setDataHoraFim(LocalDateTime dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}
	public String getCidadeDestino() {
		return cidadeDestino;
	}
	public void setCidadeDestino(String cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}
	public String getUFDestino() {
		return UFDestino;
	}
	public void setUFDestino(String uFDestino) {
		UFDestino = uFDestino;
	}
	public Cliente getCliente() {
		return Cliente;
	}
	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}
	
	
	
}