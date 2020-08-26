package ar.org.centro8.curso.java.connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connector {
private static String driver="com.mysql.jdbc.Driver";
private static String vendedor="mysql";
private static String server="localhost";
private static String port="3306";
private static String db="fashion_color";
private static String params="";
private static String user="root";
private static String pass="";
private static String url="jdbc:"+vendedor+"://"+server+":"+port+"/"+db+params;

private static Connection conn=null;
 private Connector(){}
public synchronized static Connection getConnection(){
        try{
            if(conn==null || conn.isClosed()){
                Class.forName(driver);
                conn= DriverManager.getConnection(url,user,pass);
            }
        }catch(Exception e){ e.printStackTrace(); }
        return conn;
    }

    public static ResultSet getTable(String Consulta){
    Connection conn =getConnection();
    Statement st;
    ResultSet datos=null;
     try{
        st=conn.createStatement();
        datos=st.executeQuery(Consulta);
     }
     catch(Exception e) {System.out.println(e.toString());}
     return datos;
 }  
}
