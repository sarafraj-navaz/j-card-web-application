package com.jsp.jcart_web_app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.jcart_web_app.service.ProductOwnerService;

@SuppressWarnings("serial")
@WebServlet(value ="/unverify")
public class AdminUnverifyProductOwnerController  extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		new ProductOwnerService().verifyProductOwnerByIdService(Integer.parseInt(req.getParameter("ownerid")));
		
		req.getRequestDispatcher("unverify-owner.jsp").forward(req, resp);
	}
  }
 
