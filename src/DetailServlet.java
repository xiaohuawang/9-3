import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		String custId = request.getParameter("customerID");
		
		DB db = new DB();
		Customer customer = db.getCustomerFromID(Integer.parseInt(custId));
		
		String data = "";
		data += "<div class=\"panel-heading\">";

		data += customer.getCUST_FIRST_NAME();
		data +=" ";
		data += customer.getCUST_LAST_NAME();
		data += "</div>";
		
		data += "<div class=\"panel-body\">";
		
		data += "<p> Adress1: ";
		data += customer.getCUST_STREET_ADDRESS1();
		data += "</p>";
		data += "<p> Adress2: ";
		data += customer.getCUST_STREET_ADDRESS2();
		data += "</p>  ";
		data += "<p> City: ";
		data += customer.getCUST_CITY();
		data += "</p>";
		data += "<p> State: ";
		data += customer.getCUST_STATE();
		data += "</p>";
		data += "<p> Zip Code: ";
		data += customer.getCUST_POSTAL_CODE();
		data += "</p>";
		data += "<p> Email: ";
		data += customer.getCUST_EMAIL();
		data += "</p>";
		data += "<p> Phone1: ";
		data += customer.getPHONE_NUMBER1();
		data += "</p>";
		data += "<p> Phone2: ";
		data += customer.getPHONE_NUMBER2();
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
