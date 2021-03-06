package org.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Fetch_Merchant_Details_Servlet
 */
@WebServlet("/Fetch_Merchant_Details")
public class Fetch_Merchant_Details_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Fetch_Merchant_Details_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession s=req.getSession();
		String email=(String) s.getAttribute("name1");
		ArrayList<MerchantDeals> a;
		try {
			if(email!="pu")
			{
				DataAccess d=new DataAccess();
				a=d.selectMerchant(email);
				String name=d.selectname(email);
				s.setAttribute("Array",a);
				s.setAttribute("name2",name);
				res.sendRedirect("Merchant_Home.jsp");
			}
			else
			{
				res.sendRedirect("error4.html");
			}
		
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
