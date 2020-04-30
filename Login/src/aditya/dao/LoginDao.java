package aditya.dao;
import java.sql.*;
public class LoginDao {
	String query = "select * from login where uname=? and pass=?";
	String url = "jdbc:mysql://localhost:3306/demo";
	String username = "root";
	String password = "0000";
	public boolean check(String uname,String pass) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, uname);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				return true;
			}
			st.close();
			con.close();
		} 
		catch (Exception e) {
			System.out.println(e);;
		}
		return false;
	}
}  
