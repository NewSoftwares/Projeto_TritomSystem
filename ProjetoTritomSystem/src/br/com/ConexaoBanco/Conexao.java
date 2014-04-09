package br.com.ConexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Caio
 */
public class Conexao {

    public static String status = "Não conectou...";     
    
    public Conexao() {
    }

    public static Connection getConexao() {
        Connection connection = null;
        try {
            return connection;
        } catch (Exception ex) {
           return null;
        }
    }
}
