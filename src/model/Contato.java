/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Andreia
 */
public class Contato {

    private int codigo;
    private String nome;
    private String email;

    public Contato() {
    }

    public Contato(Integer id, String nome, String email) {
        this.codigo = id;
        this.nome = nome;
        this.email = email;
    }

    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}

