package DAO;
/** ARIJIT GUHA*/
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class tables {

    public static void main(String args[]) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            //st.executeQuery("insert into pharmacy(input,username,password)values(1,'admin','admin');");
            //st.executeUpdate("create table pharmacy(input int AUTO_INCREMENT primary key,username varchar(20) not null,password varchar(20) not null);");
            //st.executeUpdate("create table medicine (medicine_pk int AUTO_INCREMENT primary key,medicine_id varchar(20),name varchar(30),company_name varchar(40),price_per_unit bigint,quantity bigint);");
            st.executeUpdate("create table bill (bill_pk int AUTO_INCREMENT primary key,billId varchar(30),billDate varchar(20),totalPaid bigint,generatedBy varchar(40));");
            JOptionPane.showMessageDialog(null, "TABLE CREATED SUCCESSFULLY");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }
}
