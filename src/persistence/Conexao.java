/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Andreia
 */
public class Conexao {

    private static Conexao instance = new Conexao();

    public static Conexao getInstance() {
        return instance;
    }

    private Conexao() {
    }

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn =
                DriverManager.getConnection("jdbc:mysql://cpanel0065.hospedagemdesites.ws/cantserv_teste", "cantserv_root", "rt5678");

        return conn;
    }
}
