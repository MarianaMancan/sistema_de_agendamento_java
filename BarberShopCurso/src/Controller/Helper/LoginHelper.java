/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Models.Usuario;
import view.Login;

/**
 *
 * @author Mariana
 */
public class LoginHelper implements IHelper {
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public Usuario obterModelo(){
      String nome = view.getTxt_user().getText();
      String senha = view.getTxt_password().getText();
        
      Usuario modelo = new Usuario(0,nome,senha);
      
      return modelo;
    }
    
    public void setarModelo(Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getTxt_user().setText(nome);
        view.getTxt_password().setText(senha);
    }
    
    public void limparTela(){
        view.getTxt_user().setText("");
        view.getTxt_password().setText("");
    }
}
