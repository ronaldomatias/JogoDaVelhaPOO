package classes;

public class Jogada {
	private String nomeJogador;
	private OpcoesDoJogo opcaoDeJogo;
	private Integer idJogador;

public Jogada(Jogador jogador) {
		this.opcaoDeJogo = jogador.getOpcoesDoJogo();
		this.nomeJogador = jogador.getNomeDoJogador();
		this.idJogador = jogador.getId();
	}



	public void setNomeJogador(Jogador jogador) {
		this.nomeJogador = jogador.getNomeDoJogador();
	}
	public String getNomeJogador() {
		return nomeJogador;
	}
	
	public void setOpcaoDeJogo(OpcoesDoJogo opcaoDeJogo) {
		this.opcaoDeJogo = opcaoDeJogo;
	}
	public OpcoesDoJogo getOpcaoDeJogo() {
		return opcaoDeJogo;
	}

	public Integer getIdJogador() {
		return idJogador;
	}

	public void setIdJogador(Integer idJogador) {
		this.idJogador = idJogador;
	}


}