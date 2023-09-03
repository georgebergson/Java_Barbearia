/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.UsuarioModel;
import View.Login;
import View.MenuPrincipal;

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
       
       UsuarioDAO usuariodao = new UsuarioDAO();
       UsuarioModel usuarioautenticado = usuariodao.selectPorNomeESenha(usuario);
       
       if(usuarioautenticado != null){
           MenuPrincipal menuprincipal = new MenuPrincipal();
           menuprincipal.setVisible(true);
           loginview.dispose();
       }else{
           loginview.mensagem("Usuario ou senha Invalidos");
       }
       
    }

}
