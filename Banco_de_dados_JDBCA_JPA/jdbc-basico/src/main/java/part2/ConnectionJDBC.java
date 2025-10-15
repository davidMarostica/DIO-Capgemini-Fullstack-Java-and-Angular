package part2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {

    public static void main(String[] args) {

        // 1 - Carregar o driver do MySQL
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver MySQL não encontrado!");
            e.printStackTrace();
            return;
        }

        // 2 - Definir parâmetros de conexão
        String dataBaseAddress = "localhost";
        String dataBaseName = "digital_innovation_one";
        String user = "david";       // ou "root", se preferir
        String password = "123";     // ou a senha correta do root

        // 3 - Construir a URL de conexão
        String connectionUrl = "jdbc:mysql://" + dataBaseAddress + ":3306/" + dataBaseName;

        // 4 - Tentar conectar
        try (Connection conn = DriverManager.getConnection(connectionUrl, user, password)) {
            System.out.println("✅ SUCESSO ao se conectar ao banco MySQL!");
        } catch (SQLException e) {
            System.out.println("❌ FALHA ao se conectar ao banco MySQL!");
            e.printStackTrace();
        }
    }
}
