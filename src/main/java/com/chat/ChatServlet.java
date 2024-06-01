package com.chat;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/name")
public class ChatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
	        res.setContentType("text/html");
	        req.getRequestDispatcher("index.html").forward(req,res);
	}
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		String name = req.getParameter("name");
        Name n = new Name();
        n.setName(name);
        NameDB ndb = new NameDB();
        ndb.main(n);
    }
}