package classes;

public class Campos {
	public OpcoesDoJogo campo11;
	public OpcoesDoJogo campo12;
	public OpcoesDoJogo campo13;
	public OpcoesDoJogo campo21;
	public OpcoesDoJogo campo22;
	public OpcoesDoJogo campo23;
	public OpcoesDoJogo campo31;
	public OpcoesDoJogo campo32;
	public OpcoesDoJogo campo33;
	
	
	public OpcoesDoJogo getCampo11() {
		return campo11;
	}
	
	public void inserirNoCampo11(Jogada jogada, Regras regras, Campos campos) {
		if (this.campo11 == null && regras.getResultado() == null){
			this.campo11 = jogada.getOpcaoDeJogo();
			regras.buscarCombinacaoVencedora(campos);
		}
	}
	
	
	
	
	

	
	
	
	
	
	public OpcoesDoJogo getCampo12() {
		return campo12;
	}
	public void inserirNoCampo12(Jogada jogada, Regras regras, Campos campos) {
		if (this.campo12 == null && regras.getResultado() == null){
			this.campo12 = jogada.getOpcaoDeJogo();
			regras.buscarCombinacaoVencedora(campos);
		}
	}
	
	public OpcoesDoJogo getCampo13() {
		return campo13;
	}
	public void inserirNoCampo13(Jogada jogada, Regras regras, Campos campos) {
		if (this.campo13 == null && regras.getResultado() == null){
			this.campo13 = jogada.getOpcaoDeJogo();
			regras.buscarCombinacaoVencedora(campos);
		}	
	}
	
	
	public OpcoesDoJogo getCampo21() {
		return campo21;
	}
	public void inserirNoCampo21(Jogada jogada, Regras regras, Campos campos) {
		if (this.campo21 == null && regras.getResultado() == null){
			this.campo21 = jogada.getOpcaoDeJogo();
			regras.buscarCombinacaoVencedora(campos);
		}	
	}
	
	public OpcoesDoJogo getCampo22() {
		return campo22;
	}
	public void inserirNoCampo22(Jogada jogada, Regras regras, Campos campos) {
		if (this.campo22 == null && regras.getResultado() == null){
			this.campo22 = jogada.getOpcaoDeJogo();
			regras.buscarCombinacaoVencedora(campos);
		}	
	}
	
	public OpcoesDoJogo getCampo23() {
		return campo23;
	}
	public void inserirNoCampo23(Jogada jogada, Regras regras, Campos campos) {
		if (this.campo23 == null && regras.getResultado() == null){
			this.campo23 = jogada.getOpcaoDeJogo();
			regras.buscarCombinacaoVencedora(campos);
		}		}
	
	public OpcoesDoJogo getCampo31() {
		return campo31;
	}
	public void inserirNoCampo31(Jogada jogada, Regras regras, Campos campos) {
		if (this.campo31 == null && regras.getResultado() == null){
			this.campo31 = jogada.getOpcaoDeJogo();
			regras.buscarCombinacaoVencedora(campos);
		}	
	}
	
	public OpcoesDoJogo getCampo32() {
		return campo32;
	}
	public void inserirNoCampo32(Jogada jogada, Regras regras, Campos campos) {
		if (this.campo32 == null && regras.getResultado() == null){
			this.campo32 = jogada.getOpcaoDeJogo();
			regras.buscarCombinacaoVencedora(campos);
		}		
	}
	
	public OpcoesDoJogo getCampo33() {
		return campo33;
	}
	public void inserirNoCampo33(Jogada jogada, Regras regras, Campos campos) {
		if (this.campo33 == null && regras.getResultado() == null){
			this.campo33 = jogada.getOpcaoDeJogo();
			regras.buscarCombinacaoVencedora(campos);
		}		}
	
	
	
}
	
	
