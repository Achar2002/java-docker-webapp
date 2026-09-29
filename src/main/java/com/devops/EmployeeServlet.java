package com.devops;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/")
public class EmployeeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Employee Management</title>");
        out.println("</head>");

        out.println("<body>");

        out.println("<h1>Employee Management System</h1>");

        out.println("<table border='1' cellpadding='10'>");

        out.println("<tr>");
        out.println("<th>ID</th>");
        out.println("<th>Name</th>");
        out.println("<th>Role</th>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>101</td>");
        out.println("<td>Rahul</td>");
        out.println("<td>DevOps Engineer</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>102</td>");
        out.println("<td>Priya</td>");
        out.println("<td>Java Developer</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>103</td>");
        out.println("<td>Arun</td>");
        out.println("<td>QA Engineer</td>");
        out.println("</tr>");

        out.println("</table>");

        out.println("</body>");
        out.println("</html>");
    }
}
