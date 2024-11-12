package DataAccess;

import java.sql.*;

public class ModuloDbConnect {
    //Criando o metodo connector resposavel pela conexão
    public static Connection connector() {
        // Criando a variavel que controlara o sucesso da conexao.
        java.sql.Connection conexao = null; // contem o status da conexão
        //Definir e chamar/carregar/load o driver java/mysql
        String driver = "com.mysql.jdbc.Driver";
        //Definir as variaveis strings para conexao com a instancia do banco
        String url = "jdbc:mysql://127.0.0.1:3310/DbLogin";
        String user = "userconn";
        String senha = "123456";
        //Estabelecer a conexao ao SGBD/banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, passsword);
            //Retornar o resultado da conexão
            return conexao;
        } catch (Exception varErro) {
            // debug do ERRO da conexão e seu retorno "null";
            //Pode-se verificar o erro com....
            System.out.println("Erro na conexao DB: " + varErro.toString());
            return null;
        }     
    }
}
