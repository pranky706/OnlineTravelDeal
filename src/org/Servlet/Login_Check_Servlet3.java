package org.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login_Check_Servlet3
 */
@WebServlet("/Login_Check_Servlet3")
public class Login_Check_Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_Check_Servlet3() {
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
		String email=req.getParameter("email");
		String pass=req.getParameter("password");
		HttpSession s=req.getSession();
		s.setAttribute("email1",email);
		String email2=(String) s.getAttribute("email1");
		if(email2!="pu")
		{
			if(email.equals("admin") && pass.equals("admin"))
			{
				res.sendRedirect("Customer1.jsp");
			}
			else
			{
				res.sendRedirect("error8.html");
			}
		}
		else
		{
			res.sendRedirect("error7.html");
		}
	}

}
