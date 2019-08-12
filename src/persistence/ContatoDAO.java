/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Contato;

/**
 *
 * @author Andreia
 */
public class ContatoDAO {

    private static ContatoDAO instance = new ContatoDAO();

    public static ContatoDAO getInstance() {
        return instance;
    }

    private ContatoDAO() {
    }

    public int GravarContato(Contato cont) throws SQLException, ClassNotFoundException {
        PreparedStatement ps = null;
        Connection conn = null;
        int id = 0;

        try {
            conn = Conexao.getInstance().getConnection();
            String sql = "insert into cantserv_teste.contatos_caelum values ('" + cont.getCodigo() + "','" + cont.getNome() + "','"
                    + cont.getEmail() + "')";


            ps = conn.prepareStatement(sql);
            ps.execute();

            return id;

        } catch (SQLException e) {
            throw e;

        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
            }
        }
    }

    public Contato Select(Integer id) throws ClassNotFoundException, SQLException, Exception {
        PreparedStatement ps = null;
        Connection conn = null;
        ResultSet rs = null;

        try {
            conn = Conexao.getInstance().getConnection();
            String sql = "select * from cantserv_teste.contatos_caelum where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (!rs.next()) {
                throw new Exception("Não foi encontrado nenhum" + "registro com Código: " + id);
            }

            String nome = rs.getString(2);
            String email = rs.getString(3);

            return new Contato(id, nome, email);
        } catch (SQLException e) {
            throw e;

        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
            }
        }
    }

    public void Update(Contato cont) throws ClassNotFoundException, SQLException {
        PreparedStatement ps = null;
        Connection conn = null;

        try {
            conn = Conexao.getInstance().getConnection();
            String sql = "update cantserv_teste.contatos_caelum set nome = ?, email = ? where codigo = ?";

            ps = conn.prepareStatement(sql);
            ps.setString(1, cont.getNome());
            ps.setString(2, cont.getEmail());
            ps.setInt(3, cont.getCodigo());
            ps.execute();


        } catch (SQLException e) {
            throw e;

        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
            }
        }
    }

    public void Delete(int idContato) throws ClassNotFoundException, SQLException {
        PreparedStatement ps = null;
        Connection conn = null;

        try {
            conn = Conexao.getInstance().getConnection();
            String sql = "DELETE FROM cantserv_teste.contatos_caelum WHERE codigo = " + idContato;
            ps = conn.prepareStatement(sql);
            ps.execute();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
            }
        }
    }

    public List<Contato> todosContatos() throws ClassNotFoundException, SQLException {
        Statement ps = null;

        Connection conn = null;
        ResultSet rs = null;

        List<Contato> list = new ArrayList<Contato>();
        String sql = "select * from cantserv_teste.contatos_caelum";
        Contato contato = null;

        try {
            conn = Conexao.getInstance().getConnection();
            ps = conn.createStatement();
            rs = ps.executeQuery(sql);

            while (rs.next()) {
                contato = new Contato();
                contato.setCodigo(new Integer(rs.getInt("codigo")));
                contato.setNome(rs.getString("nome"));
                contato.setEmail(rs.getString("email"));

                list.add(contato);
            }
            
            return list;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {                
            }
        }
    }
}
