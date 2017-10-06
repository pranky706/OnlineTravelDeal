package org.Servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class select_all_deals_servlet
 */
@WebServlet("/select_all_deals_servlet")
public class select_all_deals_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public select_all_deals_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			DataAccess da=new DataAccess();
			
			HttpSession s=request.getSession();
			String e=(String) s.getAttribute("name3");
			ArrayList<Deals> list=da.selectdeals(e);
			s.setAttribute("DLIST", list);
			response.sendRedirect("Dealshow.jsp");
			
		/*	request.setAttribute("DLIST",list);
			RequestDispatcher rd=request.getRequestDispatcher("Dealshow.jsp");
			rd.forward(request, response);	*/
			
		} catch (SQLException e) {
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
