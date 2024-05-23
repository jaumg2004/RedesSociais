package org.example;

import java.util.HashSet;

public class Usuario {

    private String nome;
    private String email;
    private HashSet<RedeSocial> redeSociais = new HashSet<>();

    public Usuario(HashSet<RedeSocial> redeSociais) {
        this.redeSociais = redeSociais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public HashSet<RedeSocial> getRedeSociais() {
        return redeSociais;
    }

    public void setRedeSociais(HashSet<RedeSocial> redeSociais) {
        this.redeSociais = redeSociais;
    }
}
