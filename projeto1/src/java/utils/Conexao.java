package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {

    public Connection abrirConexao() throws SQLException, ClassNotFoundException {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/bd_projeto_clinica_web", "postgres", "admin");
        } catch (SQLException ex) {
            throw new SQLException("Erro de conexão com o banco de dados");
        } catch (ClassNotFoundException ex) {
            throw new ClassNotFoundException("Driver do banco de dados não encontrado");
        }
    }

    private void encerrar(Connection conexao, PreparedStatement stmt, ResultSet rs) throws SQLException {
        try {
            if (conexao != null) {
                conexao.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            throw new SQLException("Erro ao encerrar conexão com o banco de dados");
        }
    }

    public void encerrarConexao(Connection conexao, PreparedStatement stmt) throws SQLException {
        encerrar(conexao, stmt, null);
    }

    public void encerrarConexao(Connection conexao, PreparedStatement stmt, ResultSet rs) throws SQLException {
        encerrar(conexao, stmt, rs);
    }
}
