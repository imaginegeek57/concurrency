package ru.job4j.middle.servlets.HttpExample;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UserServlet extends HttpServlet {

    private User user;
    private ValidateService validateService = ValidateService.getInstance();

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();

        StringBuilder sb = new StringBuilder("<table>");
        for (User user : validateService.userList) {
            sb.append("<tr><td>" + user + "</td><tr>");
        }
        sb.append("</table>");

        writer.append("<!DOCTYPE html>" +
                "<html lang=\"en\">" +
                "<head>" +
                "<meta charset=\"UTF-8\">" +
                "<title>User Page</title>" +
                "</head>" +
                "<body>" +
                "<form action='" + req.getContextPath() + "/users' method='post'>" +
                "Name : <input type=text' name='users'/>" +
                "<input type='submit'>" +
                "</form>" +
                "<br>" +
                sb.toString() +
                "</body>" +
                "</html>"
        );
        writer.flush();
    }


    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String users = req.getParameter("users");
        PrintWriter writer = resp.getWriter();
        writer.append("hi "+ users);
        doGet(req, resp);
    }
}
