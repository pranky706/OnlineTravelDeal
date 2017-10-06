package org.Servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Customer_registration_servlet
 */
@WebServlet("/Customer_registration_servlet")
public class Customer_registration_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customer_registration_servlet() {
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
		// TODO Auto-generated method stub
		Random r =new Random();
		String name=req.getParameter("name");
		String add=req.getParameter("address");
		String gender=req.getParameter("gender");
		String phn=req.getParameter("Phn_number");
		String em=req.getParameter("email");
		String pass=req.getParameter("password");
		String sq=req.getParameter("squestion");
		String sa=req.getParameter("sanswer");
		DataAccess d;
		try {
			d = new DataAccess();
			String email1=d.selectemail(em);
			if(email1==null)
			{
				Customer c=new Customer(r.nextInt(),name,add,gender,phn,em,pass,sq,sa);
				d.validate(c);
				res.sendRedirect("registration_done.jsp");
			}
			else
			{
				res.sendRedirect("registration_notdone.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
