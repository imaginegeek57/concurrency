package ru.job4j.middle.servlets.HttpExample;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UserServlet extends HttpServlet {

    private User user;
    private ValidateService validateService;

    private final ValidateService logic = validateService.getInstace();

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html;charset=UTF-8");


    }



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();

        int id = 0;

        try {
            String action = req.getParameter("action");
            System.out.println(action);

            switch (action) {
                case "add": logic.add(user);
                    break;
                case "update": logic.update(id, user);
                    break;
                case "delete": logic.delete(user);
                    break;
                default:
                    throw new Exception();
            }

            writer.println("<html>");
            writer.println("<head>");
            writer.println("<title>User page</title>");
            writer.println("</head>");
            writer.println("<body>");

            writer.print("<p>" + action + "</p>");

        } catch (Exception e) {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
            e.printStackTrace();
        } finally {
            writer.println("</body");
            writer.println("</html>");
            writer.close();
        }

    }
}
