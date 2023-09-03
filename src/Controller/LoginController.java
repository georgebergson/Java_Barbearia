/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.UsuarioModel;
import View.Login;

/**
 *
 * @author user
 */
public class LoginController {

    private final Login loginview;
    private final LoginHelper loginhelper;
    public LoginController(Login loginview){
        this.loginview = loginview;
        this.loginhelper = new LoginHelper(loginview);
    }
    
    public void entrarNoSistema(){
       UsuarioModel usuario = loginhelper.obterModelo();
       
        System.out.println(usuario.getNome());
    }

}
