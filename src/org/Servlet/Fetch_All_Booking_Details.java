package org.Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Fetch_All_Booking_Details
 */
@WebServlet("/Fetch_All_Booking_Details")
public class Fetch_All_Booking_Details extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Fetch_All_Booking_Details() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Hotelname=request.getParameter("hotelname");
		HttpSession s=request.getSession();
		String email=(String) s.getAttribute("name1");
		try {
			if(email!="pu")
			{
				DataAccess d=new DataAccess();
				ArrayList<Bookings> a=d.getAllbookingdetails(Hotelname);
				s.setAttribute("AllBookingList",a);
				response.sendRedirect("allbookings.jsp");
			}
			else
			{
				response.sendRedirect("error3.html");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
