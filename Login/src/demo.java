import java.sql.*;
public class demo {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/demo";
		String uname = "root";
		String pass ="0000";
		String query = "select * from student";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
			Connection con = DriverManager.getConnection(url, uname, pass);
			Statement st = con.createStatement();
		    ResultSet rs =st.executeQuery(query);
		    
		    
		    while(rs.next()) {
		    	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		    }
			
		
		

	}


}
