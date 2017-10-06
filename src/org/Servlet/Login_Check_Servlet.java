package org.Servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login_Check_Servlet
 */
@WebServlet("/Login_Check_Servlet")
public class Login_Check_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_Check_Servlet() {
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
		try {
			DataAccess d=new DataAccess();
			String c=d.select(email, pass);
			HttpSession s=req.getSession();
			s.setAttribute("email1",email);
			String email2=(String) s.getAttribute("email1");
			if(c!=null)
			{
				if(email2!="pu")
				{
					s.setAttribute("name1",c);
					int id=(int) s.getAttribute("ID");
					Deals da=d.select4(id);
					s.setAttribute("Deal",da);
					res.sendRedirect("Customer_Home.jsp");
				}
				else
				{
					res.sendRedirect("error4.html");
				}
			}
			else
				res.sendRedirect("error.html");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
