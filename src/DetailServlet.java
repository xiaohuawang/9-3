import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.DBCustomer;
import model.DemoCustomer;

@WebServlet("/details") 
public class DetailServlet extends HttpServlet
{
	private String tableInfo="";

	public void init() throws ServletException
	{
		
	}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//set response content type
		response.setContentType("text/html");
		
		//actual logic goes here
		
		String custIdStr = request.getParameter("customerID");
		Long custId = Long.parseLong(custIdStr);
//		DB db = new DB();
		DemoCustomer customer = DBCustomer.getCustomer(custId);
		
		String data = "";
		data += "<div class=\"panel-heading\">";

		data += customer.getCustFirstName();
		data +=" ";
		data += customer.getCustLastName();
		data += "</div>";
		
		data += "<div class=\"panel-body\">";
		
		data += "<p> Adress1: ";
		data += customer.getCustStreetAddress1();
		data += "</p>";
		data += "<p> Adress2: ";
		data += customer.getCustStreetAddress2();
		data += "</p>  ";
		data += "<p> City: ";
		data += customer.getCustCity();
		data += "</p>";
		data += "<p> State: ";
		data += customer.getCustState();
		data += "</p>";
		data += "<p> Zip Code: ";
		data += customer.getCustPostalCode();
		data += "</p>";
		data += "<p> Email: ";
		data += customer.getCustEmail();
		data += "</p>";
		data += "<p> Phone1: ";
		data += customer.getPhoneNumber1();
		data += "</p>";
		data += "<p> Phone2: ";
		data += customer.getPhoneNumber2();
		data += "</p>";
		data += "</div>";
		request.setAttribute("custTable", data);
		
		getServletContext().getRequestDispatcher("/details.jsp").forward(request, response);
	}
	
	public void destroy()
	{
		//do nothing
	}
}
