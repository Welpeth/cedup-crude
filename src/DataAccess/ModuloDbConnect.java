package DataAccess;

import java.sql.*;

public class ModuloDbConnect {
    
    // Criando o metodo connector responsavel pela conexão
    public static Connection connector() {
        // Criando a variavel que controlarah o sucesso da conexao.
        java.sql.Connection conexao = null; // contem o status da conexao.
        // Definir a variável do Driver a ser usado
        // jdbc:mariadb://localhost:3310/dblogin
        String driver = "com.mysql.jdbc.Driver";
        // Definir as demais variaveis da conexao: endereco/banco, usario e senha
        String url = "jdbc:mysql://127.0.0.1:3306/dblogin";
        String user = "root";
        String senha = null;
        // Estabelecer a conexao com o banco
        try {
            // Carregar na memoria o driver
            Class.forName(driver);
            // Executar a conecao
            conexao = DriverManager.getConnection(url,user,senha);
            return conexao;
        }catch (Exception varERRO){
            // debug do ERRO da conexao e seu retorno com "null"
            System.out.println("O ERRO da conexao eh: " + varERRO.toString());
            return null;
        }
    }
}
