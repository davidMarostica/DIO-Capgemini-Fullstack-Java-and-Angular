package part3;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

    // Construtor privado para evitar instâncias
    private ConnectionFactory() {
        throw new UnsupportedOperationException();
    }

    public static Connection getConnection() {
        Connection connection = null;

        try (InputStream input = ConnectionFactory.class.getClassLoader().getResourceAsStream("connection.properties")) {
            Properties prop = new Properties();
            prop.load(input);

            // Carrega os parâmetros do arquivo de propriedades
            String driverClass = prop.getProperty("jdbc.driver");
            String dataBaseAddress = prop.getProperty("db.address");
            String dataBaseName = prop.getProperty("db.name");
            String user = prop.getProperty("db.user.login");
            String password = prop.getProperty("db.user.password");

            // Carrega o driver explicitamente
            Class.forName(driverClass);

            // Monta a URL de conexão corretamente
            String connectionUrl = "jdbc:mysql://" + dataBaseAddress + ":3306/" + dataBaseName;

            // Cria a conexão
            connection = DriverManager.getConnection(connectionUrl, user, password);

        } catch (Exception e) {
            System.out.println("❌ FALHA ao tentar criar conexão com o banco de dados!");
            e.printStackTrace();
        }

        return connection;
    }
}
