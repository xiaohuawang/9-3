//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.Properties;
//
//
//
//public class DB 
//{
//	public static Connection getConnection() throws SQLException 
//	{
//	    //URL of Oracle database server
//		try
//		{
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//		} catch (ClassNotFoundException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	  	String url = "jdbc:oracle:thin:testuser/password@localhost";
//	    //properties for creating connection to Oracle database
//	    Properties props = new Properties();
//	    props.setProperty("user", "testdb");
//	    props.setProperty("password", "password");
//	  
//	    //creating connection to Oracle database using JDBC
//	    Connection conn = DriverManager.getConnection(url,props);
//    
//	    return conn;
//	}
//	
//	public Customer getCustomerFromID(int id)
//	{
//		Customer customer = new Customer();
//		String sql = "SELECT * FROM demo_customers WHERE CUSTOMER_ID =" + id;
//		
//		ResultSet result = selectSQL(sql);
//		
//		try
//		{
//			while(result.next())
//			{
//       		 customer.setCREDIT_LIMIT(result.getDouble("CREDIT_LIMIT"));
//       		 customer.setCUST_CITY(result.getString("CUST_CITY"));
//       		 customer.setCUST_EMAIL(result.getString("CUST_EMAIL"));
//       		 customer.setCUST_FIRST_NAME(result.getString("CUST_FIRST_NAME"));
//       		 customer.setCUST_LAST_NAME(result.getString("CUST_LAST_NAME"));
//       		 customer.setCUST_POSTAL_CODE(result.getString("CUST_POSTAL_CODE"));
//       		 customer.setCUST_STATE(result.getString("CUST_STATE"));
//       		 customer.setCUST_STREET_ADDRESS1(result.getString("CUST_STREET_ADDRESS1"));
//       		 customer.setCUST_STREET_ADDRESS2(result.getString("CUST_STREET_ADDRESS2"));
//       		 customer.setCUSTOMER_ID(result.getInt("CUSTOMER_ID"));
//       		 customer.setPHONE_NUMBER1(result.getString("PHONE_NUMBER1"));
//       		 customer.setPHONE_NUMBER2(result.getString("PHONE_NUMBER2"));
//			}
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		
//		return customer;
//	}
//	
//	public  ArrayList<Customer> getCustomers()
//	{
//		
//		ArrayList<Customer> customers = new ArrayList<Customer>();
//        String sql = "select * from demo_customers" ;
//        String resultStr = "";
//        //creating PreparedStatement object to execute query
//        ResultSet result = selectSQL(sql);
//        try
//        {
//        	 while(result.next())
//             {
//        		 Customer customer = new Customer();
//        		 customer.setCREDIT_LIMIT(result.getDouble("CREDIT_LIMIT"));
//        		 customer.setCUST_CITY(result.getString("CUST_CITY"));
//        		 customer.setCUST_EMAIL(result.getString("CUST_EMAIL"));
//        		 customer.setCUST_FIRST_NAME(result.getString("CUST_FIRST_NAME"));
//        		 customer.setCUST_LAST_NAME(result.getString("CUST_LAST_NAME"));
//        		 customer.setCUST_POSTAL_CODE(result.getString("CUST_POSTAL_CODE"));
//        		 customer.setCUST_STATE(result.getString("CUST_STATE"));
//        		 customer.setCUST_STREET_ADDRESS1(result.getString("CUST_STREET_ADDRESS1"));
//        		 customer.setCUST_STREET_ADDRESS2(result.getString("CUST_STREET_ADDRESS2"));
//        		 customer.setCUSTOMER_ID(result.getInt("CUSTOMER_ID"));
//        		 customer.setPHONE_NUMBER1(result.getString("PHONE_NUMBER1"));
//        		 customer.setPHONE_NUMBER2(result.getString("PHONE_NUMBER2"));
//        		 
//        		 customers.add(customer);
//             }
//        }
//        catch(Exception e)
//        {
//        	e.printStackTrace();
//        }
//       
//		
//		return customers;
//	}
//	
//
//	
//	public ResultSet selectSQL(String sql)
//	{
//		Connection conn = null;
//		ResultSet result = null;
//		try
//		{
//			conn =  DB.getConnection();
//			PreparedStatement preStatement = conn.prepareStatement(sql);
//			result = preStatement.executeQuery();
//		} catch (SQLException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return result;
//	}
//}
