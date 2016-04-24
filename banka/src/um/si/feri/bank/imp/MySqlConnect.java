package um.si.feri.bank.imp;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;

public class MySqlConnect{
public static void main(String[] args){}
Connection conn = null;
Statement stmt = null;
	 public MySqlConnect(){
		  conn = null;
		  try{
		   String userName = "adminA9T9Yqu";
		   String password = "MBF_bJJB3gBS";
		   String url = "jdbc:mysql://127.12.116.2:3306/projektsoa/";
		   Class.forName ("com.mysql.jdbc.Driver").newInstance ();
		   conn = DriverManager.getConnection(url, userName, password);
		   //STEP 4: Execute a query
		      System.out.println("Creating statement...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "SELECT id_stranka, ime, priimek, TRR";
		      ResultSet rs = stmt.executeQuery(sql);

		      //STEP 5: Extract data from result set
		      while(rs.next()){
		         //Retrieve by column name
		         int id  = rs.getInt("id_stranka");
		         String ime = rs.getString("ime");
		         String priimek = rs.getString("priimek");
		         String trr = rs.getString("TRR");

		         //Display values
		         System.out.println("ID: " + id);
		         System.out.println(", Age: " + ime);
		         System.out.println(", First: " + priimek);
		         System.out.println(", Last: " + trr);
		 }}
		  catch(Exception e){
		   System.out.println("Exception found");
		  }
		 }
		 public Connection getConnection(){
		  return conn;
		 }
		 public void closeConnection(){
		  try{
		   conn.close ();
		  }catch (Exception e) {
		   System.out.println ("Connection close error");
		  }
		 }
			
}