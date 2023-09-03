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
public class ClienteModel extends PessoaModel {
    private String endereco;
    private String cep;

    public ClienteModel(int id, String nome) {
        super(id, nome);
    }

    public ClienteModel(int id, String nome, char sexo, String data_nascimento,  String cep, String email, String rg,  String endereco,  String telefone) throws ParseException {
        super(id, nome, sexo, data_nascimento, telefone, email, rg);
        this.endereco = endereco;
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    

    
}
