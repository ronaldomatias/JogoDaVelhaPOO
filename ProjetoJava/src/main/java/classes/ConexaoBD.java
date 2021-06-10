package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConexaoBD {
	private boolean jogadorExisteNoBanco;
	   
	   
	   public Connection conectar() throws SQLException {
	       return DriverManager.getConnection("jdbc:postgresql://localhost:5433/APS", "postgres", "3242");
	   }

	   public void enviarResultadoPartida(Integer jogadorX, Integer jogadorO, Integer vencedor, Integer perdedor, String empate) throws SQLException {
			Connection conexao = conectar();
			PreparedStatement transferirDados = conexao.prepareStatement(
					"INSERT INTO partida VALUES (DEFAULT, '"+jogadorX+"', '"+jogadorO+"', '" + vencedor + "', '" + perdedor + "', '" + empate + "');");
			transferirDados.execute();
			transferirDados.close();
			conexao.close();
		}
	   
	   public void cadastrarJogador(Jogador jogador) throws SQLException {
		   Connection conexao = conectar();
		   Statement stm = conexao.createStatement();
		   ResultSet resultado = stm.executeQuery("SELECT * from jogador");
		   
		   this.jogadorExisteNoBanco = false;
		   
		   //VERIFICAR SE JOGADOR JÁ EXISTE NA TABELA
		   while(this.jogadorExisteNoBanco == false && resultado.next()){
				   
			   Integer id_tabela = resultado.getInt(1);
			   
			   if (jogador.getId().equals(id_tabela)) {
				   this.jogadorExisteNoBanco = true;
				   System.out.println("Jogador "+jogador.getId()+" já cadastrado");
				}
		   }
		   
		   if(this.jogadorExisteNoBanco == false) {
			   PreparedStatement transferirDados = conexao.prepareStatement("INSERT INTO jogador (id_jogador, nome, vitorias, derrotas, empates) VALUES ('"+jogador.getId()+"','"+jogador.getNomeDoJogador()+"', "+jogador.getVitorias()+", "+jogador.getDerrotas()+", "+jogador.getEmpates()+"); ");
		       transferirDados.execute();
		   	   transferirDados.close();
			   System.out.println("Jogador "+jogador.getId()+" cadastrado com sucesso");
		   }
		   conexao.close();
		   }
	   
	   public void enviarResultadosJogador(Jogador jogador, Regras regras) throws SQLException {
		   Connection conexao = conectar();
			   PreparedStatement transferirVitorias = conexao.prepareStatement("update jogador set vitorias = vitorias +"+jogador.getVitorias()+" where id_jogador ="+regras.getNomeVencedor()+";");
			   
			   PreparedStatement transferirDerrotas = conexao.prepareStatement("update jogador set derrotas = derrotas +"+jogador.getDerrotas()+" where id_jogador ="+regras.getNomePerdedor()+";");
			   
			   transferirDerrotas.execute();
			   transferirVitorias.execute();
			   transferirDerrotas.close();
		   	   transferirVitorias.close();

		   conexao.close();
		   }
	   
	   public void enviarEmpates(Jogador jogador) throws SQLException {
		   Connection conexao = conectar();
		   PreparedStatement transferirEmpates = conexao.prepareStatement("update jogador set empates = empates +"+jogador.getEmpates()+" where id_jogador ="+jogador.getId()+";");
		   
		   transferirEmpates.execute();
		   transferirEmpates.close();
		   conexao.close();
	   }
	   
	   public boolean getJogadorExisteNoBanco() {
			return jogadorExisteNoBanco;
		}
	   
   
}