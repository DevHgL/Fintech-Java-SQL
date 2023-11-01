package br.com.fiap.mercado.view;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private final int id;
    private String nome;
    private String email;
    private String senha;
    private boolean logado; // Novo campo para rastrear o status de login.
    private static int total;
    private final List<Transacao> transacoes;

    public Conta(String nome, String email, String senha) {
        Conta.total++;
        this.id = Conta.total;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.logado = false; // Inicialmente, o usuário não está logado.
        this.transacoes = new ArrayList<>();
    }

    public static int getTotal() {
        return total;
    }

    public int getId() {
        return id;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isLogado() {
        return logado;
    }

    public void fazerLogin(String senha) {
        if (this.senha.equals(senha)) {
            logado = true;
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Senha incorreta. Login falhou.");
        }
    }

    public void fazerLogout() {
        logado = false;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void adicionarTransacao(Transacao transacao) {
        transacoes.add(transacao);
    }

    @Override
    public String toString() {
        return "Conta [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + "]";
    }
}
