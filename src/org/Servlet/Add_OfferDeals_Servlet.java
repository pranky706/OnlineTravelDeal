package org.Servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Add_OfferDeals_Servlet
 */
@WebServlet("/Add_OfferDeals_Servlet")
public class Add_OfferDeals_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add_OfferDeals_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Random r=new Random();
		int id=r.nextInt();
		String title=req.getParameter("title");
		String location=req.getParameter("loc");
		String description=req.getParameter("des");
		String food=req.getParameter("fcost");
		int foodcost=Integer.parseInt(food);
		String travel=req.getParameter("tcost");
		int travelcost=Integer.parseInt(travel);
		String image=req.getParameter("image");
		HttpSession s=req.getSession();
		MerchantDeals ma=(MerchantDeals) s.getAttribute("HotelDetails");
		String semail=(String) s.getAttribute("name3");
		String memail=ma.getEmail();
		String validf=ma.getValidfrom();
		String validt=ma.getValidto();
		int lodgecost=ma.getPrice();
		Deals deals=new  Deals(id,title,location,validf,validt,description,foodcost,lodgecost,travelcost,semail,memail,image,0,0,0);
		try {
			DataAccess d=new DataAccess();
			d.adddeals(deals);
			response.sendRedirect("Salesman_Home.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
