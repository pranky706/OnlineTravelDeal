package org.Servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Merchant_registration_servlet
 */
@WebServlet("/Merchant_registration_servlet")
public class Merchant_registration_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Merchant_registration_servlet() {
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
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub\
		Random r =new Random();
		String name=req.getParameter("name");
		String gender=req.getParameter("gender");
		String phn=req.getParameter("Phn_number");
		String em=req.getParameter("email");
		String pass=req.getParameter("password");
		DataAccess d;
		try {
			d = new DataAccess();
			String email1=d.selectemail1(em);
			if(email1==null)
			{
				Merchant c=new Merchant(r.nextInt(),name,gender,phn,em,pass);
				d.validate(c);
				res.sendRedirect("registration_done_merchant.jsp");
			}
			else
			{
				res.sendRedirect("registration_notdone_merchant.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
