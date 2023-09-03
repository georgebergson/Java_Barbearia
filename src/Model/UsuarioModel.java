/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author user
 */
public class UsuarioModel extends PessoaModel {
    private String senha;
    private String nivel_acesso;

    public UsuarioModel(int id, String nome,String senha) {
        super(id, nome);
    }

    public UsuarioModel(int id, String nome, char sexo, String data_nascimento, String telefone, String email, String rg, String senha, String nivel_acesso) throws ParseException {
        super(id, nome, sexo, data_nascimento, telefone, email, rg);
        this.senha = senha;
        this.nivel_acesso = nivel_acesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivel_acesso() {
        return nivel_acesso;
    }

    public void setNivel_acesso(String nivel_acesso) {
        this.nivel_acesso = nivel_acesso;
    }
    
    


   
    
    
}
