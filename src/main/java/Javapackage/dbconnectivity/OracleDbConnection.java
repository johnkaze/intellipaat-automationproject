package Javapackage.dbconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleDbConnection {

    Connection connection;
    String oracleDriver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521/orclpdb";
    String userName = "hr";
    String password = "hr";

    String query = "Select * from Countries";

    Connection getConnection() {
        try {
            Class.forName(oracleDriver);
            connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection is success");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    void getCountries() {
        try {
            connection = getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String countryId = rs.getString(1);
                if (countryId.equalsIgnoreCase("in")) {
                    System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getInt(3));
                    System.out.println("Country id for India is IN and it is validated.");
                } else {
                    System.out.println("Country id for India is not matched.");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    void getEmployees() {
        try {
            Class.forName(oracleDriver);
            connection = DriverManager.getConnection(url, userName, password);
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from employees");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getDate(6));
            }

        } catch (ClassNotFoundException e) {
            System.out.println("In catch1 block");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("In catch2 block");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("In catch3 block");
            e.printStackTrace();
        } finally {
            try {
                System.out.println("In finally block");
                connection.close();
            } catch (NullPointerException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]) {
        OracleDbConnection obj = new OracleDbConnection();
        //obj.getConnection();
        obj.getCountries();
        //obj.getEmployees();
    }


}