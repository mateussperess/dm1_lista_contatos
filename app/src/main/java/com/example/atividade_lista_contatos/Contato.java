package com.example.atividade_lista_contatos;

public class Contato {
    private String nome;
    private String email;
    private String numero;
    private int foto;

    public Contato(String nome, String email, String numero, int foto) {
        this.nome = nome;
        this.email = email;
        this.numero = numero;
        this.foto = foto;
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
