
public class Customer
{
	private int CUSTOMER_ID;
	private String CUST_FIRST_NAME, CUST_LAST_NAME, CUST_STREET_ADDRESS1, CUST_STREET_ADDRESS2;
	private String CUST_CITY,CUST_STATE,CUST_POSTAL_CODE,PHONE_NUMBER1,PHONE_NUMBER2,CUST_EMAIL;
	private double CREDIT_LIMIT;
	
	
	public static String getTableHeader()
	{
		 
		String header = "<thead>";
		header += "<tr class=\"success\">";
		header += "<th>ID</th>";
		header += "<th>First Name</th>";
		header += "<th>Last Name</th>";
		header += "<th>Address 1</th>";
		header += "<th>Address 2</th>";
		header += "<th>City</th>";
		header += "<th>State</th>";
		header += "<th>Postal Code</th>";
		header += "<th>Phone 1</th>";
		header += "<th>Phone 2</th>";
		header += "<th>Credit Limit</th>";
		header += "<th>Email</th>";
		header +="</tr>";
		header +="</thead>";
		
		return header;
	}
	public int getCUSTOMER_ID()
	{
		return CUSTOMER_ID;
	}
	public void setCUSTOMER_ID(int cUSTOMER_ID)
	{
		CUSTOMER_ID = cUSTOMER_ID;
	}
	public String getCUST_FIRST_NAME()
	{
		return CUST_FIRST_NAME;
	}
	public void setCUST_FIRST_NAME(String cUST_FIRST_NAME)
	{
		CUST_FIRST_NAME = cUST_FIRST_NAME;
	}
	public String getCUST_LAST_NAME()
	{
		return CUST_LAST_NAME;
	}
	public void setCUST_LAST_NAME(String cUST_LAST_NAME)
	{
		CUST_LAST_NAME = cUST_LAST_NAME;
	}
	public String getCUST_STREET_ADDRESS1()
	{
		return CUST_STREET_ADDRESS1;
	}
	public void setCUST_STREET_ADDRESS1(String cUST_STREET_ADDRESS1)
	{
		CUST_STREET_ADDRESS1 = cUST_STREET_ADDRESS1;
	}
	public String getCUST_STREET_ADDRESS2()
	{
		return CUST_STREET_ADDRESS2;
	}
	public void setCUST_STREET_ADDRESS2(String cUST_STREET_ADDRESS2)
	{
		CUST_STREET_ADDRESS2 = cUST_STREET_ADDRESS2;
	}
	public String getCUST_CITY()
	{
		return CUST_CITY;
	}
	public void setCUST_CITY(String cUST_CITY)
	{
		CUST_CITY = cUST_CITY;
	}
	public String getCUST_STATE()
	{
		return CUST_STATE;
	}
	public void setCUST_STATE(String cUST_STATE)
	{
		CUST_STATE = cUST_STATE;
	}
	public String getCUST_POSTAL_CODE()
	{
		return CUST_POSTAL_CODE;
	}
	public void setCUST_POSTAL_CODE(String cUST_POSTAL_CODE)
	{
		CUST_POSTAL_CODE = cUST_POSTAL_CODE;
	}
	public String getPHONE_NUMBER1()
	{
		return PHONE_NUMBER1;
	}
	public void setPHONE_NUMBER1(String pHONE_NUMBER1)
	{
		PHONE_NUMBER1 = pHONE_NUMBER1;
	}
	public String getPHONE_NUMBER2()
	{
		return PHONE_NUMBER2;
	}
	public void setPHONE_NUMBER2(String pHONE_NUMBER2)
	{
		PHONE_NUMBER2 = pHONE_NUMBER2;
	}
	public String getCUST_EMAIL()
	{
		return CUST_EMAIL;
	}
	public void setCUST_EMAIL(String cUST_EMAIL)
	{
		CUST_EMAIL = cUST_EMAIL;
	}
	public double getCREDIT_LIMIT()
	{
		return CREDIT_LIMIT;
	}
	public void setCREDIT_LIMIT(double cREDIT_LIMIT)
	{
		CREDIT_LIMIT = cREDIT_LIMIT;
	}
	
	
}
