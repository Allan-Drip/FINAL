
package br.edu.login.poo;


public class Login {
    private String nome, senha , email;

    public Login(String senha, String email) {
        this.senha = senha;
        this.email = email;
    }

    public Login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public void cadastrar (String senha, String email, String nome){
this.nome = nome;
this.senha = senha;
this.email = email;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


 }


