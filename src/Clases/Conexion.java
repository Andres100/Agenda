package Clases;

import java.sql.*;

public class Conexion {
   /**Parametros de conexion*/
   static String bd = "denuncia";
   static String login = "root";
   static String password = "";
   static String url = "jdbc:mysql://localhost/"+bd;
 
   Connection connection = null;
 
   public Conexion() {
      try{
         Class.forName("com.mysql.jdbc.Driver");
         connection = DriverManager.getConnection(url,login,password);
 
         if (connection!=null){
            System.out.println("Conexión a base de datos "+bd+" OK\n");
         }
      }
      catch(SQLException e){
         System.out.println(e);
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }catch(Exception e){
         System.out.println(e);
      }
   }
   /**Permite retornar la conexión*/
   public Connection getConnection(){
      return connection;
   }
 
   public void desconectar(){
      connection = null;
   }
}