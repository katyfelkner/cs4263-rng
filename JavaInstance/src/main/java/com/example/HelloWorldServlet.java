package com.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(urlPatterns = {"/*"}, loadOnStartup = 1)
public class HelloWorldServlet extends HttpServlet 
{
  @Override 
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException
  {
    Random rand = new Random(); 
      response.getOutputStream().print("" + rand.nextInt(1000000));
  }
}
