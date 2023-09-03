/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.UsuarioModel;
import View.Login;
import java.util.Arrays;

/**
 *
 * @author user
 */
public class LoginHelper {

    private final Login loginview;
    public LoginHelper(Login loginview) {
        this.loginview = loginview;
    }
    
    public UsuarioModel obterModelo(){
        String usuario = loginview.getTxfUsuario().getText();
        char[] senha = loginview.getTxfSenha().getPassword();
        
        UsuarioModel usuariomodelo = new UsuarioModel(0,usuario,senha);
        return usuariomodelo;
    }
    
    public void setarModel(UsuarioModel usuariomodelo){
        String usuario = usuariomodelo.getNome();
        char[] senha = usuariomodelo.getSenha();
        
        loginview.getTxfUsuario().setText(usuario);
        loginview.getTxfSenha().setText(Arrays.toString(senha));
    }
    
    public void limparTela(){
        loginview.getTxfUsuario().setText("");
        loginview.getTxfSenha().setText("");
    }

    
    
}
