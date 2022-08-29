package stepDefinitions.dataBaseStepDefinitions;

import utilities.DBUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class set_DataBase_StepDefinition {




    static final String DB_URL = "jdbc:postgresql://medunna.com:5432/medunna_db";
    static final String USER = "medunna_user";
    static final String PASS = "medunna_pass_987";
    static final String QUERY = "select email from public.jhi_user";

    public static void main(String[] args) {
        System.out.println(DBUtils.getColumnData(QUERY,"email"));
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        ) {
            String sql = "UPDATE  public.jhi_user " +
                    "SET email = mtatis@gmail.com WHERE id=159437 ";
            stmt.executeUpdate(sql);
            ResultSet rs = stmt.executeQuery(QUERY);
            while(rs.next()){
                //Display values
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", email: " + rs.getInt("email"));

            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

