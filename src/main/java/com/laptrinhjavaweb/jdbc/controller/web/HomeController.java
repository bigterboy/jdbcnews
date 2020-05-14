package com.laptrinhjavaweb.jdbc.controller.web;

import com.laptrinhjavaweb.jdbc.model.UserModel;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/trang-chu", "/dang-nhap" })
public class HomeController extends HttpServlet {

  /**
   *
   */
  private static final long serialVersionUID = -8074144989011785807L;

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    UserModel userModel = new UserModel();
    userModel.setUserName("asdf");
    userModel.setFullName("TRƯƠNG PHAN QUÍ");

    request.setAttribute("model",userModel);

    RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
    rd.forward(request, response);
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }
}