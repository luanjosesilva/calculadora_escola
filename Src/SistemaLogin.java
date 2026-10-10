package Src;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SistemaLogin {
    
    private static final String URL = "jdbc:mysql://localhost:3306/sistema_login";
    private static final String USUARIO = "root";
    private static final String SENHA = "Luan8530";


    public static java.sql.Connection conectar() {

        try {

            java.sql.Connection conexao = java.sql.DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conexão realizada com sucesso!");
            return conexao;

        } catch (java.sql.SQLException e) {

            System.out.println("Erro ao tentar conectar ao banco de dados: " + e.getMessage());
            return null;

        }

    }

    public static void cadastrarUsuario(String usuario, String senha) {

        String sql = "INSERT INTO usuarios (usuario, senha) VALUES (?, ?)";

        try (Connection conexao = conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, usuario);
            stmt.setString(2, senha);

            stmt.executeUpdate();
            System.out.println("Usuário cadastrado com sucesso");
            
        } catch (SQLException e) {

            System.out.println("Erro ao cadastrar o usuário: " + e.getMessage());

        }

    }


}
