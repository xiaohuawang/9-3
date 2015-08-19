import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet
{
	private String custTable="";
	
	public void init() throws ServletException
	{
		DB db = new DB();
		// do required initialization
		 ArrayList<Customer> customers = db.getCustomers();
		 custTable += Customer.getTableHeader();
		 for(Customer customer : customers)
		 {
			  custTable += "<tr>";
			  custTable += "<td>";
			  custTable += "<a href=\"details?customerID="+ customer.getCUSTOMER_ID() +"\">" + customer.getCUSTOMER_ID() + "<//a>";
			  custTable += "</td>";
			  custTable += "<td>";
			  custTable += customer.getCUST_FIRST_NAME();
			  custTable += "</td>";
			  custTable += "<td>";
			  custTable += customer.getCUST_LAST_NAME();
			  custTable += "</td>";
			  custTable += "<td>";
			  custTable += customer.getCUST_STREET_ADDRESS1();
			  custTable += "</td>";
			  custTable += "<td>";
			  custTable += customer.getCUST_STREET_ADDRESS2();
			  custTable += "</td>";
			  custTable += "<td>";
			  custTable += customer.getCUST_CITY();
			  custTable += "</td>";
			  custTable += "<td>";
			  custTable += customer.getCUST_STATE();
			  custTable += "</td>";
			  custTable += "<td>";
			  custTable += customer.getCUST_POSTAL_CODE();
			  custTable += "</td>";
			  custTable += "<td>";
			  custTable += customer.getPHONE_NUMBER1();
			  custTable += "</td>";
			  custTable += "<td>";
			  custTable += customer.getPHONE_NUMBER2();
			  custTable += "</td>";
			  custTable += "<td>";
			  custTable += customer.getCREDIT_LIMIT();
			  custTable += "</td>";
			  custTable += "<td>";
			  custTable += customer.getCUST_EMAIL();
			  custTable += "</td>";
			  custTable += "</tr>";
		 }
		 System.out.println("custTable = " + custTable);
	}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//set response content type
		response.setContentType("text/html");
		
		//actual logic goes here
		request.setAttribute("custTable", custTable);
		
		getServletContext().getRequestDispatcher("/customer.jsp").forward(request, response);
	}
	
	public void destroy()
	{
		//do nothing
	}
}
