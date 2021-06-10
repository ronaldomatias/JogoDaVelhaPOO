package classes;

public class Jogador {

	private String nomeDoJogador;
	private OpcoesDoJogo opcoesDoJogo;
	private Integer id;
	private Integer vitorias = 0;
	private Integer derrotas = 0;
	private Integer empates = 0;

public Jogador(String nome) {
	this.nomeDoJogador = nome;
	}
	
	
	public void setVitorias(Integer vitorias) {
		this.vitorias = vitorias;
	}
	public Integer getVitorias() {
		return vitorias;
	}
	
	public void setDerrotas(Integer derrotas) {
		this.derrotas = derrotas;
	}
	public Integer getDerrotas() {
		return derrotas;
	}

	public void setEmpates(Integer empates) {
		this.empates = empates;
	}
	public Integer getEmpates() {
		return empates;
	}
	
	public void setOpcoesDoJogo(OpcoesDoJogo opcoesDoJogo) {
		this.opcoesDoJogo = opcoesDoJogo;
	}
	public OpcoesDoJogo getOpcoesDoJogo() {
		return opcoesDoJogo;
	}
	
	public void setNomeDoJogador(String nomeDoJogador) {
		this.nomeDoJogador = nomeDoJogador;
	}
	public String getNomeDoJogador() {
		return nomeDoJogador;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}



	



}
