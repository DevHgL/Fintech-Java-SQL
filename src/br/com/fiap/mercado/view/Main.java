package br.com.fiap.mercado.view;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
    private static final String DB_USER = "seu_usuario";
    private static final String DB_PASSWORD = "sua_senha";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            createTables(conn);

            // Resto do seu código para manipular contas e transações
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTables(Connection conn) throws SQLException {
        String createContasTable = "CREATE TABLE IF NOT EXISTS Contas ("
                + "id INT PRIMARY KEY AUTO_INCREMENT,"
                + "nome VARCHAR(255),"
                + "email VARCHAR(255) UNIQUE,"
                + "senha VARCHAR(255)"
                + ");";

        String createTransacoesTable = "CREATE TABLE IF NOT EXISTS Transacoes ("
                + "id INT PRIMARY KEY AUTO_INCREMENT,"
                + "id_conta INT,"
                + "data DATE,"
                + "descricao VARCHAR(255),"
                + "valor DECIMAL(10, 2),"
                + "FOREIGN KEY (id_conta) REFERENCES Contas(id)"
                + ");";

        try (PreparedStatement statement = conn.prepareStatement(createContasTable)) {
            statement.execute();
        }

        try (PreparedStatement statement = conn.prepareStatement(createTransacoesTable)) {
            statement.execute();
        }
    }

    // Resto do seu código para manipular contas e transações
    
    
}
