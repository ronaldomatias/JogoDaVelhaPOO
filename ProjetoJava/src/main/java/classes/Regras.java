package classes;

public class Regras {
	private boolean venceuLinhaHorizontal1;
	private boolean venceuLinhaHorizontal2;
	private boolean venceuLinhaHorizontal3;
	private boolean venceuLinhaVertical1;
	private boolean venceuLinhaVertical2;
	private boolean venceuLinhaVertical3;
	private boolean venceuLinhaCruzada1;
	private boolean venceuLinhaCruzada2;
	private OpcoesDoJogo resultado;
	private Integer nomeVencedor = 0;
	private Integer nomePerdedor = 0;
	private String empate = "Empate";
	
	
	public void buscarCombinacaoVencedora(Campos campos) {

		if (campos.campo11 == OpcoesDoJogo.X && campos.campo12 == OpcoesDoJogo.X && campos.campo13 == OpcoesDoJogo.X
				|| campos.campo11 == OpcoesDoJogo.O && campos.campo12 == OpcoesDoJogo.O
						&& campos.campo13 == OpcoesDoJogo.O) {

			this.venceuLinhaHorizontal1 = true;
			this.resultado = campos.campo11;
		} 
		
		else if (campos.campo21 == OpcoesDoJogo.X && campos.campo22 == OpcoesDoJogo.X
				&& campos.campo23 == OpcoesDoJogo.X
				|| campos.campo21 == OpcoesDoJogo.O && campos.campo22 == OpcoesDoJogo.O
						&& campos.campo23 == OpcoesDoJogo.O) {

			this.venceuLinhaHorizontal2 = true;
			this.resultado = campos.campo21;
		}
		else if (campos.campo31 == OpcoesDoJogo.X && campos.campo32 == OpcoesDoJogo.X && campos.campo33 == OpcoesDoJogo.X
				|| campos.campo31 == OpcoesDoJogo.O && campos.campo32 == OpcoesDoJogo.O && campos.campo33 == OpcoesDoJogo.O) {

			this.venceuLinhaHorizontal3 = true;
			this.resultado = campos.campo31;
			
		}
		else if (campos.campo11 == OpcoesDoJogo.X && campos.campo21 == OpcoesDoJogo.X && campos.campo31 == OpcoesDoJogo.X
				|| campos.campo11 == OpcoesDoJogo.O && campos.campo21 == OpcoesDoJogo.O && campos.campo31 == OpcoesDoJogo.O) {

			this.venceuLinhaVertical1 = true;
			this.resultado = campos.campo11;
		}
		else if (campos.campo12 == OpcoesDoJogo.X && campos.campo22 == OpcoesDoJogo.X && campos.campo32 == OpcoesDoJogo.X
				|| campos.campo12 == OpcoesDoJogo.O && campos.campo22 == OpcoesDoJogo.O && campos.campo32 == OpcoesDoJogo.O) {

			this.venceuLinhaVertical2 = true;
			this.resultado = campos.campo12;
		}
		else if (campos.campo13 == OpcoesDoJogo.X && campos.campo23 == OpcoesDoJogo.X && campos.campo33 == OpcoesDoJogo.X
				|| campos.campo13 == OpcoesDoJogo.O && campos.campo23 == OpcoesDoJogo.O && campos.campo33 == OpcoesDoJogo.O) {
			this.venceuLinhaVertical3 = true;
			this.resultado = campos.campo13;
		}
		else if (campos.campo11 == OpcoesDoJogo.X && campos.campo22 == OpcoesDoJogo.X && campos.campo33 == OpcoesDoJogo.X
				|| campos.campo11 == OpcoesDoJogo.O && campos.campo22 == OpcoesDoJogo.O && campos.campo33 == OpcoesDoJogo.O) {

			this.venceuLinhaCruzada1 = true;
			this.resultado = campos.campo11;
		} 
		else if (campos.campo13 == OpcoesDoJogo.X && campos.campo22 == OpcoesDoJogo.X && campos.campo31 == OpcoesDoJogo.X
				|| campos.campo13 == OpcoesDoJogo.O && campos.campo22 == OpcoesDoJogo.O && campos.campo31 == OpcoesDoJogo.O) {

			this.venceuLinhaCruzada2 = true;
			this.resultado = campos.campo13;
		}

	}


	public void atribuirOpcoesDeJogo(Jogador jogadorX, Jogador jogadorO) {
		jogadorX.setOpcoesDoJogo(OpcoesDoJogo.X);
		jogadorO.setOpcoesDoJogo(OpcoesDoJogo.O);
	}

	public void atribuirResultados(Jogador playerX, Jogador playerO) {
		
		if (playerX.getOpcoesDoJogo().equals(resultado)){
			playerX.setVitorias(1);
			this.nomeVencedor = playerX.getId();
			this.nomePerdedor = playerO.getId();
			this.empate = "Não";
			playerO.setDerrotas(1);
		}
		
		else if (playerO.getOpcoesDoJogo().equals(resultado)) {
			playerO.setVitorias(1);
			this.nomeVencedor = playerO.getId();
			this.nomePerdedor = playerX.getId();
			this.empate = "Não";
			playerX.setDerrotas(1);
		}
		
		else {
			playerX.setEmpates(1);
			playerO.setEmpates(1);
			this.empate = "Empate";
		}
	}
	
	
	
	
	
	
	
	public void setNomeVencedor(Integer nomeVencedor) {
		this.nomeVencedor = nomeVencedor;
	}

	public Integer getNomeVencedor() {
		return nomeVencedor;
	}
	
	public OpcoesDoJogo getResultado() {
		return resultado;
	}

	public boolean getVenceuLinhaHorizontal1() {
		return venceuLinhaHorizontal1;
	}
	public boolean getVenceuLinhaHorizontal2() {
		return venceuLinhaHorizontal2;
	}
	public boolean getVenceuLinhaHorizontal3() {
		return venceuLinhaHorizontal3;
	}
	public boolean getVenceuLinhaVertical1() {
		return venceuLinhaVertical1;
	}
	public boolean getVenceuLinhaVertical2() {
		return venceuLinhaVertical2;
	}
	public boolean getVenceuLinhaVertical3() {
		return venceuLinhaVertical3;
	}
	public boolean getVenceuLinhaCruzada1() {
		return venceuLinhaCruzada1;
	}
	public boolean getVenceuLinhaCruzada2() {
		return venceuLinhaCruzada2;
	}

	public Integer getNomePerdedor() {
		return nomePerdedor;
	}
	public void setNomePerdedor(Integer nomePerdedor) {
		this.nomePerdedor = nomePerdedor;
	}

	public String getEmpate() {
		return empate;
	}
	public void setEmpate(String empate) {
		this.empate = empate;
	}

	
	
	
}
