package dao;
import java.sql.*;
//Database connection method
public class DB {
public static Connection getCon(){
	Connection con=null;
        String user = "root";
        String pass ="root";
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elibrarysys",user,pass);
		
	}catch(Exception e){System.out.println(e);}
	return con;
}
}