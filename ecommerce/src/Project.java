
import java.sql.*;
public class Project {
	public static void main(String[]args)throws Exception{
		delete();
	}
	public static void getConnectivity() throws SQLException {
		String url="jdbc:mysql://127.0.0.1:3306/Ecommerce";
		String username="root";
		String password="2002";
		String Query="insert into amazon values(?,?,?,?,?,?)";
		
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.setInt(1,10);
		pst.setString(2,"Baby wipes");
		pst.setInt(3,1);
		pst.setString(4,"144 g");
		pst.setString(5,"18%");
		pst.setInt(6,262);
		pst.executeUpdate();
		con.close();
	}

public static void select() throws SQLException{
	String url="jdbc:mysql://127.0.0.1:3306/Ecommerce";
	String username="root";
	String password="2002";
	String Query="select*from amazon where productid=1";
    
	Connection con=DriverManager.getConnection(url,username,password);
	Statement smt=con.createStatement();
	ResultSet rs=smt.executeQuery(Query);
	while(rs.next()) {
		String display=rs.getString("productname");
		int iteam=rs.getInt("productamount");
		System.out.println("name:" +display);
		System.out.println("price:"+iteam);
		}
	con.close();
}


public static void selectall() throws SQLException{
	String url="jdbc:mysql://127.0.0.1:3306/Ecommerce";
	String username="root";
	String password="2002";
	String Query="select*from amazon ";
	
	Connection con=DriverManager.getConnection(url,username,password);
	Statement smt=con.createStatement();
	ResultSet rs=smt.executeQuery(Query);
	while(rs.next()) {
		System.out.println("ID:"+rs.getInt(1));
		System.out.println("name:"+rs.getString(2));
		System.out.println("item:"+rs.getInt(3));
		System.out.println("weight:"+rs.getString(4));
		System.out.println("discout:"+rs.getString(5));
		System.out.println("amount:"+rs.getInt(6));
	}
    con.close();	
}

    public static void update() throws SQLException{
	String url="jdbc:mysql://127.0.0.1:3306/Ecommerce";
	String username="root";
	String password="2002";
	String Query="update amazon set productname='crocs' where productid=6";
	Connection con=DriverManager.getConnection(url,username,password);
	PreparedStatement pst = con.prepareStatement(Query);
	int shop=pst.executeUpdate();
	System.out.println(shop);
	con.close();
    }
    
    public static void delete() throws SQLException{
	String url="jdbc:mysql://127.0.0.1:3306/Ecommerce";
	String username="root";
	String password="2002";
	String Query="delete from amazon where productid=7";
	Connection con=DriverManager.getConnection(url,username,password);
	PreparedStatement pst = con.prepareStatement(Query);
	int shop=pst.executeUpdate();
	System.out.println(shop);
	con.close();
    }
    }
    