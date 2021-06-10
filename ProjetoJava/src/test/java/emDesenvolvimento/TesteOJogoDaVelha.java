package emDesenvolvimento;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import classes.Campos;
import classes.ConexaoBD;
import classes.Jogada;
import classes.Jogador;
import classes.OpcoesDoJogo;
import classes.Regras;

public class TesteOJogoDaVelha {

	@Test
	public void testeCadastroNovoJogador() throws Exception {
		ConexaoBD conexao = new ConexaoBD();
		Jogador playerX = new Jogador("Apresentacao");
		playerX.setId(48892);
		conexao.cadastrarJogador(playerX);
	}
	
	@Test
	public void testeJogadorJ·Cadastrado() throws Exception {
		ConexaoBD conexao = new ConexaoBD();
		Jogador playerX = new Jogador("Apresentacao");
		playerX.setId(48892);
		conexao.cadastrarJogador(playerX);
	}

	@Test
	public void testeOpcoesDoJogo() throws Exception {
		Jogador playerX = new Jogador("Peter");
		Jogador playerO = new Jogador("Tosh");
		
		Regras regras = new Regras();
		regras.atribuirOpcoesDeJogo(playerX, playerO);
		
		assertEquals(OpcoesDoJogo.X, playerX.getOpcoesDoJogo());
		assertEquals(OpcoesDoJogo.O, playerO.getOpcoesDoJogo());
	}
	
	@Test
	public void testeSobreporJogadaNoCampo() throws Exception {
		
		Jogador playerX = new Jogador("Peter");
		Jogador playerO = new Jogador("Tosh");
		
		Regras regras = new Regras();
		regras.atribuirOpcoesDeJogo(playerX, playerO);
		
		Jogada jogadaDoPlayerX = new Jogada(playerX);
		Jogada jogadaDoPlayerO = new Jogada(playerO);
		
		Campos campos = new Campos();
		
		campos.inserirNoCampo11(jogadaDoPlayerX, regras, campos);
		campos.inserirNoCampo11(jogadaDoPlayerO, regras, campos);
		
		assertEquals(OpcoesDoJogo.X, campos.getCampo11());
	}
	
	@Test
	public void testeEmpateNoJogo() throws Exception {
		Jogador playerX = new Jogador("Mac");
		playerX.setId(1246);
		Jogador playerO = new Jogador("Tosh");
		playerO.setId(20025);
		
		Regras regras = new Regras();
		regras.atribuirOpcoesDeJogo(playerX, playerO);
		
		Jogada jogadaDoPlayerX = new Jogada(playerX);
		Jogada jogadaDoPlayerO = new Jogada(playerO);
		
		Campos campos = new Campos();

		campos.inserirNoCampo12(jogadaDoPlayerX, regras, campos);
		campos.inserirNoCampo11(jogadaDoPlayerO, regras, campos);
		campos.inserirNoCampo13(jogadaDoPlayerX, regras, campos);
		campos.inserirNoCampo22(jogadaDoPlayerO, regras, campos);
		campos.inserirNoCampo21(jogadaDoPlayerX, regras, campos);
		campos.inserirNoCampo23(jogadaDoPlayerO, regras, campos);
		campos.inserirNoCampo33(jogadaDoPlayerX, regras, campos);
		campos.inserirNoCampo32(jogadaDoPlayerO, regras, campos);
		campos.inserirNoCampo31(jogadaDoPlayerX, regras, campos);
		
		regras.atribuirResultados(playerX, playerO);
		
		assertEquals(Integer.valueOf(0), regras.getNomeVencedor());
		assertEquals(Integer.valueOf(0), regras.getNomePerdedor());
		assertEquals("Empate", regras.getEmpate());
		
		System.out.println(campos.campo11 +" "+ campos.campo12 +" "+ campos.campo13);
		System.out.println(campos.campo21 +" "+ campos.campo22 +" "+ campos.campo23);
		System.out.println(campos.campo31 +" "+ campos.campo32 +" "+ campos.campo33);
	}
	
	@Test
	public void testeJogadorOvence() throws Exception {
		Jogador playerX = new Jogador("Deys");
		playerX.setId(2214);
		Jogador playerO = new Jogador("Man");
		playerO.setId(2005);
		
		Regras regras = new Regras();
		regras.atribuirOpcoesDeJogo(playerX, playerO);
		
		Jogada jogadaDoPlayerX = new Jogada(playerX);
		Jogada jogadaDoPlayerO = new Jogada(playerO);
		
		Campos campos = new Campos();
		campos.inserirNoCampo22(jogadaDoPlayerX, regras, campos);
		campos.inserirNoCampo11(jogadaDoPlayerO, regras, campos);
		campos.inserirNoCampo13(jogadaDoPlayerX, regras, campos);
		campos.inserirNoCampo21(jogadaDoPlayerO, regras, campos);
		campos.inserirNoCampo23(jogadaDoPlayerX, regras, campos);
		campos.inserirNoCampo33(jogadaDoPlayerO, regras, campos);
		campos.inserirNoCampo12(jogadaDoPlayerX, regras, campos);
		campos.inserirNoCampo31(jogadaDoPlayerO, regras, campos);
		campos.inserirNoCampo32(jogadaDoPlayerX, regras, campos);

		regras.atribuirResultados(playerX, playerO);
		
		assertTrue(regras.getVenceuLinhaVertical1());
		assertEquals(playerO.getId(), regras.getNomeVencedor());
		assertEquals(playerX.getId(), regras.getNomePerdedor());
		assertEquals("N„o", regras.getEmpate());
		
		System.out.println(campos.campo11 +" "+ campos.campo12 +" "+ campos.campo13);
		System.out.println(campos.campo21 +" "+ campos.campo22 +" "+ campos.campo23);
		System.out.println(campos.campo31 +" "+ campos.campo32 +" "+ campos.campo33);
	}

	@Test
	public void testeJogadorXvence() throws Exception {
		Jogador playerX = new Jogador("Den");
		playerX.setId(377);
		Jogador playerO = new Jogador("Lapid");
		playerO.setId(199254);
		
		Regras regras = new Regras();
		regras.atribuirOpcoesDeJogo(playerX, playerO);

		Jogada jogadaDoPlayerX = new Jogada(playerX);
		Jogada jogadaDoPlayerO = new Jogada(playerO);
		
		
		Campos campos = new Campos();
		campos.inserirNoCampo22(jogadaDoPlayerX, regras, campos);
		campos.inserirNoCampo11(jogadaDoPlayerO, regras, campos);
		campos.inserirNoCampo13(jogadaDoPlayerX, regras, campos);
		campos.inserirNoCampo21(jogadaDoPlayerO, regras, campos);
		campos.inserirNoCampo32(jogadaDoPlayerX, regras, campos);
		campos.inserirNoCampo33(jogadaDoPlayerO, regras, campos);
		campos.inserirNoCampo12(jogadaDoPlayerX, regras, campos);
		campos.inserirNoCampo23(jogadaDoPlayerO, regras, campos);
		campos.inserirNoCampo31(jogadaDoPlayerX, regras, campos);
		
		regras.atribuirResultados(playerX, playerO);
		
		assertTrue(regras.getVenceuLinhaVertical2());
		assertEquals(playerX.getId(), regras.getNomeVencedor());
		assertEquals(playerO.getId(), regras.getNomePerdedor());
		assertEquals("N„o", regras.getEmpate());
		
		System.out.println(campos.campo11 +" "+ campos.campo12 +" "+ campos.campo13);
		System.out.println(campos.campo21 +" "+ campos.campo22 +" "+ campos.campo23);
		System.out.println(campos.campo31 +" "+ campos.campo32 +" "+ campos.campo33);
	}

	@Test
	public void testeTransferirPartidaParaOBanco() throws Exception {
		ConexaoBD conexao = new ConexaoBD();
		Jogador playerX = new Jogador("Aps");
		playerX.setId(21421);
		conexao.cadastrarJogador(playerX);
		Jogador playerO = new Jogador("Aps2");
		playerO.setId(251521);
		conexao.cadastrarJogador(playerO);
		
		Regras regras = new Regras();
		regras.atribuirOpcoesDeJogo(playerX, playerO);
		
		Jogada jogadaDoPlayerX = new Jogada(playerX);
		Jogada jogadaDoPlayerO = new Jogada(playerO);
		
		Campos campos = new Campos();
		
		campos.inserirNoCampo22(jogadaDoPlayerX, regras, campos);
		campos.inserirNoCampo11(jogadaDoPlayerO, regras, campos);
		campos.inserirNoCampo13(jogadaDoPlayerX, regras, campos);
		campos.inserirNoCampo21(jogadaDoPlayerO, regras, campos);
		campos.inserirNoCampo32(jogadaDoPlayerX, regras, campos);
		campos.inserirNoCampo33(jogadaDoPlayerO, regras, campos);
		campos.inserirNoCampo12(jogadaDoPlayerX, regras, campos);
		campos.inserirNoCampo23(jogadaDoPlayerO, regras, campos);
		campos.inserirNoCampo31(jogadaDoPlayerX, regras, campos);
		
		regras.atribuirResultados(playerX, playerO);
		
		conexao.enviarResultadosJogador(playerX, regras);
		conexao.enviarResultadosJogador(playerO, regras);
		
		if (regras.getEmpate() == "Empate"){
			conexao.enviarEmpates(playerO);
			conexao.enviarEmpates(playerX);
		}
		conexao.enviarResultadoPartida(playerX.getId(), playerO.getId(), regras.getNomeVencedor(), regras.getNomePerdedor(), regras.getEmpate());
		
		System.out.println(campos.campo11 +" "+ campos.campo12 +" "+ campos.campo13);
		System.out.println(campos.campo21 +" "+ campos.campo22 +" "+ campos.campo23);
		System.out.println(campos.campo31 +" "+ campos.campo32 +" "+ campos.campo33);

	}


}
	
