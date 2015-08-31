import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.DBCustomer;
import model.DemoCustomer;
@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet
{
	private String custTable="";
	
	public void init() throws ServletException
	{
//		DB db = new DB();
		// do required initialization
		 List<DemoCustomer> customers = DBCustomer.getAllCustomers();
		 custTable += DemoCustomer.getTableHeader();
		 for(DemoCustomer customer : customers)
		 {
			  custTable += "<tr>";
			  custTable += "<td>";
			  custTable += "<a href=\"details?customerID="+ customer.getCustomerId() +"\">" + customer.getCustomerId() + "<//a>";
			  custTable += "</td>";
			  custTable += "<td>";
			  custTable += customer.getCustFirstName();
			  custTable += "</td>";
			  custTable += "<td>";
			  custTable += customer.getCustLastName();
			  custTable += "</td>";
			  custTable += "<td>";
			  custTable += customer.getCustStreetAddress1();
			  custTable += "</td>";
			  custTable += "<td>";
			  custTable += customer.getCustStreetAddress2();
			  custTable += "</td>";
			  custTable += "<td>";
			  custTable += customer.getCustCity();
			  custTable += "</td>";
			  custTable += "<td>";
			  custTable += customer.getCustState();
			  custTable += "</td>";
			  custTable += "<td>";
			  custTable += customer.getCustPostalCode();
			  custTable += "</td>";
			  custTable += "<td>";
			  custTable += customer.getPhoneNumber1();
			  custTable += "</td>";
			  custTable += "<td>";
			  custTable += customer.getPhoneNumber2();
			  custTable += "</td>";
			  custTable += "<td>";
			  custTable += customer.getCreditLimit();
			  custTable += "</td>";
			  custTable += "<td>";
			  custTable += customer.getCustEmail();
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
