package cm.victormodjo.mvviewdesk.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {

    /*
    * fichier de configuration de la base donnée locale
    * */

    public static Connection con = null;

    public static Connection connect(){
        try{
            Class.forName("org.sqlite.JDBC");
            con =  DriverManager.getConnection("jdbc:sqlite:config");
            Statement stmt = con.createStatement();

            String req = """
                    CREATE TABLE IF NOT EXISTS website(
                        idw_ PRIMARY KEY AUTOINCREMENT,
                        namew_  TEXT NOT NULL UNIQUE,
                        linkw_ TEXT NOT NULL
                    );
                    """;
            stmt.execute(req);

        } catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }

        return con;
    }
}
