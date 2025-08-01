package Joao_rosa_projeto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        String url = "jdbc:mysql://localhost:3306/cadastro_pessoas"; // diferentes urls para cada tipo de banco
        String user = "root"; // Verificar root da maquina em uso
        String password ="univille"; // verificar Senha do banco em uso
        try {
            Connection con = DriverManager.getConnection(url,user,password);
            System.out.println("Concectou");
            Statement st = con.createStatement();
            String sql = "insert into pessoas(nome,cpf) values('senna', '123456789');";
            st.execute(sql);
        } catch (SQLException e){
            System.out.println("deu erro");
            e.printStackTrace();
        }
    }
}
