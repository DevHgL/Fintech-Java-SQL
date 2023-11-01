package br.com.fiap.mercado.view;

public class Transacao {
    private int id;
    private int idConta; // ID da conta associada à transação.
    private String data;
    private String descricao;
    private double valor;
    private static int totalTransacoes;

    public Transacao(int idConta, String data, String descricao, double valor) {
        Transacao.totalTransacoes++;
        this.id = Transacao.totalTransacoes;
        this.idConta = idConta;
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {

        this.idConta = idConta;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public static int getTotalTransacoes() {        return totalTransacoes;
    }

    public static void setTotalTransacoes(int totalTransacoes) {
        Transacao.totalTransacoes = totalTransacoes;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Transacao [id=" + id + ", idConta=" + idConta + ", data=" + data + ", descricao=" + descricao + ", valor=" + valor + "]";
    }
}