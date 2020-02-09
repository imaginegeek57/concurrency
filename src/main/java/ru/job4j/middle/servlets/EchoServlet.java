package ru.job4j.middle.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class EchoServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter writer = res.getWriter();

        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>");
        writer.println("Hello World!");
        writer.println("</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>");
        writer.println("Hello World!");
        writer.println("</h1>");
        writer.println("</body");
        writer.println("</html>");
    }
}

