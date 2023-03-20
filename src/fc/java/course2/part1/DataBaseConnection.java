package fc.java.course2.part1;

import fc.java.model2.Connection;
import fc.java.model2.MSSQLDriver;
import fc.java.model2.MySQLDriver;
import fc.java.model2.OracleDriver;

public class DataBaseConnection {
    public static void main(String[] args) {
        // oracle DB 접속
        Connection conn=new OracleDriver();
        conn.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");

        // mysql DB 접속
        conn=new MySQLDriver();
        conn.getConnection("jdbc:mysql://localhost:3306/test","root","12345");

        // mssql DB 접속
        conn=new MSSQLDriver();
        conn.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=mem","sa","12345");

    }
}
